package com.example.user.googlemanpower.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.user.googlemanpower.Models.ManpowerItem;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.CustomAdapter;
import com.example.user.googlemanpower.adapter.CustomAdapterOver;

import java.util.ArrayList;
import java.util.List;

public class OverSeasRecruitment extends AppCompatActivity {
    private ArrayList<ManpowerItem> entityArrayList=new java.util.ArrayList<>();
    private RecyclerView mRecyclerView;
    CustomAdapterOver adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruitment_process);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
       String[] content={"Mason (Plaster, Block)","Mason (Tiles)","Rod Binder (Steel Fixer)","Shuttering Carpenter","Plumbing (Pipe Fitting Sanitary Work)","Aluminium Fabrication","Gypsum Ceiling","Labour"};
        adapter=new CustomAdapterOver(entityArrayList,content,getApplicationContext());
        entityArrayList.add(new ManpowerItem("CIVIL/ARCHITECTURE",content,R.drawable.civil));
        String[] content1={"General Electrician (House Wiring)","Electrical Line Maintenance (Industrial) ","AC & Refrigeration","Motor Welding"};
        entityArrayList.add(new ManpowerItem("ELECTRICAL",content1,R.drawable.ele));
        String[]content3={"Automobile (Diesel & Petrol)","Auto Electrician","Machinist (Turner)","Pipe Fabrication","Industrial Pipe Fitting","Steel Fabrication","Scafffolders"};
        entityArrayList.add(new ManpowerItem("MECHANICAL",content3,R.drawable.mec));
        String[]content4={"Residential/Private Security" , "Official/Bank Security" , "Industrial Security"};
        entityArrayList.add(new ManpowerItem("SECURITY",content4,R.drawable.sec));
        String[]content5={"Operators - Dozer, Fork lift, Roller, Payloader, Back Hoe" , "Operators - Crane" , "(Mobile/Crawler/Hydraulic)" , "Driver - (Trailor/Drump Truch/Light vehicles)" , "Tyremen" , "Denters" , "Moulders"};
        entityArrayList.add(new ManpowerItem("HEAVY EQUIPMENTS",content5,R.drawable.heavy));
        String[]content6={"Western, Italian, Chinese food production (cooking and preservation)" ,
                "Food & Beverage Service (waiter, Bartender)" ,
                "Front Office Management (receptionist call operator)" ,
                "Room Boy/Laundry Man/Cleaners"};
        entityArrayList.add(new ManpowerItem("HOTEL & HOSPITALITY",content6,R.drawable.hotel));
        String[]content7={"Office Boy" ,
                "Cleaner (Hospital, School, Mosque, Office etc.)" ,
                "Housekeeper" ,
                "Care Giver"};
        entityArrayList.add(new ManpowerItem("HOUSEKEEPING",content7,R.drawable.house));
        String[]content8={"Farming" ,
                "Livestock" ,
                "Fishery" ,
                "Poultry" ,
                "Bee Keeping" ,
                "Floriculture"};
        entityArrayList.add(new ManpowerItem("AGRICULTURE",content8,R.drawable.ag));
        String[]content9={"Project Manager" ,
                "Public Relation Manager",
                "Chartered Accountants",
                "Accountant/Cashier" ,
                "Secretary/Executives",
                "Clerk/Typist/Receptionist" ,
                "Sales Personnel/Store Keeper" ,
                "Computer Operator"};
        entityArrayList.add(new ManpowerItem("ADMINISTRATION",content9,R.drawable.admin));


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);



    }

}
