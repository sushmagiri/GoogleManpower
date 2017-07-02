package com.example.user.googlemanpower.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Otimus on 9/19/2016.
 */
public class ImagePagerAdapter extends PagerAdapter {
    private List<ImageView> images;



    public ImagePagerAdapter(List<ImageView> images) {
        this.images = images;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = images.get(position);
        container.addView(imageView);
        return imageView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(images.get(position));
        // Remove viewpager_item.xml from ViewPager

    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
