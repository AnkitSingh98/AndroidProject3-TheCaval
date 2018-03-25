package com.ankithacks.thecaval;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DellSe on 15-05-2017.
 */

public class custom_regVehicles_Adapter extends ArrayAdapter<custom_regVehicles> {


    public custom_regVehicles_Adapter(Context context, ArrayList<custom_regVehicles> regVehicles) {
        super(context, 0, regVehicles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView=convertView;

        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_reg_vehicles, parent, false);
        }
        custom_regVehicles rv=getItem(position);

        TextView text1=(TextView)listView.findViewById(R.id.text1);
        text1.setText(rv.getText1());

        TextView text2=(TextView)listView.findViewById(R.id.text2);
        text2.setText(rv.getText2());

        TextView text4=(TextView)listView.findViewById(R.id.text4);
        text4.setText(rv.getText4());

       ImageView image=(ImageView)listView.findViewById(R.id.image1);
        image.setImageResource(rv.getImage());

        return listView;
    }
    }




