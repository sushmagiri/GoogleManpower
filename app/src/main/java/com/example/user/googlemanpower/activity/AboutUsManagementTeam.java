package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import com.example.user.googlemanpower.Models.ImageItem;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.GridAdapter;

import java.util.ArrayList;

public class AboutUsManagementTeam extends AppCompatActivity {
    private GridView gridView;
    private GridAdapter gridAdapter;
//    ArrayList<ImageItem> imageItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        gridView = (GridView) findViewById(R.id.gridView);
        gridAdapter = new GridAdapter(this, R.layout.grid_item_layout_gallery, getData());
        gridView.setAdapter(gridAdapter);
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
//            {
//                ImageItem item = (ImageItem) parent.getItemAtPosition(position);
////                Intent intent = new Intent(AboutUsManagementTeam.this, GalleryDetails.class);
//////                 intent.putExtra("title", imageItems.get(position-1));
//                Intent intent = new Intent(AboutUsManagementTeam.this, GalleryDetails.class);
//                intent.putExtra("title", item.getTitle());
//                intent.putExtra("image", item.getImage());
//
//                //Start details activity
//                startActivity(intent);
//
//            }
//
//        });
    }
    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(bitmap, "Image" + i,1));
        }
        return imageItems;
    }
}
