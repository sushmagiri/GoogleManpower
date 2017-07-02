package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import com.example.user.googlemanpower.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MalaysiaVisaProcessing extends AppCompatActivity {
ListView lv;

ArrayAdapter<String >adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaysia_visa_processing);
        lv=(ListView)findViewById(R.id.listView);




    }
}
