package com.example.user.googlemanpower.Models;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by user on 9/27/2016.
 */
public class AoutUsItem implements Serializable {
    private int image;
    private String title;
    private String content;

    public AoutUsItem(int image, String title, String content) {
        this.image = image;
        this.title = title;
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
