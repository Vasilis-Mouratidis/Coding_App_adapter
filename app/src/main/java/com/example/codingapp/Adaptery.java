package com.example.codingapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Adaptery extends BaseAdapter {

    private Context mContext;


    public Adaptery(Context c){

        mContext = c;

    }

    public int getCount(){
        return mThumbsIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if(convertView == null){

            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250,250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }else{

            imageView = (ImageView) convertView;

        }

        imageView.setImageResource(mThumbsIds[position]);



        return imageView;
    }

    public Integer[] mThumbsIds= {
        R.drawable.car,
        R.drawable.money,
        R.drawable.tinder,
        R.drawable.profile
    };


}
