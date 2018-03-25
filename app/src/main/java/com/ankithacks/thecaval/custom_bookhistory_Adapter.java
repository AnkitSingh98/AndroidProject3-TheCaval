package com.ankithacks.thecaval;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DellSe on 15-05-2017.
 */

public class custom_bookhistory_Adapter extends ArrayAdapter<custom_booking_history> {

    public custom_bookhistory_Adapter(Context context, ArrayList<custom_booking_history> bookingHistories)
    {super(context, 0, bookingHistories);}

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View listView=convertView;
        if(listView==null)
        {
   listView= LayoutInflater.from(getContext()).inflate(R.layout.custom_book_history, parent, false);
        }

        custom_booking_history c=getItem(position);

    TextView t1=(TextView)listView.findViewById(R.id.bht2);
        t1.setText(c.getText1());

        TextView t2=(TextView)listView.findViewById(R.id.bht4);
        t2.setText(String.valueOf(c.getText2()));

        TextView t3=(TextView)listView.findViewById(R.id.bht6);
        t3.setText(c.getText3());

        TextView t4=(TextView)listView.findViewById(R.id.bht8);
        t4.setText(String.valueOf(c.getText4()));

         return listView;
    }
}
