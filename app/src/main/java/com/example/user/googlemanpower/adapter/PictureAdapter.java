package com.example.user.googlemanpower.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.googlemanpower.activity.AboutUs;
import com.example.user.googlemanpower.activity.Gallery;
import com.example.user.googlemanpower.activity.Message;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.activity.Procedure;
import com.example.user.googlemanpower.activity.RecentJobs;
import com.example.user.googlemanpower.activity.Services;

/**
 * Created by user on 9/19/2016.
 */
public class PictureAdapter extends BaseAdapter {
    Context mContext;
    private static LayoutInflater inflater=null;

    // Keep all Images in array
    public Integer[] mThumbIds ={
            R.drawable.aboutus,
            R.drawable.message,
            R.drawable.services,
            R.drawable.procedure,
            R.drawable.recent,
            R.drawable.gallery

    };
    public String[] gridText={"About Us","Messages","Services","Procedure","Recent Jobs","Gallery" };

    public PictureAdapter(Context mContext) {
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
        rowView = inflater.inflate(R.layout.item_grid, null);
        holder.tv=(TextView) rowView.findViewById(R.id.title);
        holder.img=(ImageButton) rowView.findViewById(R.id.button_img);
        holder.tv.setText(gridText[position]);
        holder.img.setImageResource(mThumbIds[position]);
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
//
//                 intent=new Intent(mContext,AboutUs.class);
//                mContext.startActivity(intent);
                switch (position) {
                    case 0:

                        intent = new Intent(mContext, AboutUs.class);
                        mContext.startActivity(intent);
                        break;
                    case 1:
                        intent=new Intent(mContext,Message.class);
                        mContext.startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(mContext,Services.class);
                        mContext.startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(mContext,Procedure.class);
                        mContext.startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(mContext,RecentJobs.class);
                        mContext.startActivity(intent);


                        break;
                    case 5:
                        intent=new Intent(mContext,Gallery.class);
                        mContext.startActivity(intent);
                        break;
                }
            }
        });


        return rowView;
    }
    public class Holder
    {
        TextView tv;
        ImageButton img;
    }



}




//        rowView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//   // TODO Auto-generated method stub
////                Toast.makeText(mContext, "You Clicked "+gridText[position], Toast.LENGTH_LONG).show();
//
//                Intent intent;
//                switch (mThumbIds[position]) {
//                    case 0:
//
//                        intent=new Intent(mContext,AboutUs.class);
//                        mContext.startActivity(intent);
//                        break;
//                    case 1:
//                        intent=new Intent(mContext,Message.class);
//                        mContext.startActivity(intent);
//                        break;
//                    case 2:
//                        intent=new Intent(mContext,Services.class);
//                        mContext.startActivity(intent);
//                        break;
//                    case 3:
//                        intent=new Intent(mContext,Procedure.class);
//                        mContext.startActivity(intent);
//                        break;
//                    case 4:
//                        intent=new Intent(mContext,RecentJobs.class);
//                        mContext.startActivity(intent);
//
//
//                        break;
//                    case 5:
//                        intent=new Intent(mContext,Gallery.class);
//                        mContext.startActivity(intent);
//                        break;
//
//                }
//            }
//        });



