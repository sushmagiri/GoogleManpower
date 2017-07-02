package com.example.user.googlemanpower.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.Models.RecruitItem;


import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    ArrayList<RecruitItem> entityArrayList;


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_recruitment, parent, false);
        CustomViewHolder vh = new CustomViewHolder(v);
        return vh;

    }
    public CustomAdapter(ArrayList<RecruitItem> entityArrayList) {
        this.entityArrayList = entityArrayList;

    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        RecruitItem  recruitItem=entityArrayList.get(position);

       holder.tv_newstitle.setText(recruitItem.getNews_title());
        holder.tv_date.setText(recruitItem.getDate());
       holder.img.setImageResource((recruitItem.getImage()));
    }

    @Override
    public int getItemCount() {
        return entityArrayList.size();

    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder{
        public CardView cardView;
        public TextView tv_newstitle,tv_date;
        public ImageView img;
        public CustomViewHolder(final View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.card);
            tv_newstitle=(TextView)itemView.findViewById(R.id.title);
            tv_date=(TextView)itemView.findViewById(R.id.rec_content);
            img=(ImageView)itemView.findViewById(R.id.image);

        }


    }


}
