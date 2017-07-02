package com.example.user.googlemanpower.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.googlemanpower.R;

import java.security.PublicKey;

/**
 * Created by user on 9/19/2016.
 */
public class ImageAdapterAboutUs extends BaseAdapter {
    Context mContext;
    private static LayoutInflater inflater=null;

    // Keep all Images in array
    public Integer[] mThumbIds ={
            R.drawable.vision,
            R.drawable.mission,
            R.drawable.services,


    };
    public String[] gridText={"Company's Vision","Company's Mission","Why Google Overseas" };
    public  String[] info={"There are innumarebal agencies in Nepal but very few agencies are strongly leading the reliable manpower selection and staffing, upholding moral","To be recognized as a quality driven agency committed to the provision of professional and quality recruitment solutions in all spheres of","Since the founding of the company, our essential ingredients and philosophy has been to strive for excellence and become"};

    public ImageAdapterAboutUs(Context mContext) {
        this.mContext = mContext;
        inflater = ( LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position] ;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        final Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.item_aboutus, null);
        holder.tv=(TextView) rowView.findViewById(R.id.titleofabout);
        holder.img=(ImageView) rowView.findViewById(R.id.image);
        holder.tv.setText(gridText[position]);
        holder.tv1=(TextView)rowView.findViewById(R.id.about);
        holder.tv1.setText(info[position]);
        holder.img.setImageResource(mThumbIds[position]);

       return rowView;

    }
    public class Holder
    {
        TextView tv,tv1;
        ImageView img;
    }


}

