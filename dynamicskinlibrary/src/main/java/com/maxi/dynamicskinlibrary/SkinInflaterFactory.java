package com.maxi.dynamicskinlibrary;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDelegate;

import com.maxi.dynamicskinlibrary.bean.SkinAttr;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by maxi on 2020/6/9.
 */
public class SkinInflaterFactory implements LayoutInflater.Factory2 {
    public final static String NAME_SPACE = "http://schemas.android.com/android/skin";
    public final static String SKIN_KEY = "skin";
    public final static String SKIN_ENABLE = "enable";

    private static final HashMap<String, Constructor<? extends View>> sConstructorMap =
            new HashMap<String, Constructor<? extends View>>();
    //    private Map<String, SkinAttr> mSkinAttrMap = new HashMap<>();
    private WeakHashMap<String, Map<String, SkinAttr>> mSkinAttrMap = new WeakHashMap<>();
    private static final String[] mClassPrefixList = {
            "android.widget.",
            "android.view.",
            "android.webkit."
    };

    private AppCompatDelegate appCompatDelegate;

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        boolean isSkinEnable = attrs.getAttributeBooleanValue(NAME_SPACE, SKIN_ENABLE, false);
        if (!isSkinEnable) {
            return null;
        }
        View view = createViewFromTag(parent, name, context, attrs);
        if (view == null) {
            return null;
        }
        try {
            parseSkinAttr(context, attrs, view, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    private View createViewFromTag(View parent, String name, Context context, AttributeSet attrs) {
        //包含了. 自定义控件
        View view = null;
        if (appCompatDelegate != null) {
            view = appCompatDelegate.createView(parent, name, context, attrs);
        }
        if (view == null) {
            if (name.contains(".")) {
                view = createView(name, context, attrs);
            }
            for (String tag : mClassPrefixList) {
                view = createView(tag + name, context, attrs);
                if (null == view)
                    continue;
                return view;
            }
        }
        return view;
    }

    private View createView(String name, Context context, AttributeSet attrs) {
        Constructor<? extends View> constructor = sConstructorMap.get(name);
        if (null == constructor) {
            try {
                Class<? extends View> aClass = context.getClassLoader().loadClass(name).asSubclass(View.class);
                constructor = aClass.getConstructor(Context.class, AttributeSet.class);
                sConstructorMap.put(name, constructor);
            } catch (Exception e) {
            }
        }
        if (null != constructor) {
            try {
                return constructor.newInstance(context, attrs);
            } catch (Exception e) {
            }
        }
        return null;
    }

    /**
     * @param context
     * @param attrs
     * @param view
     */
    private void parseSkinAttr(Context context, AttributeSet attrs, View view, String name) {
        Map<String, String> attrMap = new HashMap<>();
        String viewFrom = "";
        for (int i = 0; i < attrs.getAttributeCount(); i++) {
            String attrName = attrs.getAttributeName(i);
            String attrValue = attrs.getAttributeValue(i);
            if (SkinDeployerFactory.SKIN_STYLE.equals(attrName)) {
                attrMap.put(attrName, attrValue);
                continue;
            }
            if (SkinDeployerFactory.SKIN_VIEW_FROM.equals(attrName)) {
                viewFrom = attrValue;
                continue;
            }
            if (!SkinDeployerFactory.isSupportedAttr(attrName)) {
                continue;
            }
            attrMap.put(attrName, attrValue);
        }
        SkinAttr skinAttr = new SkinAttr(view, viewFrom, attrMap);
        SkinManager.getInstance().doSkinAttrsDeploying(skinAttr);
        saveSkinView(skinAttr);
    }

    public void release() {
        if (sConstructorMap != null) {
            sConstructorMap.clear();
        }
        if (mSkinAttrMap != null) {
            mSkinAttrMap.clear();
        }
    }

    public void saveSkinView(SkinAttr viewAttr) {
        if (viewAttr.view == null || viewAttr == null) {
            return;
        }
        Map<String, SkinAttr> map = getSkinAttrMap(viewAttr.viewFrom) == null ?
                new HashMap<String, SkinAttr>() : getSkinAttrMap(viewAttr.viewFrom);
        String viewId = viewAttr.view.getId() + "";
        if (TextUtils.isEmpty(viewId) || viewId.equals("-1")) {
            viewAttr.view.setId(SkinViewIdUtil.generateViewId());//防止未设置Id 导致重复添加view
            viewId = viewAttr.view.getId() + "";
        }
        //防止同一个页面同一个id不同皮肤style类型的view重复
        viewId += (viewAttr.attrs.get(SkinDeployerFactory.SKIN_STYLE) == null ? "" : viewAttr.attrs.get(SkinDeployerFactory.SKIN_STYLE));
        map.put(viewId, viewAttr);
//        map.put(SkinViewIdUtil.generateViewId() + "", viewAttr);
        mSkinAttrMap.put(viewAttr.viewFrom, map);//此处的viewId只是用于防止重复添加View 没有别的用途
    }

    public void removeObservableView(String viewFrom) {
        mSkinAttrMap.remove(viewFrom);
    }

    public void removeObservableView(String viewFrom, String viewId) {
        mSkinAttrMap.get(viewFrom).remove(viewId);
    }

    public Map<String, SkinAttr> getSkinAttrMap(String viewFrom) {
        return mSkinAttrMap.get(viewFrom);
    }

    public void setAppCompatDelegate(AppCompatDelegate appCompatDelegate) {
        this.appCompatDelegate = appCompatDelegate;
    }
}
