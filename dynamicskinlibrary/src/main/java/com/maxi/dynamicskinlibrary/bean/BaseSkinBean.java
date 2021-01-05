package com.maxi.dynamicskinlibrary.bean;

import java.util.Map;

/**
 * Created by maxi on 2020/6/9.
 */
public class BaseSkinBean {

    protected SkinSetBean skin_set;

    public SkinSetBean getSkin_set() {
        return skin_set;
    }

    public void setSkin_set(SkinSetBean skin_set) {
        this.skin_set = skin_set;
    }

    public static class SkinSetBean {
        /**
         * def_icon_show : 0
         * score_colr : #FF5A00
         * page_bg_colr : #FFFFFF
         * page_border_colr : #e4e4e4
         * item_def_bg_colr : #f5f5f5
         * list : {"300":{"bg_colr":"#FFFFFF","item_title_colr":"#FFFFFF","item_rd_in_colr":"#FFFFFF","item_rd_out_colr":"#C4C4C4"},"630":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_bg_img":"link@newfilm_bg","more_title_colr":"#999999"},"631":{"bg_colr":"#FFFFFF","item_title_colr":"#333333","border_colr":"#e4e4e4"},"632":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_wrd_colr":"#666666","more_title_colr":"#666666","more_bg_colr":"#f5f5f5"},"633":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","more_title_colr":"#666666"},"634":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_mask_colr":"#000000","item_border_colr":"#f5f5f5","item_title_colr":"#FFFFFF","item_live_colr":"#FFFFFF","item_lived_colr":"#666666","item_yy_img":"link@home_ic_order","item_yy_booked_img":"link@home_ic_booked","item_yy_people_colr":"#FFFEFE","more_title_colr":"#666666"},"635":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_wrd_colr":"#666666","tag_wrd_colr":"#f5f5f5","booking_colr":"#4F9DF9"},"636":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_wrd_colr":"#666666","item_ep_colr":"#FFFFFFF"},"637":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_wrd_colr":"#666666","item_ep_colr":"#FFFFFFF"},"638":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_wrd_colr":"#666666","item_ep_colr":"#FFFFFFF"},"639":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","more_title_colr":"#666666","more_bg_colr":"#f5f5f5","tabin_wrd_colr":"#4F9DF9","tabout_wrd_colr":"#999999","rank_img_no1":"link@bangdan_rank_no1","rank_img_no2":"link@bangdan_rank_no2","rank_img_no3":"link@bangdan_rank_no3","rank_img_nox":"link@bangdan_rank_nox","rank_wrd_colr":"#FFFFFF"},"640":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_wrd_colr":"#666666","more_title_colr":"#666666","more_bg_colr":"#666666"},"641":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#FFFFFF","item_wrd_colr":"#FFFFFF","item_wrd_bg_colr":"#000000","item_wrd_play_img":"link@cut_ic_play","more_title_colr":"#666666","more_bg_colr":"#666666"},"642":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#666666","item_bg_img":"link@moviestar_bg"},"643":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#FFFFFF","item_title_colr2":"#333333","item_wrd_colr":"#FFFFFF","item_wrd_colr2":"#666666","item_wrd_bg_colr":"#000000","item_wrd_play_img":"link@cut_ic_play","more_title_colr":"#666666","more_bg_colr":"#666666"},"606":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","item_boder_colr":"#e1e1e1"},"607":{"bg_colr":"#FFFFFF","sp_title_colr":"#333333","item_title_colr":"#333333","tabin_wrd_colr":"#4F9DF9","tabout_wrd_colr":"#999999","item_play_img":"link@ic_associated"}}
         */

        private int def_icon_show;
        private String score_colr;
        private String page_bg_colr;
        private String page_border_colr;
        private String item_def_bg_colr;

        //        private Map<String, ListSkinBean> list;
        private Map<String, Map<String, String>> list;
        /**
         * page_load_colr_left : #4B9CFA
         * page_load_colr_center : #FC5BA3
         * page_load_colr_right : #91C3FF
         */

