package com.ankithacks.thecaval;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BookingHistory extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_history);

        ArrayList<custom_booking_history> bh =new ArrayList<custom_booking_history>();
        bh.add(new custom_booking_history("15/05/2017",1234,"SCORPIO",500));
        bh.add(new custom_booking_history("15/05/2017",1234,"SCORPIO",500));

       custom_bookhistory_Adapter adapter=new custom_bookhistory_Adapter(this,bh);
        ListView l=(ListView)findViewById(R.id.listView);
        l.setAdapter(adapter);

    }
}
