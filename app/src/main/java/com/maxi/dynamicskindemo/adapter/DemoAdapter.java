package com.maxi.dynamicskindemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.maxi.dynamicskindemo.R;
import com.maxi.dynamicskindemo.bean.DemoBean;
import com.maxi.dynamicskinlibrary.SkinCommonLayoutUtil;

import java.util.List;

import static com.maxi.dynamicskindemo.bean.DemoBean.TYPE_AD;
import static com.maxi.dynamicskindemo.bean.DemoBean.TYPE_IMAGE;
import static com.maxi.dynamicskindemo.bean.DemoBean.TYPE_NEW;
import static com.maxi.dynamicskindemo.bean.DemoBean.TYPE_TEXT;

/**
 * Created by maxi on 2021/01/05.
 */
public class DemoAdapter extends RecyclerView.Adapter {
    private List<DemoBean> mData;
    private LayoutInflater layoutInflater;

    public DemoAdapter(Context context, List<DemoBean> mData) {
        this.mData = mData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_AD:
                return new BannerViewHolder(layoutInflater.inflate(R.layout.item_ad_item_layout, parent, false));
            case TYPE_TEXT:
                return new TextViewHolder(layoutInflater.inflate(R.layout.item_text_item_layout, parent, false));
            case TYPE_IMAGE:
                return new ImageViewHolder(layoutInflater.inflate(R.layout.item_image_item_layout, parent, false));
            case TYPE_NEW:
                return new NewViewHolder(layoutInflater.inflate(R.layout.item_news_item_layout, parent, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int type = getItemViewType(position);
        switch (type) {
            case TYPE_AD:
                break;
            case TYPE_TEXT:
                break;
            case TYPE_IMAGE:
                break;
            case TYPE_NEW:
                NewViewHolder newViewHolder = (NewViewHolder) holder;
                SkinCommonLayoutUtil.initBgColorSkin(newViewHolder.itemView,"MainActivity",TYPE_NEW+"","bg_colr");
                SkinCommonLayoutUtil.initBgImgSkin(newViewHolder.ivTest,"MainActivity",TYPE_NEW+"","item_bg_img");
                SkinCommonLayoutUtil.initTextColorSkin(newViewHolder.tvTest,"MainActivity",TYPE_NEW+"","item_title_colr");
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_AD;
        } else {
            return mData.get(position).getType();//type 的值为TYPE_AD，TYPE_IMAGE，TYPE_AD，等其中一个
        }

    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }


    public static class BannerViewHolder extends RecyclerView.ViewHolder {

        public BannerViewHolder(View itemView) {
            super(itemView);
        }
    }

    public static class AdViewHolder extends RecyclerView.ViewHolder {

        public AdViewHolder(View itemView) {
            super(itemView);
        }
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {

        public TextViewHolder(View itemView) {
            super(itemView);
        }
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        public ImageViewHolder(View itemView) {
            super(itemView);
        }
    }
    public static class NewViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivTest;
        public TextView tvTest;
        public NewViewHolder(View itemView) {
            super(itemView);
            ivTest = itemView.findViewById(R.id.iv_new_test);
            tvTest = itemView.findViewById(R.id.tv_new_test);
        }
    }
}
