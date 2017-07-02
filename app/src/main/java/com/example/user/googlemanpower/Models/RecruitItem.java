package com.example.user.googlemanpower.Models;

import java.io.Serializable;

/**
 * Created by user on 8/25/2016.
 */
public class RecruitItem implements Serializable {
    public String news_title,news_body,date;
    public int image;

    public RecruitItem(String news_title, String news_body, int image, String date) {
        this.news_title = news_title;
        this.news_body = news_body;
        this.image = image;
        this.date=date;

    }




    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_body() {
        return news_body;
    }

    public void setNews_body(String news_body) {
        this.news_body = news_body;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }


}
