package com.maxi.dynamicskindemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.LayoutInflaterCompat;

import com.maxi.dynamicskinlibrary.SkinInflaterFactory;
import com.maxi.dynamicskinlibrary.SkinManager;

/**
 * Created by maxi on 2021/01/05.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private SkinInflaterFactory mSkinInflaterFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (supportChangeSkin()) {
            mSkinInflaterFactory = new SkinInflaterFactory();
            mSkinInflaterFactory.setAppCompatDelegate(getDelegate());
            LayoutInflaterCompat.setFactory2(getLayoutInflater(), mSkinInflaterFactory);
        }
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        findView();
        initWidget();
        initData();
        initListener();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (supportChangeSkin() && mSkinInflaterFactory != null) {
            SkinManager.getInstance().setSkinInflaterFactory(mSkinInflaterFactory);
        } else {
            SkinManager.getInstance().setSkinInflaterFactory(null);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mSkinInflaterFactory != null) {
            mSkinInflaterFactory.release();
        }
    }

    protected abstract int getContentView();

    protected abstract void findView();

    protected abstract void initWidget();

    protected abstract void initData();

    protected abstract void initListener();

    /**
     * 默认返回false
     *
     * @return
     */
    protected boolean supportChangeSkin() {
        return false;
    }
}
