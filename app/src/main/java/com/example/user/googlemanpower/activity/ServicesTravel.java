package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.user.googlemanpower.R;

public class ServicesTravel extends AppCompatActivity {
    WebView tv2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_training);
        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText("Travel Management");
        tv2=(WebView) findViewById(R.id.tv2);
        String text = "<html><body>"
                + "<p style=\"font-size:18px\" align=\"justify\">"
                + "Upon receiving the documents like visa & employment contract from the employer, the documents (passport & visa) will be handed over to the travel agents so as to make the flight confirmation in the right time. Employers are required to send the flight confirmation & PTA in favor of recruiting agents to facilitate the selected workers. Flight details, in an advance of at least 24 hrs, will be furnished to the employer companies in order to enable them to arrange their airport pick & necessary accommodation in time."+"</p>"
                + "</body></html>";
        tv2.loadData(text, "text/html", null);


    }
}
