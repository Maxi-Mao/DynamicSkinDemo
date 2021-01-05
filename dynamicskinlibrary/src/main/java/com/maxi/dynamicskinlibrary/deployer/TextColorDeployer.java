package com.maxi.dynamicskinlibrary.deployer;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.maxi.dynamicskinlibrary.SkinCommonLayoutUtil;
import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

/**
 * 用于设置字体颜色
 * Created by maxi on 2020/6/12.
 */
public class TextColorDeployer implements ISkinApplyDeployer {
    @Override
    public void apply(View view, BaseSkinBean.SkinSetBean skinBean, String style, String attrValue) {
        try {
            if (!TextUtils.isEmpty(attrValue) && view instanceof TextView) {
                String textColor = "";
                if (style.equals("root")) {
                    textColor = SkinCommonLayoutUtil.getDynamicRootConfig(skinBean, attrValue);
                } else {
                    textColor = skinBean.getList().get(style).get(attrValue);
                }
                ((TextView) view).setTextColor(Color.parseColor(textColor));
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
