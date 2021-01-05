package com.maxi.dynamicskindemo.bean;

/**
 * Created by maxi on 2021/01/05.
 */
public class DemoBean {
    public static final int TYPE_AD = 10001;
    public static final int TYPE_TEXT = 10002;
    public static final int TYPE_IMAGE = 10003;
    public static final int TYPE_NEW = 10004;

    public DemoBean(int type) {
        this.type = type;
    }

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
