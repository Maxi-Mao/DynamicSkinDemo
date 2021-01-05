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

//    public static void initCircleViewSkinEnable(XRefreshView xf_content, String viewFrom) {
//        if (xf_content.getChildCount() > 0) {
//            View view = xf_content.getChildAt(0);
//            if (view instanceof ViewRefresh) {
//                try {
//                    initUnusualBgColorSkin(((ViewRefresh) view).getLoadingView().getCircleView3(), viewFrom, "root", UnusualBgColorDeployer.ROOT_VALUE_LOAD_COLOR_LEFT);
//                    initUnusualBgColorSkin(((ViewRefresh) view).getLoadingView().getCircleView1(), viewFrom, "root", UnusualBgColorDeployer.ROOT_VALUE_LOAD_COLOR_CENTER);
//                    initUnusualBgColorSkin(((ViewRefresh) view).getLoadingView().getCircleView2(), viewFrom, "root", UnusualBgColorDeployer.ROOT_VALUE_LOAD_COLOR_RIGHT);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    public static void initCustomHintViewSkin(View view, String viewFrom, String style) {
//        initUnusualBgColorSkin(view, viewFrom, style, UnusualBgColorDeployer.ROOT_VALUE_RD_COLOR);
//    }
//
//    /**
//     * error_layout
//     *
//     * @param view
//     * @param viewFrom
//     */
//
//    public static void initErrorLayoutSkin(View baseView, String viewFrom) {
//        if (baseView == null) {
//            return;
//        }
//        initBgColorSkin(baseView, viewFrom, "root", "page_empty_bg_colr");
//        try {
//            baseView.findViewById(R.id.iv_logo).setVisibility(View.GONE);
//            baseView.findViewById(R.id.iv_logo_for_empty_skin).setVisibility(View.VISIBLE);
//            initBgImgSkin(baseView.findViewById(R.id.iv_logo_for_empty_skin), viewFrom, "root", "page_empty_img");
//        } catch (Exception e) {
//        }
//        try {
//            initTextColorSkin(baseView.findViewById(R.id.tv_message), viewFrom, "root", "page_empty_wrd_colr");
//            String textContent = getDynamicConfig(viewFrom, "root", "page_empty_wrd");
//            if (baseView.findViewById(R.id.tv_message) instanceof TextView &&
//                    !TextUtils.isEmpty(textContent)) {
//                ((TextView) baseView.findViewById(R.id.tv_message)).setText(textContent);
//            }
//        } catch (Exception e) {
//        }
//    }
//
//    public static void initErrorLayoutSkin(BaseQuickAdapter adapter, String viewFrom) {
//        View baseView = adapter.getEmptyView();
//        initErrorLayoutSkin(baseView, viewFrom);
//    }
//
//    /**
//     * layout_error
//     *
//     * @param view
//     * @param viewFrom
//     */
//    public static void initLayoutErrorSkin(View baseView, String viewFrom, TextView errorTv, ImageView errorIcon, String errorMsg, boolean isEmpty) {
//        if (baseView == null) {
//            return;
//        }
//        if (isEmpty) {
//            try {
//                String pageEmptyBgColor = getDynamicRootConfig(DynamicConfigUtil.getInstance().getSkinBean(viewFrom), "page_empty_bg_colr");
//                if (!TextUtils.isEmpty(pageEmptyBgColor)) {
//                    baseView.setBackgroundColor(Color.parseColor(pageEmptyBgColor));
//                }
//            } catch (Exception e) {
//            }
//            try {
//                errorIcon.setVisibility(View.GONE);
//                baseView.findViewById(R.id.iv_logo_for_empty_skin).setVisibility(View.VISIBLE);
//                initBgImgSkin(baseView.findViewById(R.id.iv_logo_for_empty_skin), viewFrom, "root", "page_empty_img");
//            } catch (Exception e) {
//            }
//            try {
//                String pageEmptyWrdColor = getDynamicRootConfig(DynamicConfigUtil.getInstance().getSkinBean(viewFrom), "page_empty_wrd_colr");
//                if (!TextUtils.isEmpty(pageEmptyWrdColor)) {
//                    errorTv.setTextColor(Color.parseColor(pageEmptyWrdColor));
//                }
//            } catch (Exception e) {
//            }
//            try {
//                String textContent = getDynamicConfig(viewFrom, "root", "page_empty_wrd");
//                if (!TextUtils.isEmpty(textContent)) {
//                    errorTv.setText(textContent);
//                } else {
//                    errorTv.setText(errorMsg);
//                }
//            } catch (Exception e) {
//            }
//        } else {
//            baseView.setBackgroundColor(Color.parseColor("#ffffff"));
//            errorIcon.setVisibility(View.VISIBLE);
//            baseView.findViewById(R.id.iv_logo_for_empty_skin).setVisibility(View.GONE);
//            errorIcon.setImageResource(R.mipmap.ic_nowifi);
//            errorTv.setText(errorMsg);
//        }
//    }
//
//    public static void initStyle300Skin(View view, String viewFrom) {
//        initTextColorSkin(view, viewFrom, "300", "item_title_colr");
//    }
//
//    public static void initStyle3001Skin(TextView textView, String viewFrom, CustomClickableSpan customClickableSpan) {
//        try {
//            initBgImgSkin(textView, viewFrom, "3001", "item_bg_img");
//            String titleColor = getDynamicConfig(viewFrom, "3001", "item_title_colr");
//            String desColor = getDynamicConfig(viewFrom, "3001", "item_wrd_colr");
//            textView.setTextColor(Color.parseColor(titleColor));
//            customClickableSpan.setColor(Color.parseColor(desColor));
//        } catch (Exception e) {
//        }
//    }
//
//    public static void initStyle3300Skin(TextView textView, String viewFrom, CustomClickableSpan customClickableSpan, CustomClickableSpan clickableSpanMore) {
//        try {
//            String textColor = getDynamicConfig(viewFrom, "3300", "item_title_colr");
//            String vipColor = getDynamicConfig(viewFrom, "3300", "item_payvip_wrd_colr");
//            String moreColor = getDynamicConfig(viewFrom, "3300", "more_title_colr");
//            textView.setTextColor(Color.parseColor(textColor));
//            if (customClickableSpan != null) {
//                customClickableSpan.setColor(Color.parseColor(vipColor));
//            }
//            if (clickableSpanMore != null) {
//                clickableSpanMore.setColor(Color.parseColor(moreColor));
//            }
//        } catch (Exception e) {
//        }
//    }
//
//    public static void initFeaturedMvideoRecSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, "item_title_colr");
//    }
//
//    public static void initOperationVerticalSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initBaseNestedAdapterSkin(helper, viewFrom, style);
//        initTextColorSkin(helper.getView(R.id.tv_series_num), viewFrom, style, "item_ep_colr");
//    }
//
//    public static void initHotActorAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        //TODO 精选页 热点影人 布局变化 没有R.id.ll_hot_actor_content了
////        initBgImgSkin(helper.getView(R.id.ll_hot_actor_content), viewFrom, style, "item_bg_img");
//        initTextColorSkin(helper.getView(R.id.tv_star), viewFrom, style, "item_title_colr");
//        initBgImgSkin(helper.getView(R.id.iv_mask), viewFrom, style, "item_bg2_img");
//    }
//
//    public static void initXSimplePagerTitleViewSkin(View titleView, String viewFrom, String style) {
//        initUnusualBgColorSkin(titleView, viewFrom, style, UnusualBgColorDeployer.NAVIGATOR_ADAPTER_TITLE_COLOR);
//    }
//
//    public static void initPagerTitleViewSkin(View titleView, String viewFrom, String style, String attrValue) {
//        initUnusualBgColorSkin(titleView, viewFrom, style, attrValue);
//    }
//
//    public static void initLinePagerIndicatorSkin(View linePagerIndicator, String viewFrom, String style, String attrValue) {
//        initUnusualBgColorSkin(linePagerIndicator, viewFrom, style, attrValue);
//    }
//
//    public static void initScoreTextViewSkin(BaseViewHolder helper, String viewFrom) {
//        if (helper.getView(R.id.tv_score) != null) {
//            initTextColorSkin(helper.getView(R.id.tv_score), viewFrom, "root", "score_colr");
//        }
//    }
//
//    /**
//     * item_movie_category_top
//     *
//     * @param viewFrom
//     * @param style
//     */
//    public static void initItemCategoryTopSkin(BaseViewHolder helper, String viewFrom, String style) {
//        TextView tvIndex = helper.getView(R.id.tv_index);
//        initTextColorSkin(tvIndex, viewFrom, style, "rank_wrd_colr");
//        String bgImgAttrValue;
//        switch (tvIndex.getText().toString()) {
//            case "1":
//                bgImgAttrValue = "rank_img_no1";
//                break;
//            case "2":
//                bgImgAttrValue = "rank_img_no2";
//                break;
//            case "3":
//                bgImgAttrValue = "rank_img_no3";
//                break;
//            default:
//                bgImgAttrValue = "rank_img_nox";
//                break;
//        }
//        initBgImgSkin(tvIndex, viewFrom, style, bgImgAttrValue);
//        initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, "item_title_colr");
//        initScoreTextViewSkin(helper, viewFrom);
//    }
//
//    /**
//     * view_featured_operation_topic
//     */
//    public static void initOperationTopicSkin(BaseViewHolder helper, String viewFrom, String style) {
//        Map<String, String> attrMap = new HashMap<>();
//        initTextColorSkin(helper.getView(R.id.tv_title_movie), viewFrom, style, "item_title_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "more_title_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_DRAWABLE_RIGHT, "more_icon_img");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_more_operation_top), viewFrom, style, attrMap);
//        attrMap.clear();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "item_title_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "item_wrd_bg_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_DRAWABLE_RIGHT, "item_wrd_play_img");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_sub_title), viewFrom, style, attrMap);
//    }
//
//    /**
//     * item_special
//     */
//    public static void initSpecialListAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        Map<String, String> attrMap = new HashMap<>();
//        initTextColorSkin(helper.getView(R.id.tv_title_movie), viewFrom, style, "item_title_colr");
//        initBgColorSkin(helper.getView(R.id.iv_mask), viewFrom, style, "item_mask_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "item_wrd_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "item_wrd_bg_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_DRAWABLE_RIGHT, "item_wrd_play_img");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_sub_title), viewFrom, style, attrMap);
//    }
//
//    /**
//     * tv_more_top
//     */
//    public static void initMoreTopSkin(BaseViewHolder helper, String viewFrom, String style) {
//        Map<String, String> attrMap = new HashMap<>();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "more_title_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "more_bg_colr");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_more_top), viewFrom, style, attrMap);
//    }
//
//    /**
//     * view_featured_operation_7
//     */
//    public static void initFeaturedOperation7Skin(BaseViewHolder helper, String viewFrom, String style) {
//        initBaseAdapterTextSkin((TextView) helper.getView(R.id.tv_title_movie), (TextView) helper.getView(R.id.tv_desc_movie), viewFrom, style, "item_title_colr", "item_wrd_colr");
//        initScoreTextViewSkin(helper, viewFrom);
//    }
//
//    /**
//     * ActorAreaAdapter
//     */
//    public static void initActorAreaAdapterSkin(BaseViewHolder helper, String viewFrom, String style, boolean isTrue) {
//        initBgImgSkin(helper.getView(R.id.ll_actor_root), viewFrom, style, isTrue ? "tabin_img" : "tabout_img");
//        initTextColorSkin(helper.getView(R.id.tv_star), viewFrom, style, isTrue ? "tabin_wrd_colr" : "tabout_wrd_colr");
//    }
//
//    /**
//     * item_movie_soon_online
//     */
//    public static void initSoonOnlineSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initBaseAdapterTextSkin((TextView) helper.getView(R.id.tv_title), (TextView) helper.getView(R.id.tv_online), viewFrom, style, "item_title_colr", "item_wrd_colr");
//        initBgBorderColorSkin(helper.getView(R.id.view_order), viewFrom, style, "item_yy_boder_colr");
//        initTextColorSkin(helper.getView(R.id.tv_movie_order), viewFrom, style, "wdyy_title_colr");
//        initScoreTextViewSkin(helper, viewFrom);
//    }
//
//    /**
//     * item_movie_comment
//     */
//    public static void initItemMovieCommentSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initTextColorSkin(helper.getView(R.id.tv_content), viewFrom, style, "item_title_colr");
////        initTextColorSkin(helper.getView(R.id.tv_movie_title), viewFrom, style, "item_wrd_colr");
//        initBgImgSkin(helper.getView(R.id.iv_icon), viewFrom, style, "item_play_img");
////        initBgColorSkin(helper.getView(R.id.layout_relate), viewFrom, style, "");
//    }
//
//    /**
//     * ProgrammeAdapter
//     *
//     * @param helper
//     * @param viewFrom
//     * @param style
//     * @param isSeeback     是否是回看
//     * @param isAppointment 是否已预约
//     * @param isPlayLiveing 是否是直播中...
//     */
//    public static void initProgrammeAdapterSkin(BaseViewHolder helper, String viewFrom, String style,
//                                                boolean isSeeback, boolean isAppointment, boolean isPlayLiveing) {
//        String seebackColorAttr = isSeeback ? "item_bef_title_colr" : "item_aft_title_colr";
//        String appointmentTextColorAttr = isAppointment ? "item_booked_wrd_colr" : "item_yy_wrd_colr";
//        String appointmentColorAttr = isAppointment ? "item_booked_bg_colr" : "item_yy_bg_colr";
//        String liveingColorAttr = isPlayLiveing ? "item_live_btn_colr" : "item_lookback_btn_colr";
//        initTextColorSkin(helper.getView(R.id.tv_time), viewFrom, style, seebackColorAttr);
//        initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, seebackColorAttr);
//        Map<String, String> attrMap = new HashMap<>();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, appointmentTextColorAttr);
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, appointmentColorAttr);
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_appointment), viewFrom, style, attrMap);
//        initTextColorSkin(helper.getView(R.id.tv_seenow), viewFrom, style, liveingColorAttr);
//        initTextColorSkin(helper.getView(R.id.tv_seeback), viewFrom, style, "item_lookback_btn_colr");
//    }
//
//    /**
//     * LiveAppointmentAdapter
//     */
//    public static void initLiveAppointmentAdapterSkin(View titleView, View appointmentView, View numberView, View timeView, String viewFrom, String style, boolean isAppointment) {
//        String appointmentTextColorAttr = isAppointment ? "item_booked_wrd_colr" : "item_yy_wrd_colr";
//        String appointmentColorAttr = isAppointment ? "item_booked_bg_colr" : "item_yy_bg_colr";
//        Map<String, String> attrMap = new HashMap<>();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, appointmentTextColorAttr);
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, appointmentColorAttr);
//        SkinManager.getInstance().dynamicAddSkinEnableView(appointmentView, viewFrom, style, attrMap);
//
//        initTextColorSkin(titleView, viewFrom, style, "item_title_colr");
//        initTextColorSkin(numberView, viewFrom, style, "item_yy_people_colr");
//        initTextColorSkin(timeView, viewFrom, style, "item_livetime_wrd_colr");
//    }
//
//    /**
//     * LivePlayBackAdapter
//     */
//    public static void initLivePlayBackAdapterSkin(View titleView, View numberView, View iconView, String viewFrom, String style) {
////        Map<String, String> attrMap = new HashMap<>();
////        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "huikan_wrd_colr");
////        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "huikan_bg_colr");
////        SkinManager.getInstance().dynamicAddSkinEnableView(iconView, viewFrom, style, attrMap);
//
//        initTextColorSkin(titleView, viewFrom, style, "item_title_colr");
//        initTextColorSkin(numberView, viewFrom, style, "item_num_wrd_colr");
//        initBgImgSkin(iconView, viewFrom, style, "huikan_icon_img");
//    }
//
//    /**
//     * HuanXiMovieAdapter
//     */
//    public static void initHuanXiMovieAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initBaseNestedAdapterSkin(helper, viewFrom, style);
//        initBgImgSkin(helper.getView(R.id.iv_mask_top), viewFrom, style, "mask_top_img");
//        initBgImgSkin(helper.getView(R.id.iv_mask_bottom), viewFrom, style, "mask_btm_img");
////        try {
////            String maskTopImg = getDynamicConfig(viewFrom, style, "mask_top_img");
////            if (!TextUtils.isEmpty(maskTopImg)) {
////                ImageLoader.loadRoundRes_v4(context, maskTopImg, (ImageView) helper.getView(R.id.iv_mask_top), ScreenUtil.dip2px(5),android.R.color.transparent);
//////                ImageLoader.loadRoundUrl(context, maskTopImg, (ImageView) helper.getView(R.id.iv_mask_top), ScreenUtil.dip2px(5),
//////                        GlideRoundCenterCropTransform.CORNER_TOP_LEFT | GlideRoundCenterCropTransform.CORNER_TOP_RIGHT, android.R.color.transparent);
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        try {
////            String maskBottomImg = getDynamicConfig(viewFrom, style, "mask_btm_img");
////            if (!TextUtils.isEmpty(maskBottomImg)) {
////                ImageLoader.loadRoundRes_v4(context, maskBottomImg, (ImageView) helper.getView(R.id.iv_mask_top), ScreenUtil.dip2px(5),android.R.color.transparent);
//////                ImageLoader.loadRoundUrl(context, maskBottomImg, (ImageView) helper.getView(R.id.iv_mask_bottom), ScreenUtil.dip2px(5),
//////                        GlideRoundCenterCropTransform.CORNER_BOTTOM_LEFT | GlideRoundCenterCropTransform.CORNER_BOTTOM_RIGHT, android.R.color.transparent);
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//        initTextColorSkin(helper.getView(R.id.tv_tag), viewFrom, style, "item_wrd2_colr");
//    }
//
//    /**
//     * TrailerAdapter
//     */
//    public static void initTrailerAdapterSkin(BaseViewHolder helper, String viewFrom, String style, int bookStatus) {
//        String appointmentColorAttr = bookStatus == 1 ? "item_yy_bg_colr" : "item_booked_bg_colr";
//        String liveTextColorAttr = bookStatus == 3 ? "item_lived_colr" : "item_live_colr";
//        initBaseNestedAdapterSkin(helper, viewFrom, style);
//        initBgColorSkin(helper.getView(R.id.iv_mask), viewFrom, style, "item_mask_colr");
//        initBgColorSkin(helper.getView(R.id.v_line), viewFrom, style, "item_line_colr");
//        initTextColorSkin(helper.getView(R.id.tv_time), viewFrom, style, liveTextColorAttr);
//        initBgColorSkin(helper.getView(R.id.tv_order), viewFrom, style, appointmentColorAttr);
//        initTextColorSkin(helper.getView(R.id.tv_order_number), viewFrom, style, "item_yy_people_colr");
//    }
//
//    /**
//     * layout_horizontal_index_mini_vip
//     */
//    public static void initMiniVipSkin(BaseViewHolder helper, String viewFrom, String style) {
//        Map<String, String> attrMap = new HashMap<>();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "more_title2_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_DRAWABLE_RIGHT, "more_icon_img");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_more_mpack), viewFrom, style, attrMap);
//        attrMap.clear();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "more_title_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "more_bg_colr");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_change), viewFrom, style, attrMap);
//    }
//
//    /**
//     * MiniVipHorizontalAdapter
//     */
//    public static void initMiniVipHorizontalAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initBgImgSkin(helper.itemView, viewFrom, style, "item_bg_img");
//        initBgImgSkin(helper.getView(R.id.iv_mask), viewFrom, style, "item_thumb_right_img");
//
//        initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, "item_title_colr");
//        initTextColorSkin(helper.getView(R.id.tv_desc), viewFrom, style, "item_wrd_colr");
//
//        Map<String, String> attrMap = new HashMap<>();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "item_num_wrd_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "item_num_bg_colr");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_watching), viewFrom, style, attrMap);
//    }
//
//    /**
//     * MovieListFragmentAdapter
//     */
//    public static void initMovieListFragmentAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, "item_title_colr");
//        initTextColorSkin(helper.getView(R.id.tv_desc), viewFrom, style, "item_wrd_colr");
//    }
//
//    public static void initStyle3302Skin(BaseViewHolder helper, String viewFrom, String style) {
//        initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, "sp_title_colr");
//        initTextColorSkin(helper.getView(R.id.tv_desc), viewFrom, style, "sp_wrd_colr");
//        Map<String, String> attrMap = new HashMap<>();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "item_price_wrd_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_IMG, "item_price_bg_img");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_price), viewFrom, style, attrMap);
//        attrMap.clear();
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "item_num_wrd_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_BORDER_COLOR, "item_num_bg_colr|item_num_boder_colr");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_watching), viewFrom, style, attrMap);
//    }
//
//    /**
//     * MovieTopFragmentAdapter
//     */
//    public static void initMovieTopFragmentAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        Map<String, String> attrMap = new HashMap<>();
//        initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, "item_title_colr");
//        initBgColorSkin(helper.getView(R.id.iv_mask), viewFrom, style, "item_mask_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "item_wrd_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "item_wrd_bg_colr");
//        attrMap.put(SkinDeployerFactory.SKIN_DRAWABLE_RIGHT, "item_wrd_play_img");
//        SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_desc), viewFrom, style, attrMap);
//    }
//
//    /**
//     * ActorAreaRootAdapter
//     *
//     * @param helper
//     * @param viewFrom
//     * @param style
//     */
//    public static void initActorAreaRootAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initTextColorSkin(helper.getView(R.id.tv_star), viewFrom, style, "starname_colr");
//        initTextColorSkin(helper.getView(R.id.tv_more), viewFrom, style, "more_title_colr");
//        initBgColorSkin(helper.getView(R.id.v_star_bg), viewFrom, style, "starname_bg_colr");
//        initBgImgSkin(helper.getView(R.id.iv_bg), viewFrom, style, "item_bg_img");
//    }
//
//    /**
//     * MiniVipFragmentDialog
//     */
//    public static void initMiniVipFragmentDialogSkin(TextView tvTitle, TextView tvDesc, String viewFrom, String style) {
//        initTextColorSkin(tvTitle, viewFrom, style, "more_tip_title_colr");
//        initTextColorSkin(tvDesc, viewFrom, style, "more_tip_wrd_colr");
//    }
//
//    public static void initNormalSkin(BaseViewHolder helper, String viewFrom, String style) {
//        if (helper.itemView != null) {
//            initBgColorSkin(helper.itemView, viewFrom, style, "bg_colr");
//        }
//        if (helper.getView(R.id.tv_title) != null) {
//            initTextColorSkin(helper.getView(R.id.tv_title), viewFrom, style, "sp_title_colr");
//        }
//        initScoreTextViewSkin(helper, viewFrom);
//        if (helper.getView(R.id.tv_more_top) != null) {
//            initMoreTopTextSkin(helper.getView(R.id.tv_more_top), viewFrom, style, "more_title_colr", "more_icon_img");
//        }
//        if (helper.getView(R.id.tv_change) != null) {
//            Map<String, String> attrMap = new HashMap<>();
//            attrMap.put(SkinDeployerFactory.SKIN_TEXT_COLOR, "more_title_colr");
//            attrMap.put(SkinDeployerFactory.SKIN_BG_COLOR, "more_bg_colr");
//            SkinManager.getInstance().dynamicAddSkinEnableView(helper.getView(R.id.tv_change), viewFrom, style, attrMap);
//        }
//    }
//
//    public static void initBaseNestedAdapterSkin(BaseViewHolder helper, String viewFrom, String style) {
//        initBaseNestedAdapterSkin(helper, viewFrom, style, "item_title_colr", "item_wrd_colr");
//        initScoreTextViewSkin(helper, viewFrom);
//    }
//
//    //嵌套adapter 基础的title和Desc组成
//    public static void initBaseNestedAdapterSkin(BaseViewHolder helper, String viewFrom, String style, String titleTextValue, String descTextValue) {
//        TextView view1 = (helper != null && helper.getView(R.id.tv_title) instanceof TextView) ? (TextView) helper.getView(R.id.tv_title) : null;
//        TextView view2 = (helper != null && helper.getView(R.id.tv_desc) instanceof TextView) ? (TextView) helper.getView(R.id.tv_desc) : null;
//        initBaseAdapterTextSkin((TextView) helper.getView(R.id.tv_title), (TextView) helper.getView(R.id.tv_desc), viewFrom, style, titleTextValue, descTextValue);
//    }

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

    /**
     * glide加载圆形图片 带边框 此处动态换边框颜色
     * 比较特殊 无法统一换肤 所以不用SkinManager那套
     *
     * @param context
     * @param url
     * @param iv
     * @param viewFrom
     * @param style
     * @param attrValue
     */
//    public static void initGlideBorderSkin(final Context context, String url, final ImageView iv, String viewFrom, String style, String attrValue) {
//        String borderColor = getDynamicConfig(viewFrom, style, attrValue);
//        if (TextUtils.isEmpty(borderColor)) {
//            ImageLoader.loadCircleWithBorder(context, url, iv);
//        } else {
//            ImageLoader.loadCircleWithBorder(context, url, iv, borderColor);
//        }
//    }

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
