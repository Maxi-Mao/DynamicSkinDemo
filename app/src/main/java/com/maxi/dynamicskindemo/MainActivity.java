package com.maxi.dynamicskindemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.maxi.dynamicskindemo.adapter.DemoAdapter;
import com.maxi.dynamicskindemo.bean.DemoBean;
import com.maxi.dynamicskinlibrary.DynamicConfigUtil;
import com.maxi.dynamicskinlibrary.bean.BaseSkinBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private TextView tvChangeSkin;
    private RecyclerView rvContent;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void findView() {
        tvChangeSkin = findViewById(R.id.tv_change_skin);
        rvContent = findViewById(R.id.rv_content);
    }

    @Override
    protected void initWidget() {
        rvContent.setLayoutManager(new LinearLayoutManager(this));
        List<DemoBean> mData = new ArrayList<>();
        for (int index = 1; index < 5; index++) {
            mData.add(new DemoBean(10000 + index));
        }
        rvContent.setAdapter(new DemoAdapter(this, mData));
    }

    @Override
    protected void initData() {
        DynamicConfigUtil.getInstance().setSkinData(getTestSkin(), "MainActivity");
    }

    @Override
    protected void initListener() {
        tvChangeSkin.setOnClickListener(this);
    }

    @Override
    protected boolean supportChangeSkin() {
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_change_skin:
                initData();
                break;
            default:
                break;
        }
    }

    public BaseSkinBean.SkinSetBean getTestSkin() {
        String test1 = "{\n" +
                "  \"page_bg_colr\":\"" + getRandColor() + "\",\n" +
                "  \"list\":{\n" +
                "  \"10001\":{\n" +
                "    \"bg_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_bg_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_title_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_left_img\":\"" + getRandImg() + "\"\n" +
                "  },\n" +
                "  \"10002\":{\n" +
                "    \"bg_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_title_colr\":\"" + getRandColor() + "\"\n" +
                "  },\n" +
                "  \"10003\":{\n" +
                "    \"bg_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_title_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_bg_img\":\"" + getRandImg() + "\"\n" +
                "  },\n" +
                "  \"10004\":{\n" +
                "    \"bg_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_title_colr\":\"" + getRandColor() + "\",\n" +
                "    \"item_bg_img\":\"" + getRandImg() + "\"\n" +
                "  }\n" +
                "}" + "}";
        Log.i("TEST", test1);
        return new Gson().fromJson(test1, BaseSkinBean.SkinSetBean.class);
    }

    public String getRandColor() {
        String r, g, b;
        Random random = new Random();
        r = Integer.toHexString(random.nextInt(256)).toUpperCase();
        g = Integer.toHexString(random.nextInt(256)).toUpperCase();
        b = Integer.toHexString(random.nextInt(256)).toUpperCase();

        r = r.length() == 1 ? "0" + r : r;
        g = g.length() == 1 ? "0" + g : g;
        b = b.length() == 1 ? "0" + b : b;
        return "#" + r + g + b;
//        return r+g+b;
    }

    public String getRandImg() {
        String imgs[] = {"https://img.xjh.me/desktop/img/63418675_p0.jpg",
                "https://img.xjh.me/desktop/img/50966164_p0.jpg",
                "https://img.xjh.me/desktop/img/63075444_p0.jpg",
                "https://img.xjh.me/desktop/img/54260027_p0.jpg",
                "https://img.xjh.me/desktop/img/59908708_p0.jpg",
                "https://img.xjh.me/desktop/img/62841180_p0.jpg"};
        return imgs[ThreadLocalRandom.current().nextInt(0, 5)];
    }
}
