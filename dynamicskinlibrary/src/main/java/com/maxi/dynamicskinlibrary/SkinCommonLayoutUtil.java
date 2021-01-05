package com.maxi.dynamicskinlibrary;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;
import com.maxi.dynamicskinlibrary.deployer.UnusualBgColorDeployer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maxi on 2020/6/23.
 */
public class SkinCommonLayoutUtil {

    public static void initBaseAdapterTextSkin(TextView view1, TextView view2, String viewFrom, String style, String view1Value, String view2Value) {
        if (view1 != null) {
            initTextColorSkin(view1, viewFrom, style, view1Value);
        }
        if (view2 != null) {
            initTextColorSkin(view2, viewFrom, style, view2Value);
        }
    }

    public static void initTextColorSkin(View view, String viewFrom, String style, String attrValue) {
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, SkinDeployerFactory.SKIN_TEXT_COLOR, attrValue);
    }

    public static void initBgColorSkin(View view, String viewFrom, String style, String attrValue) {
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, SkinDeployerFactory.SKIN_BG_COLOR, attrValue);
    }

    public static void initBgImgSkin(View view, String viewFrom, String style, String attrValue) {
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, SkinDeployerFactory.SKIN_BG_IMG, attrValue);
    }

    public static void initDrawableRightSkin(View view, String viewFrom, String style, String attrValue) {
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, SkinDeployerFactory.SKIN_DRAWABLE_RIGHT, attrValue);
    }

    public static void initDrawableLeftSkin(View view, String viewFrom, String style, String attrValue) {
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, SkinDeployerFactory.SKIN_DRAWABLE_LEFT, attrValue);
    }

    public static void initUnusualBgColorSkin(View view, String viewFrom, String style, String attrValue) {
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, SkinDeployerFactory.SKIN_UNUSUAL_BG_COLOR, attrValue);
    }

    public static void initBgBorderColorSkin(View view, String viewFrom, String style, String attrValue) {
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, SkinDeployerFactory.SKIN_BG_BORDER_COLOR, attrValue);
    }

    public static void initMoreTopTextSkin(View view, String viewFrom, String style, String attrColorValue, String drawRight) {
        Map<String, String> attrMap = new HashMap<>();
        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, attrColorValue);
        attrMap.put(SkinDeployerFactory.SKIN_DRAWABLE_RIGHT, drawRight);
        SkinManager.getInstance().dynamicAddSkinEnableView(view, viewFrom, style, attrMap);
    }

    /**
     * 用于类似点击关注变换图标的view
     *
     * @param view
     * @param viewFrom
     * @param style
     * @param trueAttrValue  true的情况下需要显示的图标 后台返回的字段名
     * @param falseAttrValue false的情况下需要显示的图标 后台返回的字段名
     * @param isTrue
     */
    public static void initBgImgDynamicSkin(View view, String viewFrom, String style, String trueAttrValue, String falseAttrValue, boolean isTrue) {
        initBgImgSkin(view, viewFrom, style, isTrue ? trueAttrValue : falseAttrValue);
    }

    // 直接获取配置中对应的资源
    public static String getDynamicConfig(String viewFrom, String style, String attrValue) {
        if (DynamicConfigUtil.getInstance().getSkinBean(viewFrom) != null) {
            if (style.equals("root")) {
                return getDynamicRootConfig(DynamicConfigUtil.getInstance().getSkinBean(viewFrom), attrValue);
            } else if (DynamicConfigUtil.getInstance().getSkinBean(viewFrom).getList().get(style) != null) {
                return DynamicConfigUtil.getInstance().getSkinBean(viewFrom).getList().get(style).get(attrValue);
            }
        }
        return "";
    }

    /**
     * 根据字段获取根节点皮肤
     *
     * @param baseSkinBean
     * @param attrValue
     * @return
     */
    public static String getDynamicRootConfig(BaseSkinBean.SkinSetBean baseSkinBean, String attrValue) {
        switch (attrValue) {
            case DynamicConfigUtil.score_colr:
                return baseSkinBean.getScore_colr();
            case DynamicConfigUtil.page_bg_colr:
                return baseSkinBean.getPage_bg_colr();
            case DynamicConfigUtil.page_border_colr:
                return baseSkinBean.getPage_border_colr();
            case DynamicConfigUtil.item_def_bg_colr:
                return baseSkinBean.getItem_def_bg_colr();
            case DynamicConfigUtil.page_load_colr_left:
                return baseSkinBean.getPage_load_colr_left();
            case DynamicConfigUtil.page_load_colr_center:
                return baseSkinBean.getPage_load_colr_center();
            case DynamicConfigUtil.page_load_colr_right:
                return baseSkinBean.getPage_load_colr_right();
            case DynamicConfigUtil.page_load_wrd_colr:
                return baseSkinBean.getPage_load_wrd_colr();
            case DynamicConfigUtil.page_btm_logo_img:
                return baseSkinBean.getPage_btm_logo_img();
            case DynamicConfigUtil.page_empty_bg_colr:
                return baseSkinBean.getPage_empty_bg_colr();
            case DynamicConfigUtil.page_empty_img:
                return baseSkinBean.getPage_empty_img();
            case DynamicConfigUtil.page_empty_wrd:
                return baseSkinBean.getPage_empty_wrd();
            case DynamicConfigUtil.page_empty_wrd_colr:
                return baseSkinBean.getPage_empty_wrd_colr();
            case DynamicConfigUtil.page_tabin_colr:
                return baseSkinBean.getPage_tabin_colr();
            case DynamicConfigUtil.page_tabout_colr:
                return baseSkinBean.getPage_tabout_colr();
            case DynamicConfigUtil.bills_tabin_colr:
                return baseSkinBean.getBills_tabin_colr();
            case DynamicConfigUtil.bills_tabout_colr:
                return baseSkinBean.getBills_tabout_colr();
        }
        return "";
    }
}