        private String page_load_colr_left;
        private String page_load_colr_center;
        private String page_load_colr_right;
        /**
         * page_load_wrd_colr : #666666
         * page_btm_logo_img : http://image12.m1905.cn/mapps/uploadfile/2020/0612/2020061202182174923.png
         * page_empty_bg_colr : #FFFFFF
         * page_empty_img : http://image12.m1905.cn/mapps/uploadfile/2020/0630/2020063003484533587.png
         * page_empty_wrd : 未获取到内容
         * page_empty_wrd_colr : #666666
         */

        private String page_load_wrd_colr;
        private String page_btm_logo_img;
        private String page_empty_bg_colr;
        private String page_empty_img;
        private String page_empty_wrd;
        private String page_empty_wrd_colr;
        /**
         * page_tabin_colr : #4f9df9
         * page_tabout_colr : #999999
         * bills_tabin_colr : #4f9df9
         * bills_tabout_colr : #999999
         */

        private String page_tabin_colr;
        private String page_tabout_colr;
        private String bills_tabin_colr;
        private String bills_tabout_colr;

        public int getDef_icon_show() {
            return def_icon_show;
        }

        public void setDef_icon_show(int def_icon_show) {
            this.def_icon_show = def_icon_show;
        }

        public String getScore_colr() {
            return score_colr;
        }

        public void setScore_colr(String score_colr) {
            this.score_colr = score_colr;
        }

        public String getPage_bg_colr() {
            return page_bg_colr;
        }

        public void setPage_bg_colr(String page_bg_colr) {
            this.page_bg_colr = page_bg_colr;
        }

        public String getPage_border_colr() {
            return page_border_colr;
        }

        public void setPage_border_colr(String page_border_colr) {
            this.page_border_colr = page_border_colr;
        }

        public String getItem_def_bg_colr() {
            return item_def_bg_colr;
        }

        public void setItem_def_bg_colr(String item_def_bg_colr) {
            this.item_def_bg_colr = item_def_bg_colr;
        }

        public Map<String, Map<String, String>> getList() {
            return list;
        }

        public void setList(Map<String, Map<String, String>> list) {
            this.list = list;
        }

        public String getPage_load_colr_left() {
            return page_load_colr_left;
        }

        public void setPage_load_colr_left(String page_load_colr_left) {
            this.page_load_colr_left = page_load_colr_left;
        }

        public String getPage_load_colr_center() {
            return page_load_colr_center;
        }

        public void setPage_load_colr_center(String page_load_colr_center) {
            this.page_load_colr_center = page_load_colr_center;
        }

        public String getPage_load_colr_right() {
            return page_load_colr_right;
        }

        public void setPage_load_colr_right(String page_load_colr_right) {
            this.page_load_colr_right = page_load_colr_right;
        }

        public String getPage_load_wrd_colr() {
            return page_load_wrd_colr;
        }

        public void setPage_load_wrd_colr(String page_load_wrd_colr) {
            this.page_load_wrd_colr = page_load_wrd_colr;
        }

        public String getPage_btm_logo_img() {
            return page_btm_logo_img;
        }

        public void setPage_btm_logo_img(String page_btm_logo_img) {
            this.page_btm_logo_img = page_btm_logo_img;
        }

        public String getPage_empty_bg_colr() {
            return page_empty_bg_colr;
        }

        public void setPage_empty_bg_colr(String page_empty_bg_colr) {
            this.page_empty_bg_colr = page_empty_bg_colr;
        }

        public String getPage_empty_img() {
            return page_empty_img;
        }

        public void setPage_empty_img(String page_empty_img) {
            this.page_empty_img = page_empty_img;
        }

        public String getPage_empty_wrd() {
            return page_empty_wrd;
        }

        public void setPage_empty_wrd(String page_empty_wrd) {
            this.page_empty_wrd = page_empty_wrd;
        }

