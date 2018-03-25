package com.ankithacks.thecaval;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class regVehicles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_vehicles);

        ArrayList<custom_regVehicles>vehicles=new ArrayList<>();
        vehicles.add(new custom_regVehicles("HR 36 ADFG","Hayabusa","15/05/2017",R.drawable.haya));
        vehicles.add(new custom_regVehicles("HR 36 ADFG","Hayabusa","15/05/2017",R.drawable.haya));

        custom_regVehicles_Adapter adapter2=new custom_regVehicles_Adapter(this,vehicles);
        ListView listView2=(ListView)findViewById(R.id.listView2);
        listView2.setAdapter(adapter2);

    }
}
