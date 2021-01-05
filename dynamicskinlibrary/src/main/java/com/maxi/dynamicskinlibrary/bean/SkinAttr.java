package com.maxi.dynamicskinlibrary.bean;

import android.view.View;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maxi on 2020/6/11.
 */
public class SkinAttr {

    public View view;
    public String viewFrom;
    public Map<String ,String> attrs = new HashMap<>();

    public SkinAttr(View view, String viewFrom, Map<String, String> attrs) {
        this.view = view;
        this.viewFrom = viewFrom;
        this.attrs = attrs;
    }
}
