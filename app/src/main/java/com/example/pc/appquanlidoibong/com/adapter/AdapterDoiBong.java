package com.example.pc.appquanlidoibong.com.adapter;


import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pc.appquanlidoibong.R;
import com.example.pc.appquanlidoibong.com.models.DoiBong;

import java.util.List;

public class AdapterDoiBong extends ArrayAdapter<DoiBong> {

    Activity context;
    int resource;
    List<DoiBong> objects;
    public AdapterDoiBong(@NonNull Activity context, @LayoutRes int resource, @NonNull List<DoiBong> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        TextView txtDiem = row.findViewById(R.id.txtDiem);
        TextView txtName = row.findViewById(R.id.txtName);
        TextView txtCoach = row.findViewById(R.id.txtCoach);
        TextView txtLevel = row.findViewById(R.id.txtLevel);

        ImageView imgHinh = row.findViewById(R.id.imgHinh);

        final DoiBong doiBong = this.objects.get(position);
        txtName.setText(doiBong.getName());
        txtCoach.setText(doiBong.getCoach());
        txtLevel.setText(doiBong.getLevel());
        txtDiem.setText(doiBong.getDiem()+"");
        imgHinh.setImageResource(doiBong.getImage());
        return row;
    }
}

