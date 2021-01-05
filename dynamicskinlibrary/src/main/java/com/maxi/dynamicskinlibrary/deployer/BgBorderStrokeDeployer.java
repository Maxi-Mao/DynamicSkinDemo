package com.maxi.dynamicskinlibrary.deployer;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;

import com.maxi.dynamicskinlibrary.SkinCommonLayoutUtil;
import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

/**
 * 用于设置shape边框颜色
 * Created by maxi on 2020/7/2.
 * 用法：
 * 只设置边框：传边框字段，{边框颜色字段}
 * 边框和背景颜色同时设置：attrValue值需要用|分隔，{背景颜色字段}|{边框颜色字段}
 */
public class BgBorderStrokeDeployer implements ISkinApplyDeployer {

    @Override
    public void apply(View view, BaseSkinBean.SkinSetBean skinBean, String style, String attrValue) {
        try {
            if (!TextUtils.isEmpty(attrValue)) {
                String attrBgValue = "";
                String attrBorderValue = "";
                if (attrValue.contains("|")) {
                    String[] attrs = attrValue.split("\\|");
                    attrBgValue = attrs[0];
                    attrBorderValue = attrs[1];
                } else {
                    attrBorderValue = attrValue;
                }
                String bgColor = "";
                String borderColor = "";
                if (style.equals("root")) {
                    bgColor = SkinCommonLayoutUtil.getDynamicRootConfig(skinBean, attrBgValue);
                    borderColor = SkinCommonLayoutUtil.getDynamicRootConfig(skinBean, attrBorderValue);
                } else {
                    bgColor = skinBean.getList().get(style).get(attrBgValue);
                    borderColor = skinBean.getList().get(style).get(attrBorderValue);
                }
                if (!TextUtils.isEmpty(borderColor)) {
                    Drawable myShape = view.getBackground();
                    if (myShape != null && myShape instanceof GradientDrawable) {
                        view.setBackground(initNewBackGround(view.getContext(), ((GradientDrawable) myShape), bgColor, borderColor));
                    }
                }
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    private GradientDrawable initNewBackGround(Context context, GradientDrawable oldShape, String bgColor, String borderColor) {
        try {
            Drawable drawable = oldShape.mutate();// 防止Drawable共享，此处clone一份，单独设置
            if (drawable == null || !(drawable instanceof GradientDrawable)) {
                return oldShape;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            if (!TextUtils.isEmpty(bgColor)) {
                gradientDrawable.setColor(Color.parseColor(bgColor));
            }
            gradientDrawable.setStroke(dip2px(context, 0.5f), Color.parseColor(borderColor));
            return gradientDrawable;
        } catch (Exception e) {
            return oldShape;
        }
    }

    private int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
