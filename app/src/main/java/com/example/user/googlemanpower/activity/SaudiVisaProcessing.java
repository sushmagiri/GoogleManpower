package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.user.googlemanpower.R;

public class SaudiVisaProcessing extends AppCompatActivity {
    ListView lv;
    TextView svp,svp_data;
String[] text={"Employers provide us electronic-wakala (E-wakala) as well as 5 legal documents in specified format, after getting attestations from Chamber of Commerce & Foreign Affairs Ministry (MOFA) of Saudi Arabia.","Selection of the candidates by the company representatives or by our own HR experts as per the demand.","Acquire the MOFA number of each candidate from the website of Saudi Government (Paradise International has been authorized and provided with the username and the password to log on to the authorized Visa Application link : www.enjazit.com.sa).","After MOFA, candidates undergo Medical process to GAMCA Nepal & its accredited medical centers (Permitted/authorized by GCC Nations as well as Nepal Government). It takes about 3 working days to get medical reports.","Medical Fit Reports, Original Passports, E-Wakal & other related documents are submitted to Saudi Embassy Consulate Section in Dhaka, Bangladesh for their visa endorsement. In near future Embassy of Saudi Arabia will be residing in Nepal with its full operations. Then after visa applications will be made directly in Consulate Section of Saudi Embassy in Nepal."};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saudi_visa_processing);
        lv=(ListView)findViewById(R.id.listView);
        View header = getLayoutInflater().inflate(R.layout.header,null);
        lv.addHeaderView(header, null, false);
        svp=(TextView)header.findViewById(R.id.svp);
        svp_data=(TextView)header.findViewById(R.id.svp_data);
        adapter=new ArrayAdapter<String>(this,R.layout.list_item,text);
        lv.setAdapter(adapter);


    }
}
