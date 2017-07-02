package com.example.user.googlemanpower.Models;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by user on 9/21/2016.
 */
public class ImageItem implements Serializable{
    private Bitmap image;
    private String title;
    private int imageId;

    public ImageItem(Bitmap image, String title,int imageId) {
        super();
        this.image = image;
        this.title = title;
        this.imageId=imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
