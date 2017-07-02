package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.ServiceAdapter;

public class Services extends AppCompatActivity {
    ListView lv;
    String[] Services={"Overseas Recruitment","Training and Orientation","Travel Management"};
    ServiceAdapter serviceAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_services);
        lv=(ListView)findViewById(R.id.listView);
        serviceAdapter=new ServiceAdapter(getApplicationContext(),Services);
        lv.setAdapter(serviceAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           Intent intent;
                switch(position){

                case 0 :intent = new Intent(Services.this, OverSeasRecruitment.class);
                startActivity(intent);
                break;
                case 1 :intent = new Intent(Services.this,ServicesTraining.class);
                startActivity(intent);
                break;
                case 2 :intent = new Intent(Services.this, ServicesTravel.class);
                startActivity(intent);
                break;
            }

        }

        });
}
}
