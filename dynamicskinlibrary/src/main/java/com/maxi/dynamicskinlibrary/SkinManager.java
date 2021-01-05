package com.maxi.dynamicskinlibrary;

import android.text.TextUtils;
import android.view.View;

import androidx.annotation.Nullable;

import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;
import com.maxi.dynamicskinlibrary.bean.SkinAttr;
import com.maxi.dynamicskinlibrary.deployer.ISkinApplyDeployer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by maxi on 2020/6/9.
 */
public class SkinManager {

    private SkinInflaterFactory skinInflaterFactory;

    private SkinManager() {
    }

    private static class SingletonInstance {
        private static final SkinManager INSTANCE = new SkinManager();
    }

    public static SkinManager getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public void notifySkinChanged(String viewFrom) {
        if (skinInflaterFactory == null
                || skinInflaterFactory.getSkinAttrMap(viewFrom) == null
                || skinInflaterFactory.getSkinAttrMap(viewFrom).size() <= 0
        ) {
            return;
        }
        SkinAttr viewAttrs;
        Iterator iter = skinInflaterFactory.getSkinAttrMap(viewFrom).entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            viewAttrs = (SkinAttr) entry.getValue();
            doSkinAttrsDeploying(viewAttrs);
        }
    }

    public void setSkinInflaterFactory(SkinInflaterFactory skinInflaterFactory) {
        this.skinInflaterFactory = skinInflaterFactory;
    }

    public void doSkinAttrsDeploying(@Nullable SkinAttr skinAttr) {
        if (skinInflaterFactory == null) {
            return;
        }
        if (skinAttr == null || skinAttr.attrs == null || skinAttr.attrs.size() == 0
                || skinAttr.view == null || DynamicConfigUtil.getInstance().getSkinBean(skinAttr.viewFrom) == null
        ) {
            return;
        }
        Iterator iter = skinAttr.attrs.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String attrName = (String) entry.getKey();
            String attrValue = (String) entry.getValue();
            BaseSkinBean.SkinSetBean skinBean = DynamicConfigUtil.getInstance().getSkinBean(skinAttr.viewFrom);
            if (skinBean == null) {
                continue;
            }
            ISkinApplyDeployer deployer = SkinDeployerFactory.of(attrName);
            if (deployer != null) {
                deployer.apply(skinAttr.view, skinBean, skinAttr.attrs.get(SkinDeployerFactory.SKIN_STYLE), attrValue);
            }
        }
    }

    public void dynamicAddSkinEnableView(View view, String viewFrom, String style, String attrName, String attrValue) {
        if (skinInflaterFactory == null || TextUtils.isEmpty(style)) {
            return;
        }
        Map<String, String> attrs = new HashMap<>();
        attrs.put(SkinInflaterFactory.SKIN_ENABLE, "true");
        attrs.put(SkinDeployerFactory.SKIN_STYLE, style);
        attrs.put(attrName, attrValue);
        SkinAttr skinAttr = new SkinAttr(view, viewFrom, attrs);
        skinInflaterFactory.saveSkinView(skinAttr);
        doSkinAttrsDeploying(skinAttr);
    }

    public void dynamicAddSkinEnableView(View view, String viewFrom, String style, Map<String, String> attrMap) {
        if (skinInflaterFactory == null || TextUtils.isEmpty(style)) {
            return;
        }
        Map<String, String> attrs = new HashMap<>();
        attrs.put(SkinInflaterFactory.SKIN_ENABLE, "true");
        attrs.put(SkinDeployerFactory.SKIN_STYLE, style);
        attrs.putAll(attrMap);
        SkinAttr skinAttr = new SkinAttr(view, viewFrom, attrs);
        skinInflaterFactory.saveSkinView(skinAttr);
        doSkinAttrsDeploying(skinAttr);
    }

    public void removeSkinEnableView(String viewFrom) {
        if (TextUtils.isEmpty(viewFrom)) {
            return;
        }
        skinInflaterFactory.removeObservableView(viewFrom);
    }

    public void removeSkinEnableView(String viewFrom, String viewId) {
        if (TextUtils.isEmpty(viewId)) {
            return;
        }
        skinInflaterFactory.removeObservableView(viewFrom, viewId);
    }

}