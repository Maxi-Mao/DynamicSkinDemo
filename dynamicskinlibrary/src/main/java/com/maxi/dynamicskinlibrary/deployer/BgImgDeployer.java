package com.maxi.dynamicskinlibrary.deployer;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.maxi.dynamicskinlibrary.SkinCommonLayoutUtil;
import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

/**
 * 用于设置网络图片背景
 * Created by maxi on 2020/6/12.
 */
public class BgImgDeployer implements ISkinApplyDeployer {
    @Override
    public void apply(final View view, BaseSkinBean.SkinSetBean skinBean, String style, String attrValue) {
        try {
            if (!TextUtils.isEmpty(attrValue)) {
                String bgImg = style.equals("root") ?
                        SkinCommonLayoutUtil.getDynamicRootConfig(skinBean, attrValue) :
                        skinBean.getList().get(style).get(attrValue);
                Drawable oldDrawable = null;
                if (view instanceof ImageView && ((ImageView) view).getBackground() == null) {
                    oldDrawable = ((ImageView) view).getDrawable();
                } else {
                    oldDrawable = view.getBackground();
                }
                final Drawable finalOldDrawable = oldDrawable;
                Glide.with(view.getContext())
                        .asBitmap()
                        .load(bgImg)
                        .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        if (finalOldDrawable != null) {
                            float scale = (float) finalOldDrawable.getIntrinsicHeight() / resource.getHeight();
                            if (scale > 0) {
                                resource = scaleBitmap(resource, scale);
                            }
                        }
                        if (view instanceof ImageView && ((ImageView) view).getBackground() == null) {
                            ((ImageView) view).setImageBitmap(resource);
                        } else {
                            Resources resources = view.getContext().getResources();
                            view.setBackground(new BitmapDrawable(resources, resource));
                        }
                    }


                });
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    /**
     * 按比例缩放图片
     *
     * @param origin 原图
     * @param ratio  比例
     * @return 新的bitmap
     */
    public static Bitmap scaleBitmap(Bitmap origin, float ratio) {
        if (origin == null) {
            return null;
        }
        int width = origin.getWidth();
        int height = origin.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(ratio, ratio);
        Bitmap newBM;
        try {
            newBM = Bitmap.createBitmap(origin, 0, 0, width, height, matrix, false);
        } catch (Exception e) {
            return null;
        }
        if (newBM != null && newBM.equals(origin)) {
            return newBM;
        }
        //快速刷新时会有native层报错：'Error, cannot access an invalid/free'd bitmap here!，所以这里注掉
//        origin.recycle();
        return newBM;
    }
}
