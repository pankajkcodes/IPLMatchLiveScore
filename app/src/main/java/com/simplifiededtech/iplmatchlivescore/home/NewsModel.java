package com.simplifiededtech.iplmatchlivescore.home;

public class NewsModel {

    String imgUrl;
    String title;
    String desc;

    public NewsModel(String imgUrl, String title, String desc) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.desc = desc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
