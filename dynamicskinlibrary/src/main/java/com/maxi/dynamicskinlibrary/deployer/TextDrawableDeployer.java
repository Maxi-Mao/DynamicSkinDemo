package com.maxi.dynamicskinlibrary.deployer;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.maxi.dynamicskinlibrary.SkinCommonLayoutUtil;
import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

/**
 * 用于设置drawableRight图片背景
 * Created by maxi on 2020/6/12.
 */
public class TextDrawableDeployer implements ISkinApplyDeployer {
    public final static int DRAWABLE_RIGHT = 1;
    public final static int DRAWABLE_LEFT = 2;
    private int typeDrawable = DRAWABLE_RIGHT;

    public TextDrawableDeployer(int type) {
        this.typeDrawable = type;
    }

    @Override
    public void apply(final View view, BaseSkinBean.SkinSetBean skinBean, String style, String attrValue) {
        try {
            if (!TextUtils.isEmpty(attrValue) && view instanceof TextView) {
                String drawableRightImg = style.equals("root") ?
                        SkinCommonLayoutUtil.getDynamicRootConfig(skinBean, attrValue) :
                        skinBean.getList().get(style).get(attrValue);
                Drawable[] drawables = ((TextView) view).getCompoundDrawables();
                Drawable oldDrawable = null;
                switch (typeDrawable) {
                    case DRAWABLE_LEFT:
                        oldDrawable = drawables[0];
                        break;
                    case DRAWABLE_RIGHT:
                        oldDrawable = drawables[2];
                        break;
                }
                final Drawable finalOldDrawable = oldDrawable;
                Glide.with(view.getContext())
                        .asBitmap()
                        .load(drawableRightImg)
                        .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        Drawable navRight = new BitmapDrawable(resource);
                        if(finalOldDrawable != null){
                            navRight.setBounds(finalOldDrawable.getBounds());
                        }else {
                            navRight.setBounds(0, 0, resource.getWidth(), resource.getHeight());
                        }
                        switch (typeDrawable) {
                            case DRAWABLE_LEFT:
                                ((TextView) view).setCompoundDrawables(navRight, null, null, null);
                                break;
                            case DRAWABLE_RIGHT:
                            default:
                                ((TextView) view).setCompoundDrawables(null, null, navRight, null);
                                break;
                        }
                    }
                });
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
