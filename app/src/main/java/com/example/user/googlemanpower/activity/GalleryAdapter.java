package com.example.user.googlemanpower.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.googlemanpower.R;


/**
 * Created by Otimus on 9/19/2016.
 */
public class GalleryAdapter extends BaseAdapter{

    //gallery adapter is for the images in the gallery

    Context context;
    private static LayoutInflater inflater=null;
    public Integer[] imgIds ={
            R.drawable.gal1,
            R.drawable.galb,
            R.drawable.galc,
            R.drawable.gald,
            R.drawable.gale,
            R.drawable.galf,
            R.drawable.galb,
    };
    public String[] gridText={"image1","image2","image3","image4","image4","image5","image6","image7" };



    public GalleryAdapter(Context context) {
        this.context = context;

        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imgIds.length;
    }

    @Override
    public Object getItem(int i) {
        return imgIds[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        Holder holder= new Holder();
        View rootView;

        rootView=inflater.inflate(R.layout.gallery_thumbnail,null);
      //  holder.gridText=(TextView) rootView.findViewById(R.id.g_text);
        holder.gridImage=(ImageView) rootView.findViewById(R.id.im);

//        holder.gridText.setText(gridText[i]);
        holder.gridImage.setImageResource(imgIds[i]);
//
//        rootView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                Toast.makeText(context, "You Clicked "+gridText[i], Toast.LENGTH_LONG).show();
//            }
//        });

        return rootView;





    }

    private class Holder{
        TextView gridText;
        ImageView gridImage;
    }



}

