package com.example.user.googlemanpower.Models;

import java.io.Serializable;

/**
 * Created by user on 10/4/2016.
 */
public class ManpowerItem implements Serializable {
    public String title;
    public int image;
    public String[]content;

    public ManpowerItem(String title, String[] content, int image) {
        this.title = title;
       this.content=content;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }
}