        public String getPage_empty_wrd_colr() {
            return page_empty_wrd_colr;
        }

        public void setPage_empty_wrd_colr(String page_empty_wrd_colr) {
            this.page_empty_wrd_colr = page_empty_wrd_colr;
        }

        public String getPage_tabin_colr() {
            return page_tabin_colr;
        }

        public void setPage_tabin_colr(String page_tabin_colr) {
            this.page_tabin_colr = page_tabin_colr;
        }

        public String getPage_tabout_colr() {
            return page_tabout_colr;
        }

        public void setPage_tabout_colr(String page_tabout_colr) {
            this.page_tabout_colr = page_tabout_colr;
        }

        public String getBills_tabin_colr() {
            return bills_tabin_colr;
        }

        public void setBills_tabin_colr(String bills_tabin_colr) {
            this.bills_tabin_colr = bills_tabin_colr;
        }

        public String getBills_tabout_colr() {
            return bills_tabout_colr;
        }

        public void setBills_tabout_colr(String bills_tabout_colr) {
            this.bills_tabout_colr = bills_tabout_colr;
        }
//        public Map<String, ListSkinBean> getList() {
//            return list;
//        }
//
//        public void setList(Map<String, ListSkinBean> list) {
//            this.list = list;
//        }

//        public static class ListSkinBean {
//
//            /**
//             * bg_colr : #FFFFFF
//             * sp_title_colr : #333333
//             * item_mask_colr : #000000
//             * item_border_colr : #f5f5f5
//             * item_title_colr : #FFFFFF
//             * item_live_colr : #FFFFFF
//             * item_lived_colr : #666666
//             * item_yy_img : link@home_ic_order
//             * item_yy_booked_img : link@home_ic_booked
//             * item_yy_people_colr : #FFFEFE
//             * more_title_colr : #666666
//             */
//
//            private String bg_colr;
//            private String sp_title_colr;
//            private String item_mask_colr;
//            private String item_border_colr;
//            private String item_title_colr;
//            private String item_live_colr;
//            private String item_lived_colr;
//            private String item_yy_img;
//            private String item_yy_booked_img;
//            private String item_yy_people_colr;
//            private String more_title_colr;
//            /**
//             * item_rd_in_colr : #FFFFFF
//             * item_rd_out_colr : #C4C4C4
//             */
//
//            private String item_rd_in_colr;
//            private String item_rd_out_colr;
//            /**
//             * item_bg_img : link@newfilm_bg
//             */
//
//            private String item_bg_img;
//            /**
//             * border_colr : #e4e4e4
//             */
//
//            private String border_colr;
//            /**
//             * item_wrd_colr : #666666
//             * more_bg_colr : #f5f5f5
//             */
//
//            private String item_wrd_colr;
//            private String more_bg_colr;
//            /**
//             * tag_wrd_colr : #f5f5f5
//             * booking_colr : #4F9DF9
//             */
//
//            private String tag_wrd_colr;
//            private String booking_colr;
//            /**
//             * item_ep_colr : #FFFFFFF
//             */
//
//            private String item_ep_colr;
//            /**
//             * tabin_wrd_colr : #4F9DF9
//             * tabout_wrd_colr : #999999
//             * rank_img_no1 : link@bangdan_rank_no1
//             * rank_img_no2 : link@bangdan_rank_no2
//             * rank_img_no3 : link@bangdan_rank_no3
//             * rank_img_nox : link@bangdan_rank_nox
//             * rank_wrd_colr : #FFFFFF
//             */
//
//            private String tabin_wrd_colr;
//            private String tabout_wrd_colr;
//            private String rank_img_no1;
//            private String rank_img_no2;
//            private String rank_img_no3;
//            private String rank_img_nox;
//            private String rank_wrd_colr;
//            /**
//             * item_wrd_bg_colr : #000000
//             * item_wrd_play_img : link@cut_ic_play
//             */
//
//            private String item_wrd_bg_colr;
//            private String item_wrd_play_img;
//            /**
//             * item_title_colr2 : #333333
//             * item_wrd_colr2 : #666666
//             */
//
//            private String item_title_colr2;
//            private String item_wrd_colr2;
//            /**
//             * item_boder_colr : #e1e1e1
//             */
//
//            private String item_boder_colr;
//            /**
//             * item_play_img : link@ic_associated
//             */
//
//            private String item_play_img;
//
//            public String getBg_colr() {
//                return bg_colr;
//            }
//
//            public void setBg_colr(String bg_colr) {
//                this.bg_colr = bg_colr;
//            }
//
//            public String getSp_title_colr() {
//                return sp_title_colr;
//            }
//
//            public void setSp_title_colr(String sp_title_colr) {
//                this.sp_title_colr = sp_title_colr;
//            }
//
//            public String getItem_mask_colr() {
//                return item_mask_colr;
//            }
//
//            public void setItem_mask_colr(String item_mask_colr) {
//                this.item_mask_colr = item_mask_colr;
//            }
//
//            public String getItem_border_colr() {
//                return item_border_colr;
//            }
//
//            public void setItem_border_colr(String item_border_colr) {
//                this.item_border_colr = item_border_colr;
//            }
//
//            public String getItem_title_colr() {
//                return item_title_colr;
//            }
//
//            public void setItem_title_colr(String item_title_colr) {
//                this.item_title_colr = item_title_colr;
//            }
//
//            public String getItem_live_colr() {
//                return item_live_colr;
//            }
//
//            public void setItem_live_colr(String item_live_colr) {
//                this.item_live_colr = item_live_colr;
//            }
//
//            public String getItem_lived_colr() {
//                return item_lived_colr;
//            }
//
//            public void setItem_lived_colr(String item_lived_colr) {
//                this.item_lived_colr = item_lived_colr;
//            }
//
//            public String getItem_yy_img() {
//                return item_yy_img;
//            }
//
//            public void setItem_yy_img(String item_yy_img) {
//                this.item_yy_img = item_yy_img;
//            }
//
//            public String getItem_yy_booked_img() {
//                return item_yy_booked_img;
//            }
//
//            public void setItem_yy_booked_img(String item_yy_booked_img) {
//                this.item_yy_booked_img = item_yy_booked_img;
//            }
//
//            public String getItem_yy_people_colr() {
//                return item_yy_people_colr;
//            }
//
//            public void setItem_yy_people_colr(String item_yy_people_colr) {
//                this.item_yy_people_colr = item_yy_people_colr;
//            }
//
//            public String getMore_title_colr() {
//                return more_title_colr;
//            }
//
//            public void setMore_title_colr(String more_title_colr) {
//                this.more_title_colr = more_title_colr;
//            }
//
//            public String getItem_rd_in_colr() {
//                return item_rd_in_colr;
//            }
//
//            public void setItem_rd_in_colr(String item_rd_in_colr) {
//                this.item_rd_in_colr = item_rd_in_colr;
//            }
//
//            public String getItem_rd_out_colr() {
//                return item_rd_out_colr;
//            }
//
//            public void setItem_rd_out_colr(String item_rd_out_colr) {
//                this.item_rd_out_colr = item_rd_out_colr;
//            }
//
//            public String getItem_bg_img() {
//                return item_bg_img;
//            }
//
//            public void setItem_bg_img(String item_bg_img) {
//                this.item_bg_img = item_bg_img;
//            }
//
//            public String getBorder_colr() {
//                return border_colr;
//            }
//
//            public void setBorder_colr(String border_colr) {
//                this.border_colr = border_colr;
//            }
//
//            public String getItem_wrd_colr() {
//                return item_wrd_colr;
//            }
//
//            public void setItem_wrd_colr(String item_wrd_colr) {
//                this.item_wrd_colr = item_wrd_colr;
//            }
//
//            public String getMore_bg_colr() {
//                return more_bg_colr;
//            }
//
//            public void setMore_bg_colr(String more_bg_colr) {
//                this.more_bg_colr = more_bg_colr;
//            }
//
//            public String getTag_wrd_colr() {
//                return tag_wrd_colr;
//            }
//
//            public void setTag_wrd_colr(String tag_wrd_colr) {
//                this.tag_wrd_colr = tag_wrd_colr;
//            }
//
//            public String getBooking_colr() {
//                return booking_colr;
//            }
//
//            public void setBooking_colr(String booking_colr) {
//                this.booking_colr = booking_colr;
//            }
//
//            public String getItem_ep_colr() {
//                return item_ep_colr;
//            }
//
//            public void setItem_ep_colr(String item_ep_colr) {
//                this.item_ep_colr = item_ep_colr;
//            }
//
//            public String getTabin_wrd_colr() {
//                return tabin_wrd_colr;
//            }
//
//            public void setTabin_wrd_colr(String tabin_wrd_colr) {
//                this.tabin_wrd_colr = tabin_wrd_colr;
//            }
//
//            public String getTabout_wrd_colr() {
//                return tabout_wrd_colr;
//            }
//
//            public void setTabout_wrd_colr(String tabout_wrd_colr) {
//                this.tabout_wrd_colr = tabout_wrd_colr;
//            }
//
//            public String getRank_img_no1() {
//                return rank_img_no1;
//            }
//
//            public void setRank_img_no1(String rank_img_no1) {
//                this.rank_img_no1 = rank_img_no1;
//            }
//
//            public String getRank_img_no2() {
//                return rank_img_no2;
//            }
//
//            public void setRank_img_no2(String rank_img_no2) {
//                this.rank_img_no2 = rank_img_no2;
//            }
//
//            public String getRank_img_no3() {
//                return rank_img_no3;
//            }
//
//            public void setRank_img_no3(String rank_img_no3) {
//                this.rank_img_no3 = rank_img_no3;
//            }
//
//            public String getRank_img_nox() {
//                return rank_img_nox;
//            }
//
//            public void setRank_img_nox(String rank_img_nox) {
//                this.rank_img_nox = rank_img_nox;
//            }
//
//            public String getRank_wrd_colr() {
//                return rank_wrd_colr;
//            }
//
//            public void setRank_wrd_colr(String rank_wrd_colr) {
//                this.rank_wrd_colr = rank_wrd_colr;
//            }
//
//            public String getItem_wrd_bg_colr() {
//                return item_wrd_bg_colr;
//            }
//
//            public void setItem_wrd_bg_colr(String item_wrd_bg_colr) {
//                this.item_wrd_bg_colr = item_wrd_bg_colr;
//            }
//
//            public String getItem_wrd_play_img() {
//                return item_wrd_play_img;
//            }
//
//            public void setItem_wrd_play_img(String item_wrd_play_img) {
//                this.item_wrd_play_img = item_wrd_play_img;
//            }
//
//            public String getItem_title_colr2() {
//                return item_title_colr2;
//            }
//
//            public void setItem_title_colr2(String item_title_colr2) {
//                this.item_title_colr2 = item_title_colr2;
//            }
//
//            public String getItem_wrd_colr2() {
//                return item_wrd_colr2;
//            }
//
//            public void setItem_wrd_colr2(String item_wrd_colr2) {
//                this.item_wrd_colr2 = item_wrd_colr2;
//            }
//
//            public String getItem_boder_colr() {
//                return item_boder_colr;
//            }
//
//            public void setItem_boder_colr(String item_boder_colr) {
//                this.item_boder_colr = item_boder_colr;
//            }
//
//            public String getItem_play_img() {
//                return item_play_img;
//            }
//
//            public void setItem_play_img(String item_play_img) {
//                this.item_play_img = item_play_img;
//            }
//        }
    }
}
