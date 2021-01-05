package com.maxi.dynamicskinlibrary.deployer;

import android.view.View;

import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

/**
 * Created by maxi on 2020/6/12.
 */
public interface ISkinApplyDeployer {
    void apply(View view, BaseSkinBean.SkinSetBean skinBean, String style, String attrValue);
}
