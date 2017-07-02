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
import com.example.user.googlemanpower.activity.AboutUs;
import com.example.user.googlemanpower.activity.Gallery;
import com.example.user.googlemanpower.activity.Message;
import com.example.user.googlemanpower.activity.Services;

/**
 * Created by user on 9/21/2016.
 */
public class ServiceAdapter extends BaseAdapter {
    Context context;
    private static LayoutInflater inflater=null;
    String[] data;

    public ServiceAdapter(Context context,String[]data) {
        this.context = context;
        this.data=data;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public class Holder
    {
        TextView tv;
    }

    @Override
    public View getView( final int position, View view, ViewGroup viewGroup) {

        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.services_list_layout, null);
        holder.tv=(TextView) rowView.findViewById(R.id.text1);
        holder.tv.setText(data[position]);
        return rowView;
    }
}
