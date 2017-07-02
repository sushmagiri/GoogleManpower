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
public class TabFragment2 extends Fragment {
    WebView webView;
    ImageView imageView;
    View rootView;

    public TabFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.tab_item_message, container, false);
        imageView=(ImageView)rootView.findViewById(R.id.imageView1);
        webView=(WebView)rootView.findViewById(R.id.webView);
        String text = "<html><body>"
                + "<p style=\"font-size:18px\" align=\"justify\">"
                + "\"Quality never says sorry.\" As Google Overseas believes on quality,transparency and fact ideology to establish successful and trustworthy business in the world among the Agencies in Nepal.\n" +
                "\n" +
                "Apart from Google Group, I am associated with many other companies in various capacities. However, I feel proud to take the name of Google Overseas Pvt.Ltd. as it has given comparatively higher degree of satisfaction to me in the field of Human Resources and other profound facilities. Since the inception of the company, it has been catering its valued clients with the range of innovative products and services in the field of Human Resources. We understand the needs of our clients and exert every effort to fulfill it. We are trying to be available and accessible from Nepal to all over the world to provide our quality Manpower services.\n" +
                "\n" +
                "Google operates in Quality oriented culture with set of values and beliefs. We believe client's satisfaction is a key to our success. We have a dedicated team of professionals, with an attitude to serve the clients. It is their relentless effort and enthusiasm, which have been enabling Google to grow at faster pace. We Believe in quality service and our motto is \" A Complete Quality Recruitment Solution \".\n" +
                "\n" +
                "We intend to be the best at what we do, and we are committed to serve and become the best agency among the agencies in Nepal, based on operational excellence and superior Quality performance thereby enhancing the candidate's economical and social status by providing an opportunities who choose us as a golden gateway to sketch virtual dream indeed comes true.\n" +
                "We are committed to fully adhere to Regulate clients and candidate's needs, and leading Google to new heights of success. As a Managing Director of Google Overseas Pvt.Ltd, I personally invite you to become a partner with us and allow us to assist you with your needs through the delivery of quality Human resource and services, wherever you are in the world. Looking forward to serving you."
                + "</p> "

                + "</body></html>";
        webView.loadData(text, "text/html", null);
        imageView.setImageResource(R.drawable.od);
        return rootView;
    }

}
