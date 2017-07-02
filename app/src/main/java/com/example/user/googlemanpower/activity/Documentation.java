package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

import com.example.user.googlemanpower.R;

public class Documentation extends AppCompatActivity {
    WebView rd,dl,pa,ec,aa;
    Button vs1,vs2,vs3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentation);
        rd=(WebView)findViewById(R.id.wb_rd);
        dl=(WebView)findViewById(R.id.dl);
        pa=(WebView)findViewById(R.id.pa);
        ec=(WebView)findViewById(R.id.ec);
        aa=(WebView)findViewById(R.id.aa);
        String text = "<html><body>"
                +"<h style=\"font-size:20px\"align=\"justify\">"+"Requirement of Legal Documents from Employer Company"+"</h>"
                + "<p style=\"font-size:18px\" align=\"justify\">"+"Requirements of legal documents varies country to country. Common to all are 5 legal documents as detailed below. These documents should be in Employer Company Letterhead, properly signed and stamped by company authority. These documents should get attested from Chamber of Commerce &/or Nepal Embassy of the respective country. In case of Saudi Arabia, attestation from Ministry of Foreign Affairs (MOFA ) in addition is mandatory. For Malaysia, Notery Public Attestation and Nepal Embassy Attestation is needed."

                + "</p> "

                + "</body></html>";
        rd.loadData(text, "text/html", null);
        String text1 = "<html><body>"
                +"<h style=\"font-size:20px\"align=\"justify\">"+"Demand Letter"+"</h>"
                + "<p style=\"font-size:18px\" align=\"justify\">"+"A letter from the Employer Company mentioning number of workers required, salary scale, duty hours, food accommodation & other facilities provided."
                + "</p> "
                + "</body></html>";
        dl.loadData(text1, "text/html", null);
        String text3 = "<html><body>"
                +"<h style=\"font-size:20px\"align=\"justify\">"+"Power of Attorney"+"</h>"
                + "<p style=\"font-size:18px\" align=\"justify\">"+"Authorizing our company to be a true and lawful attorney and agent in this country."
                + "</p> "
                + "</body></html>";
        pa.loadData(text3, "text/html", null);
        String text4 = "<html><body>"
                +"<h style=\"font-size:20px\"align=\"justify\">"+"Employment Contract"+"</h>"
                + "<p style=\"font-size:18px\" align=\"justify\">"+"Service Contract between the employer and the employee mentioning salary and benefits offered to the employee with detailed terms & conditions."
                + "</p> "
                + "</body></html>";
        ec.loadData(text4, "text/html", null);
        String text5 = "<html><body>"
                +"<h style=\"font-size:20px\"align=\"justify\">"+"Agency Agreement"+"</h>"
                + "<p style=\"font-size:18px\" align=\"justify\">"+"Commercial contract between the employer and our agency, duly signed and stamped by both parties."
                + "</p> "
                + "</body></html>";
        aa.loadData(text5, "text/html", null);


    }
}
