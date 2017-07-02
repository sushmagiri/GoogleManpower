package com.example.user.googlemanpower.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import com.example.user.googlemanpower.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {
    WebView webView;
    ImageView imageView;
    View rootView;
    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.tab_item_message, container, false);
        imageView=(ImageView)rootView.findViewById(R.id.imageView1);
        webView=(WebView)rootView.findViewById(R.id.webView);
        String text = "<html><body>"
                + "<p style=\"font-size:18px\" align=\"justify\">"
                + "\"Google Overseas Pvt. Ltd. would like to extend it's warm welcome to all of the clients,bussiness parties as well as each and every individuals who choose us for their perfcet and successful future destination.\""
                + "</p> "

                + "</body></html>";
        webView.loadData(text, "text/html", null);
        imageView.setImageResource(R.drawable.chairman);
       return rootView;
    }

}
