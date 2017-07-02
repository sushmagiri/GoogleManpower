package com.example.user.googlemanpower.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.user.googlemanpower.Models.RecruitItem;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.CustomAdapter;

import java.util.ArrayList;

public class RecruitmentProcess extends AppCompatActivity {
    private ArrayList<RecruitItem> entityArrayList=new ArrayList<>();
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recruitment_process2);
        RecyclerView rv = (RecyclerView) findViewById(R.id.my_recycler_view);
        rv.setHasFixedSize(true);
        prepareNewsData();
        adapter=new CustomAdapter(entityArrayList);
        LinearLayoutManager verticalLayoutmanager
                = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(verticalLayoutmanager);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);
    }
    private void prepareNewsData() {
        entityArrayList.add(new RecruitItem("Sourcing Method","Owing to our extensive client list and the nature and scale of projects we have been and are associated with, we have several candidates registering themselves with us everyday, via our online career portal, fax, e-mail or by walk-in. This information is collated, sorted and saved in a professionally managed and updated databank that provides a vast source of resources that can be easily accessed.",R.drawable.rec,"Owing to our extensive client list and the nature and scale of projects we have been and are associated with, we have several candidates registering themselves with us everyday, via our online career portal, fax, e-mail or by walk-in. This information is collated, sorted and saved in a professionally managed and updated databank that provides a vast source of resources that can be easily accessed."));
entityArrayList.add(new RecruitItem("Authenticating applicant qualifications","",R.drawable.rec,"We are well networked with all the top educational institutions within the regions we source personnel form, enabling us to verify applicant qualifications. This ensures that the candidates selected based on their qualification and experience can cope with the job requirement, if not exceed expectations."));
        entityArrayList.add(new RecruitItem("Testing","",R.drawable.rec,"For the above categories, we have implemented a stringent aptitude and attitude test that includes a technical questionnaire. Candidates are required to score a minimum of 75% on this test to qualify for the next round of assessment. This ensures that the candidates we select have a high level of proficiency in their respective fields, assuring clients of the quality standards we conform to."));
        entityArrayList.add(new RecruitItem("Screening & Short-listing by Technical Consultants","",R.drawable.rec,"Owing to our extensive client list and the nature and scale of projects we have been and are associated with, we have several candidates registering themselves with us everyday, via our online career portal, fax, e-mail or by walk-in. This information is collated, sorted and saved in a professionally managed and updated databank that provides a vast source of resources that can be easily accessed."));
        entityArrayList.add(new RecruitItem("Medical Examination Facilities","",R.drawable.rec,"For the above categories, we have implemented a stringent aptitude and attitude test that includes a technical questionnaire. Candidates are required to score a minimum of 75% on this test to qualify for the next round of assessment. This ensures that the candidates we select have a high level of proficiency in their respective fields, assuring clients of the quality standards we conform to."));
        entityArrayList.add(new RecruitItem("Mobilization Period","",R.drawable.rec,"We are well networked with all the top educational institutions within the regions we source personnel form, enabling us to verify applicant qualifications. This ensures that the candidates selected based on their qualification and experience can cope with the job requirement, if not exceed expectations."));

    }
    }

