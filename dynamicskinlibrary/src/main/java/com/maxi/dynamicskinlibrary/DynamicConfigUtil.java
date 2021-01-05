package com.maxi.dynamicskinlibrary;

import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

import java.util.HashMap;
import java.util.Map;

public class DynamicConfigUtil {

    public final static String score_colr = "score_colr";
    public final static String page_bg_colr = "page_bg_colr";
    public final static String page_border_colr = "page_border_colr";
    public final static String item_def_bg_colr = "item_def_bg_colr";
    public final static String page_load_colr_left = "page_load_colr_left";
    public final static String page_load_colr_center = "page_load_colr_center";
    public final static String page_load_colr_right = "page_load_colr_right";
    public final static String page_load_wrd_colr = "page_load_wrd_colr";
    public final static String page_btm_logo_img = "page_btm_logo_img";
    public final static String page_empty_bg_colr = "page_empty_bg_colr";
    public final static String page_empty_img = "page_empty_img";
    public final static String page_empty_wrd = "page_empty_wrd";
    public final static String page_empty_wrd_colr = "page_empty_wrd_colr";
    public final static String page_tabin_colr = "page_tabin_colr";
    public final static String page_tabout_colr = "page_tabout_colr";
    public final static String bills_tabin_colr = "bills_tabin_colr";
    public final static String bills_tabout_colr = "bills_tabout_colr";

    private Map<String, BaseSkinBean.SkinSetBean> skinMap = new HashMap<>();

    private DynamicConfigUtil() {
    }

    private static class SingletonInstance {
        private static final DynamicConfigUtil INSTANCE = new DynamicConfigUtil();
    }

    public static DynamicConfigUtil getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public void setSkinData(BaseSkinBean.SkinSetBean skinBean, String viewFrom) {
        skinMap.put(viewFrom, skinBean);
        SkinManager.getInstance().notifySkinChanged(viewFrom);
    }

    public BaseSkinBean.SkinSetBean getSkinBean(String viewFrom) {
        return skinMap.size() <= 0 ? null : skinMap.get(viewFrom);
    }
}