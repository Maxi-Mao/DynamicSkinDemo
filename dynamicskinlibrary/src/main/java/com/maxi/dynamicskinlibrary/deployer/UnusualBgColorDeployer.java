package com.maxi.dynamicskinlibrary.deployer;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;

import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

/**
 * 用于自定义绘制的View等 不寻常的 特殊的处理逻辑的View设置skin
 * Created by maxi on 2020/6/12.
 */
public class UnusualBgColorDeployer implements ISkinApplyDeployer {

    public final static String ROOT_VALUE_LOAD_COLOR_LEFT = "page_load_colr_left";
    public final static String ROOT_VALUE_LOAD_COLOR_CENTER = "page_load_colr_center";
    public final static String ROOT_VALUE_LOAD_COLOR_RIGHT = "page_load_colr_right";
    public final static String ROOT_VALUE_RD_COLOR = "item_rd_colr";
    public final static String ROOT_VALUE_PAGE_BORDER_COLOR = "page_border_colr";
    public final static String NAVIGATOR_ADAPTER_TITLE_COLOR = "tab_wrd_colr";
    public final static String ROOT_PAGE_TAB_COLOR = "page_tab_colr";
    public final static String ROOT_BILLS_TITLE_COLOR = "bills_tab_colr";
    public final static String ROOT_PAGE_TABIN_COLOR = "page_tabin_colr";
    public final static String ROOT_BILLS_TABIN_COLOR = "bills_tabin_colr";

