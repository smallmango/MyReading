package com.mango.myreading.model;

/**
 * Created by Administrator on 2015/9/8 0008.
 */
public class Story {

    private String title;
    private String textUrl;

    public Story() {
    }

    public Story(String title, String textUrl) {
        this.title = title;
        this.textUrl = textUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextUrl() {
        return textUrl;
    }

    public void setTextUrl(String textUrl) {
        this.textUrl = textUrl;
    }
}
