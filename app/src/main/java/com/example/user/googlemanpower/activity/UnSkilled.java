package com.example.user.googlemanpower.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.googlemanpower.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UnSkilled extends Fragment {

    ListView lv;
    View rootView;
    ArrayAdapter<String> adapter;
    String[] hey={"1.Construction-labours /Sweepers","2.Cleaner/ Janitor","3.Watchmen / Guards","4.Agriculture Labors / Farmers","5.Peon / Office Boys"};
    public UnSkilled() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_un_skilled, container, false);
        lv=(ListView)rootView.findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.overseas_rec, hey);
        lv.setAdapter(adapter);
        return rootView;
        // Inflate the layout for this fragment
    }

}
