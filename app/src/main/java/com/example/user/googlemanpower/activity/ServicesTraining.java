package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.user.googlemanpower.R;

public class ServicesTraining extends AppCompatActivity {
    WebView tv2;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_training);
        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText("Training and Orientation");
        tv2=(WebView) findViewById(R.id.tv2);
        String text = "<html><body>"
                + "<p style=\"font-size:18px\" align=\"justify\">"
                + "We have managed the training as per the requirement of the particular candidate no matter what they are unskilled labour or highly skilled engineers & chartered accountants, training is conducted to meet the jobs' specification and requirements as per the demand of the client companies\n" +
                "\n" +
                "The government of many countries requires the entire contract workers to attend the pre-departure orientation classes before their entry in the respective country. For this, to let the traveling people participate in such classes we make arrangement of such classes in the qualified centers in Nepal, this will enable to know the workers of the condition of their host country, their political & religious situation, rules & regulations to be followed, their working environment & so on."
                + "</p> "

                + "</body></html>";
        tv2.loadData(text, "text/html", null);
    }
}
