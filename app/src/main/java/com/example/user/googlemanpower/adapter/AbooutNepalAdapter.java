package com.example.user.googlemanpower.adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.googlemanpower.R;


public class AbooutNepalAdapter extends BaseAdapter {
    Context context;
    private static LayoutInflater inflater;
   String[] Title;
    Integer[] mThumbIds;
    String[] Content;
    Button btn_readmore;

    public AbooutNepalAdapter(Context context, String[] title, Integer[] mThumbIds, String[] content) {
        this.context = context;
        Title = title;
        this.mThumbIds = mThumbIds;
        Content = content;
        inflater = ( LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }
    public class Holder
    {
        TextView tv, tv1;
        ImageView img;
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
       final Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_layout_about_nepal, null);
        holder.tv=(TextView) rowView.findViewById(R.id.txt_title);
        holder.img=(ImageView) rowView.findViewById(R.id.img_nepal);
        holder.tv1=(TextView) rowView.findViewById(R.id.txt_content);
        holder.img.setImageResource(mThumbIds[position]);
        holder.tv1.setText(Content[position]);
        holder.tv.setText(Title[position]);
        btn_readmore=(Button)rowView.findViewById(R.id.btn_readmore);
//        btn_readmore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openDialog();
//            }
//
//        });
        return rowView;
    }
//    public void openDialog() {
//        final Dialog dialog = new Dialog(context); // Context, this, etc.
//        dialog.setContentView(R.layout.dialog_demo);
//        Button btn=(Button)dialog.findViewById(R.id.dialog_ok);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dialog.dismiss();
//            }
//        });
//      dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
//        dialog.show();
//    }


}
