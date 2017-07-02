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
public class SemiSkilled extends Fragment {
    ListView lv;
    View rootView;
    ArrayAdapter<String> adapter;
    String[]hello={"1.Electrical / Mechanical Helpers","2.Carpenter Helpers","3.Masonary / Conrete Mixer Operators Helpers","4.Pumo Operating Helpers","5.Laundrymen / Washermen","6.Shop Assistants","7.Gardeners","8.Tailors","9.Barbers"};

    public SemiSkilled() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_semi_skilled, container, false);
        lv=(ListView)rootView.findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.overseas_rec, hello);

        lv.setAdapter(adapter);
        return rootView;

    }

}
