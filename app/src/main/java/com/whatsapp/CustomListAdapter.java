package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CustomListAdapter extends BaseAdapter {

    Context context;
    String[] imageArray;
    String[] titleArray;
    String[] offerArray;
    String[] descArray;

    public CustomListAdapter(Context context, String[] imageArray, String[] titleArray, String[] offerArray, String[] descArray) {
        this.context = context;
        this.imageArray = imageArray;
        this.titleArray = titleArray;
        this.offerArray = offerArray;
        this.descArray = descArray;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.custom_list,null);
        TextView title = view.findViewById(R.id.custom_list_title);
        TextView offer = view.findViewById(R.id.custom_list_offer);
        TextView desc = view.findViewById(R.id.custom_list_description);

        ImageView imageView = view.findViewById(R.id.custom_list_image);

        Glide.with(context).load(imageArray[i]).placeholder(R.mipmap.ic_launcher).into(imageView);

        title.setText(titleArray[i]);
        offer.setText(offerArray[i]);
        desc.setText(descArray[i]);

        return view;
    }
}
