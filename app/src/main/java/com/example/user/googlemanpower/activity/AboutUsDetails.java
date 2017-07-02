package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.ImageAdapterAboutUs;
import in.srain.cube.views.GridViewWithHeaderAndFooter;

public class AboutUsDetails extends AppCompatActivity {
   ListView lv;
ImageAdapterAboutUs imageAdapterAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_details);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new ImageAdapterAboutUs(this));
    }

}