    @Override
    public void apply(View view, BaseSkinBean.SkinSetBean skinBean, String style, String attrValue) {
        try {
            if (!TextUtils.isEmpty(attrValue)) {
//                String bgColor = "";
//                if (style.equals("root")) {
//                    switch (attrValue) {
//                        case ROOT_VALUE_LOAD_COLOR_LEFT:
//                            bgColor = skinBean.getPage_load_colr_left();
//                            setCircleViewColor(view, bgColor);
//                            return;
//                        case ROOT_VALUE_LOAD_COLOR_CENTER:
//                            bgColor = skinBean.getPage_load_colr_center();
//                            setCircleViewColor(view, bgColor);
//                            return;
//                        case ROOT_VALUE_LOAD_COLOR_RIGHT:
//                            bgColor = skinBean.getPage_load_colr_right();
//                            setCircleViewColor(view, bgColor);
//                            return;
//                        case ROOT_VALUE_PAGE_BORDER_COLOR:
//                            bgColor = skinBean.getPage_border_colr();
//                            setRecyclerViewBorder(view, bgColor);
//                            return;
//                        case ROOT_PAGE_TAB_COLOR:
//                            String pageinColor = skinBean.getPage_tabin_colr();
//                            String pageoutColor = skinBean.getPage_tabout_colr();
//                            setColorTransitionPagerTitleViewColor(view, pageinColor, pageoutColor);
//                            return;
//                        case ROOT_BILLS_TITLE_COLOR:
//                            String billsinColor = skinBean.getBills_tabin_colr();
//                            String billsoutColor = skinBean.getBills_tabout_colr();
//                            setCctvTitleViewColor(view, billsinColor, billsoutColor);
//                            return;
//                        case ROOT_PAGE_TABIN_COLOR:
//                            setLinePagerIndicatorColor(view, skinBean.getPage_tabin_colr());
//                            return;
//                        case ROOT_BILLS_TABIN_COLOR:
//                            setLinePagerIndicatorColor(view, skinBean.getBills_tabin_colr());
//                            return;
//                        default:
//                            break;
//                    }
//                } else {
//                    switch (attrValue) {
//                        case ROOT_VALUE_RD_COLOR:
//                            String focusColor = skinBean.getList().get(style).get("item_rd_in_colr");
//                            String normalColor = skinBean.getList().get(style).get("item_rd_out_colr");
//                            setCustomHintViewColor(view, focusColor, normalColor);
//                            return;
//                        case NAVIGATOR_ADAPTER_TITLE_COLOR:
//                            String inColor = skinBean.getList().get(style).get("tabin_wrd_colr");
//                            String outColor = skinBean.getList().get(style).get("tabout_wrd_colr");
//                            setSimplePagerTitleViewColor(view, inColor, outColor);
//                            return;
//                        default:
//                            bgColor = skinBean.getList().get(style).get(attrValue);
//                            break;
//                    }
//                }
//                if (!TextUtils.isEmpty(bgColor)) {
//                    view.setBackgroundColor(Color.parseColor(bgColor));
//                }
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

//    private void setCircleViewColor(View view, String color) {
//        if (view instanceof CircleView && !TextUtils.isEmpty(color)) {
//            ((CircleView) view).setColor(Color.parseColor(color));
//            ((CircleView) view).invalidate();
//        }
//    }
//
//    private void setCustomHintViewColor(View view, String focusColor, String normalColor) {
//        if (view instanceof CustomHintView && !TextUtils.isEmpty(focusColor) && !TextUtils.isEmpty(normalColor)) {
//            ((CustomHintView) view).setFocusColor(focusColor);
//            ((CustomHintView) view).setNormalColor(normalColor);
//        }
//    }
//
//    private void setRecyclerViewBorder(View view, String color) {
//        if (view instanceof RecyclerView && !TextUtils.isEmpty(color)) {
//            RecyclerView.ItemDecoration itemDecoration = ((RecyclerView) view).getItemDecorationAt(0);
//            if (itemDecoration instanceof RecyclerDecorationUtil.MyDecoration) {
//                ((RecyclerDecorationUtil.MyDecoration) itemDecoration).setColor(color);
//            }
//        }
//    }
//
//    private void setSimplePagerTitleViewColor(View view, String inColor, String outColor) {
//        if (view instanceof XSimplePagerTitleView && !TextUtils.isEmpty(inColor) && !TextUtils.isEmpty(outColor)) {
//            ((XSimplePagerTitleView) view).setNormalColor(Color.parseColor(outColor));
//            ((XSimplePagerTitleView) view).setSelectedColor(Color.parseColor(inColor));
//            if (((XSimplePagerTitleView) view).isSelected()) {
//                ((XSimplePagerTitleView) view).setTextColor(Color.parseColor(inColor));
//            } else {
//                ((XSimplePagerTitleView) view).setTextColor(Color.parseColor(outColor));
//            }
//        }
//    }
//
//    private void setColorTransitionPagerTitleViewColor(View view, String inColor, String outColor) {
//        if (view instanceof XColorTransitionPagerTitleView && !TextUtils.isEmpty(inColor) && !TextUtils.isEmpty(outColor)) {
//            ((XColorTransitionPagerTitleView) view).setNormalColor(Color.parseColor(outColor));
//            ((XColorTransitionPagerTitleView) view).setSelectedColor(Color.parseColor(inColor));
//            if (((XColorTransitionPagerTitleView) view).isSelected()) {
//                ((XColorTransitionPagerTitleView) view).setTextColor(Color.parseColor(inColor));
//            } else {
//                ((XColorTransitionPagerTitleView) view).setTextColor(Color.parseColor(outColor));
//            }
//        }
//    }
//
//    private void setCctvTitleViewColor(View view, String inColor, String outColor) {
//        if (view instanceof CctvTitleView && !TextUtils.isEmpty(inColor) && !TextUtils.isEmpty(outColor)) {
//            ((CctvTitleView) view).setNormalColor(Color.parseColor(outColor));
//            ((CctvTitleView) view).setSelectedColor(Color.parseColor(inColor));
//            if (((CctvTitleView) view).isSelected()) {
//                ((CctvTitleView) view).setTextColor(Color.parseColor(inColor));
//            } else {
//                ((CctvTitleView) view).setTextColor(Color.parseColor(outColor));
//            }
//        }
//    }
//    private void setLinePagerIndicatorColor(View view, String inColor) {
//        if (view instanceof LinePagerIndicator && !TextUtils.isEmpty(inColor)) {
//            ((LinePagerIndicator) view).setColors(Color.parseColor(inColor));
//        }
//    }
}
