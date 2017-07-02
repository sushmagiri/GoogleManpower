package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.ImagePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FullImageActivity extends AppCompatActivity {
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        Intent intent=getIntent();
        position=intent.getExtras().getInt("id");
        final GalleryAdapter galleryAdapter = new GalleryAdapter(this);
        List<ImageView> images = new ArrayList<>();
        // Retrieve all the images
        for (int i = 0; i < galleryAdapter.getCount(); i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(galleryAdapter.imgIds[i]);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            images.add(imageView);

//            TextView textView=new TextView(this);
//            imageTitle.setText(galleryAdapter.gridText[i]);
        }

        // Set the images into ViewPager
        final TextView textView=(TextView)findViewById(R.id.image_title) ;
        ImagePagerAdapter pageradapter = new ImagePagerAdapter(images);
        ViewPager viewpager = (ViewPager) findViewById(R.id.pager);
        viewpager.setAdapter(pageradapter);
        // Show images following the position
        viewpager.setCurrentItem(position);
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                textView.setText(galleryAdapter.gridText[position]);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
