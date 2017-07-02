package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.user.googlemanpower.R;

public class AboutUs extends AppCompatActivity {
    WebView webView1;
    ListView lv;
    ArrayAdapter<String>adapter;
    String[]topic={"Vision mission and objectives","Management Team","About Nepal","Compuetrized data bank","Oraganization Strucuture","Licence & Certificate"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        lv=(ListView)findViewById(R.id.listView);
        View header = getLayoutInflater().inflate(R.layout.activity_about_us,null);
        lv.addHeaderView(header, null, false);
        webView1=(WebView)header.findViewById(R.id.textView1);
        adapter=new ArrayAdapter<String>(this,R.layout.about_us_list_item,topic);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch(position){

                    case 0 :intent = new Intent(AboutUs.this, AboutUsDetails.class);
                        startActivity(intent);
                        break;
                    case 1 :intent = new Intent(AboutUs.this,AboutUsDetails.class);
                        startActivity(intent);
                        break;
                    case 2 :intent = new Intent(AboutUs.this, AboutUsManagementTeam.class);
                        startActivity(intent);
                        break;
                    case 3 :intent = new Intent(AboutUs.this, AboutNepal.class);
                        startActivity(intent);
                        break;
                    case 4 :intent = new Intent(AboutUs.this, OrganizationChart.class);
                        startActivity(intent);
                        break;
                    case 5 :intent = new Intent(AboutUs.this, ServicesTravel.class);
                        startActivity(intent);
                        break;
                    case 6 :intent = new Intent(AboutUs.this, ServicesTravel.class);
                        startActivity(intent);
                        break;

                }

            }

        });

        String text = "<html><body>"
                + "<p style=\"font-size:18px\" align=\"justify\">"
                + "\"Google Overseas Pvt. Ltd. would like to extend it's warm welcome to all of the clients,bussiness parties as well as each and every individuals who choose us for their perfcet and successful future destination.\" Since the founding of the company, our essential ingredients and philosophy has been to strive for excellence and become the primary provider of competitive, efficient and reliable Human Resources Solutions.\" Quality Never says Sorry \" is the moral value of our business.The high regard in which we are held today."
                + "</p> "

                + "</body></html>";
        webView1.loadData(text, "text/html", null);



    }
}
