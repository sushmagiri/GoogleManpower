package com.example.user.googlemanpower.activity;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.googlemanpower.Models.ImageItem;
import com.example.user.googlemanpower.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SlideshowDialogFragment extends Fragment {

    private ArrayList<ImageItem> images;
    private ViewPager viewPager;
    public SlideshowDialogFragment() {
        // Required empty public constructor
    }
    static SlideshowDialogFragment newInstance() {
        SlideshowDialogFragment f = new SlideshowDialogFragment();
        return f;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slideshow_dialog, container, false);
        viewPager = (ViewPager) v.findViewById(R.id.viewpager);

return v;
    }

}
