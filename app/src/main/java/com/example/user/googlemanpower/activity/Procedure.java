package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.googlemanpower.Models.RecruitItem;
import com.example.user.googlemanpower.R;

public class Procedure extends AppCompatActivity {
    ListView lv;
    View rootView;
    ArrayAdapter<String> adapter;
    String[] text={"Documentation","Recruitment Process","Deployment Procedure","Visa Processing","Saudi Visa Processing","Malaysia Visa Processing","Employers Responsibility"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedure);
        lv=(ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,R.layout.about_us_list_item, text);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch(position){

                    case 0 :intent = new Intent(Procedure.this, Documentation.class);
                        startActivity(intent);
                        break;
                    case 1 :intent = new Intent(Procedure.this,RecruitmentProcess.class);
                        startActivity(intent);
                        break;
                    case 2 :intent = new Intent(Procedure.this, RecruitmentProcess.class);
                        startActivity(intent);
                        break;
                    case 3 :intent = new Intent(Procedure.this, SaudiVisaProcessing.class);
                        startActivity(intent);
                        break;
                    case 4 :intent = new Intent(Procedure.this, SaudiVisaProcessing.class);
                        startActivity(intent);
                        break;
                    case 5 :intent = new Intent(Procedure.this, SaudiVisaProcessing.class);
                        startActivity(intent);
                        break;
                    case 6 :intent = new Intent(Procedure.this, EmployeeResponsibility.class);
                        startActivity(intent);
                        break;

                }

            }

        });


    }
}
