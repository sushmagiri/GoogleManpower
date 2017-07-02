package com.example.user.googlemanpower.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.googlemanpower.activity.GalleryDetails;
import com.example.user.googlemanpower.Models.ImageItem;
import com.example.user.googlemanpower.R;

import java.util.ArrayList;

/**
 * Created by user on 9/21/2016.
 */
public class GridAdapter extends ArrayAdapter{
    private Context context;
    private int layoutResourceId;
    private ArrayList<ImageItem>data;
    public String[] gridText={"OD","Sammar Khadka - MD","FD","Chairman" };


    public GridAdapter(Context context, int layoutResourceId,ArrayList data) {
        super(context, layoutResourceId,data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public int getPosition(Object item) {
        return super.getPosition(item);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageItem item;
        View row = convertView;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new ViewHolder();
            holder.imageTitle = (TextView) row.findViewById(R.id.text);
            holder.image = (ImageView) row.findViewById(R.id.image);
            row.setTag(holder);
        } else {
            holder =(ViewHolder) row.getTag();
        }

        item = data.get(position);
        holder.imageTitle.setText(gridText[position]);
        holder.image.setImageBitmap(item.getImage());


//        row.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(context,GalleryDetails.class);
//                intent.putExtra("title",data);
//                intent.putExtra("image", data);
//
//                //Start details activity
//               context.startActivity(intent);
//            }
//        });
        return row;
    }
    static class ViewHolder {
        TextView imageTitle;
        ImageView image;
    }
}

