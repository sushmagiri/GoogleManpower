package com.example.user.googlemanpower.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.googlemanpower.R;

public class Skilled extends Fragment {
    ListView lv;
    View rootView;
    ArrayAdapter<String> adapter;
    String[]text={"1.Plant Operators: Electrical/ Mechanical / Civil","2.Supervisors: Construction and Different Traders","3.Foreman : Electrical |Mechanical / Civil and Different Traders","4.Electrician: L.T/H.T/ Mechanics Turners/ Toolmakers","5.Mechanics : Auto Petrol / Diesel","6.Drivers :Trailer / Heavy / Light","7.Welders : Gas/ Electric","8.Carpenters: furnishing/ shuttering / steel Fixers / Riggers masons/ Tile Fixers/ plasters Plumbers / Pipe Fitters","9.Textile : Jute / Garment / Carpet / Programmers","10.Hotel Personnel: Cook/ Captain /Chefs / Waiters/ bakers","11.Security Personnel : Ex-British Gurkhas/ Ek- Indian Gurkhas / Ex- Nepalese Army / Police","12.Nurse","13.Accountant"};
    public Skilled() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_skilled, container, false);
        lv=(ListView)rootView.findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.overseas_rec, text);
        lv.setAdapter(adapter);
        return rootView;

    }

}
