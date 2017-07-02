package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.googlemanpower.Models.ImageItem;
import com.example.user.googlemanpower.R;
import com.squareup.picasso.Picasso;

public class GalleryDetails extends ActionBarActivity {
int position;
    ImageItem imageItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_details);
//        Intent intent=getIntent();
//        position=intent.getExtras().getInt("title");
        Intent intent=getIntent();
        imageItem=(ImageItem)intent.getSerializableExtra("data");

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText(imageItem.getTitle());
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Picasso.with(this).load(imageItem.getImageId()).into(imageView);
    }
}
