package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomSecondAdapter extends BaseAdapter {

    Context context;
    ArrayList<CustomList> arrayList;

    public CustomSecondAdapter(Context context, ArrayList<CustomList> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
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

        Glide.with(context).asGif().load(arrayList.get(i).getImage()).placeholder(R.mipmap.ic_launcher).into(imageView);

        title.setText(arrayList.get(i).getTitle());
        offer.setText(arrayList.get(i).getOffer());
        desc.setText(arrayList.get(i).getDesc());

        return view;
    }
}
