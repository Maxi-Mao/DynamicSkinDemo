package com.maxi.dynamicskinlibrary.deployer;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;

import com.maxi.dynamicskinlibrary.SkinCommonLayoutUtil;
import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

/**
 * 背景颜色设置
 * style会有root的情况 为根布局设置背景
 * Created by maxi on 2020/6/12.
 */
public class BgColorDeployer implements ISkinApplyDeployer {

    @Override
    public void apply(View view, BaseSkinBean.SkinSetBean skinBean, String style, String attrValue) {
        try {
            if (!TextUtils.isEmpty(attrValue)) {
                String bgColor = "";
                if (style.equals("root")) {
                    bgColor = SkinCommonLayoutUtil.getDynamicRootConfig(skinBean, attrValue);
                } else {
                    bgColor = skinBean.getList().get(style).get(attrValue);
                }
                if (!TextUtils.isEmpty(bgColor)) {
                    Drawable myShape = view.getBackground();
                    if (myShape != null && myShape instanceof GradientDrawable) {
//                        ((GradientDrawable) myShape).setColor(Color.parseColor(bgColor));
                        view.setBackground(initNewBackGround(((GradientDrawable) myShape), bgColor));
//                        try {
//                            myShape = RecyclerDecorationUtil.tintDrawable(myShape, ColorStateList.valueOf(Color.parseColor(bgColor)));
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
                    } else {
                        view.setBackgroundColor(Color.parseColor(bgColor));
                    }
                }
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    private GradientDrawable initNewBackGround(GradientDrawable oldShape, String color) {
        try {
            Drawable drawable = oldShape.mutate();// 防止Drawable共享，此处clone一份，单独设置
            if(drawable == null || !(drawable instanceof GradientDrawable)){
                return oldShape;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(Color.parseColor(color));
            return gradientDrawable;
        } catch (Exception e) {
            return oldShape;
        }
    }
}
