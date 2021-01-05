package com.maxi.dynamicskinlibrary;

import android.text.TextUtils;

import com.maxi.dynamicskinlibrary.deployer.BgBorderStrokeDeployer;
import com.maxi.dynamicskinlibrary.deployer.BgColorDeployer;
import com.maxi.dynamicskinlibrary.deployer.BgImgDeployer;
import com.maxi.dynamicskinlibrary.deployer.ISkinApplyDeployer;
import com.maxi.dynamicskinlibrary.deployer.TextColorDeployer;
import com.maxi.dynamicskinlibrary.deployer.TextDrawableDeployer;
import com.maxi.dynamicskinlibrary.deployer.UnusualBgColorDeployer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maxi on 2020/6/12.
 */
public class SkinDeployerFactory {

    public final static String SKIN_STYLE = "skinStyle";
    public final static String SKIN_VIEW_FROM = "skinViewFrom";
    public final static String SKIN_TEXT_COLOR = "textColor";
    public final static String SKIN_BG_COLOR = "bgColor";
    public final static String SKIN_BG_IMG = "bgImg";
    public final static String SKIN_DRAWABLE_RIGHT = "skinDrawableRight";
    public final static String SKIN_DRAWABLE_LEFT = "skinDrawableLeft";
    public final static String SKIN_UNUSUAL_BG_COLOR = "unusualBgColor";
    public final static String SKIN_BG_BORDER_COLOR = "bgBorderColor";


    private static Map<String, ISkinApplyDeployer> mSupportedSkinDeployerMap = new HashMap<String, ISkinApplyDeployer>();

    static {
        registerDeployer(SKIN_TEXT_COLOR, new TextColorDeployer());
        registerDeployer(SKIN_BG_COLOR, new BgColorDeployer());
        registerDeployer(SKIN_BG_IMG, new BgImgDeployer());
        registerDeployer(SKIN_DRAWABLE_RIGHT, new TextDrawableDeployer(TextDrawableDeployer.DRAWABLE_RIGHT));
        registerDeployer(SKIN_DRAWABLE_LEFT, new TextDrawableDeployer(TextDrawableDeployer.DRAWABLE_LEFT));
        registerDeployer(SKIN_UNUSUAL_BG_COLOR, new UnusualBgColorDeployer());
        registerDeployer(SKIN_BG_BORDER_COLOR, new BgBorderStrokeDeployer());
    }

    public static void registerDeployer(String attrName, ISkinApplyDeployer skinApplyDeployer) {
        if (TextUtils.isEmpty(attrName) || null == skinApplyDeployer) {
            return;
        }
        if (mSupportedSkinDeployerMap.containsKey(attrName)) {
            throw new IllegalArgumentException("The attrName has been registed, please rename it");
        }
        mSupportedSkinDeployerMap.put(attrName, skinApplyDeployer);
    }

    public static ISkinApplyDeployer of(String attrName) {
        if (TextUtils.isEmpty(attrName)) {
            return null;
        }
        return mSupportedSkinDeployerMap.get(attrName);
    }

    public static boolean isSupportedAttr(String attrName) {
        return of(attrName) != null;
    }

}
