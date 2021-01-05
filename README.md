# DynamicSkinDemo
根据后台返回json数据动态切换app皮肤。

#### 演示效果
![演示效果](https://github.com/Maxi-Mao/DynamicSkinDemo/blob/main/img/Screenshot_2021_0105_163021.gif)

#### 使用方法

```
    接入方法请参考BaseActivity
```

##### xml静态接入
```
    skin:bgColor="page_bg_colr"
    skin:enable="true"
    skin:skinStyle="root"
    skin:skinViewFrom="MainActivity"
```

##### 代码动态接入
```
                SkinCommonLayoutUtil.initBgColorSkin(newViewHolder.itemView,"MainActivity",TYPE_NEW+"","bg_colr");
                SkinCommonLayoutUtil.initBgImgSkin(newViewHolder.ivTest,"MainActivity",TYPE_NEW+"","item_bg_img");
                SkinCommonLayoutUtil.initTextColorSkin(newViewHolder.tvTest,"MainActivity",TYPE_NEW+"","item_title_colr");
```

#### 参数说明
```
enable：true 打开换肤
skinStyle：root 为后台返回根布局数据，10001等可以自己设置，为后台返回对应style
bgColor 背景颜色
textColor 字体颜色
bgImg 背景图片
skinDrawableRight textview的drawableRight图片
skinDrawableLeft textview的drawableLeft图片
unusualBgColor 部分特殊情况需要自己处理
bgBorderColor 背景shape中的 只设置边框的情况

skinViewFrom 自己设置，主要是区分没个页面的皮肤数据，一个页面的数据只用在该页面上即可。

后台返回皮肤数据举例：
page_bg_colr即为skin:skinStyle="root"
列表中10001 10002等即为skin:skinStyle="10001" skin:skinStyle="10002"
{
	"page_bg_colr": "#A2188A",
	"list": {
		"10001": {
			"bg_colr": "#624B56",
			"item_bg_colr": "#7E706E",
			"item_title_colr": "#6AA2A4",
			"item_left_img": "http:\/\/image12.m1905.cn\/mapps\/uploadfile\/2020\/0605\/2020060501442128153.png"
		},
		"10002": {
			"bg_colr": "#591FD1",
			"item_title_colr": "#C6A653"
		},
		"10003": {
			"bg_colr": "#596559",
			"item_title_colr": "#313F05",
			"item_bg_img": "http:\/\/image12.m1905.cn\/mapps\/uploadfile\/2020\/1028\/2020102803292134057.png"
		},
		"10004": {
			"bg_colr": "#596559",
			"item_title_colr": "#313F05",
			"item_bg_img": "http:\/\/image12.m1905.cn\/mapps\/uploadfile\/2020\/1028\/2020102803292134057.png"
		}
	}
}
```