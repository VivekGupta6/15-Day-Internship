package com.example.gym_splits;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter1 extends ArrayAdapter {

    private final Activity context;
    private final String[] name;
    private final Integer[] icons;

    public MyAdapter1(Activity context, String[] name, Integer[] icons) {
        super(context,R.layout.pusha_list,name);
        this.context = context;
        this.name = name;
        this.icons = icons;
    }

    @Override
    @NonNull
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater=context.getLayoutInflater();
        View row=inflater.inflate(R.layout.pusha_list,null,true);

        TextView name=row.findViewById(R.id.name);
        name.setText(this.name[position]);

        ImageView icons=row.findViewById(R.id.icons);
        icons.setImageResource(this.icons[position]);

        return row;

    }
}
