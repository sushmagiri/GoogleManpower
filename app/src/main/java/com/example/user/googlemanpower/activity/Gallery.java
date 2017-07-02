package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.user.googlemanpower.R;

public class Gallery extends AppCompatActivity {
    GridView gridView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        gridView= (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GalleryAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(Gallery.this,FullImageActivity.class);
//                Toast.makeText(Gallery.this,""+i,Toast.LENGTH_SHORT).show();
                intent.putExtra("id",i);
                startActivity(intent);

            }
        });






    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
