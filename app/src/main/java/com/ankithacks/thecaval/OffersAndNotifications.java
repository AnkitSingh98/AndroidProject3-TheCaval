package com.ankithacks.thecaval;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class OffersAndNotifications extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers_and_notifications);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new custom_offersAndNoti_adapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);

    }


    private ArrayList<custom_offersAndNoti> getDataSet() {
        ArrayList results = new ArrayList<custom_offersAndNoti>();

       custom_offersAndNoti on=new custom_offersAndNoti("LORIUM IPSUM","A 30% discount offer is availaible on it if you satisfy certain terms and conditions.Offer valid for limited time");
        results.add(on);

        return results;

    }

    }
