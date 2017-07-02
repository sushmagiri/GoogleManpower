package com.example.user.googlemanpower.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.Models.ManpowerItem;


import java.util.ArrayList;

/**
 * Created by user on 8/25/2016.
 */
public class CustomAdapterOver extends RecyclerView.Adapter<CustomAdapterOver.CustomViewHolder> {
    ArrayList<ManpowerItem> entityArrayList;
    ArrayAdapter<String> adapter;
    String[]content;
    Context context;

    public CustomAdapterOver(ArrayList<ManpowerItem> entityArrayList, String[] content, Context context) {
        this.entityArrayList = entityArrayList;
        this.content = content;
        this.context = context;

    }



    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        CustomViewHolder vh = new CustomViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        ManpowerItem manpowerItem=entityArrayList.get(position);

        holder.tv_newstitle.setText(manpowerItem.getTitle());
        holder.img.setImageResource(manpowerItem.getImage());
        adapter=new ArrayAdapter<String>(context,R.layout.overseas_rec,manpowerItem.getContent());
        holder.lv.setAdapter(adapter);

    }

    @Override
    public int getItemCount() {
        return entityArrayList.size();

    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder{
        public CardView cardView;
        public TextView tv_newstitle;
        public ListView lv;
        public ImageView img;
        public CustomViewHolder(final View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.card_view);
            tv_newstitle=(TextView)itemView.findViewById(R.id.tv_newstitle);
         lv=(ListView)itemView.findViewById(R.id.list);
            img=(ImageView)itemView.findViewById(R.id.iv_image);

        }


    }


}
