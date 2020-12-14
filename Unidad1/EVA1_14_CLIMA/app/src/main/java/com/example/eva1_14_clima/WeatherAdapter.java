package com.example.eva1_14_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    private Context context;
    private int resource;
    private Weather[] objects;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = ((Activity)context).getLayoutInflater().inflate(resource,parent,false);


        }
        TextView txtViewCity, txtViewTemp, txtViewDesc;
        ImageView imgView;
        txtViewCity = convertView.findViewById(R.id.txtViewCity);
        txtViewTemp = convertView.findViewById(R.id.txtViewTemp);
        txtViewDesc = convertView.findViewById(R.id.txtViewDesc);
        imgView = convertView.findViewById(R.id.imgView);

        txtViewCity.setText(objects[position].getCity());
        txtViewTemp.setText(objects[position].getTemp()+" °C");
        txtViewDesc.setText(objects[position].getDesc());

        imgView.setImageResource(objects[position].getImageWeather());
        return convertView;
    }
}
