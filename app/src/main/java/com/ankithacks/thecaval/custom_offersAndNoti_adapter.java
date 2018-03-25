package com.ankithacks.thecaval;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DellSe on 15-05-2017.
 */

public class custom_offersAndNoti_adapter extends RecyclerView
        .Adapter<custom_offersAndNoti_adapter
        .DataObjectHolder> {

    private ArrayList<custom_offersAndNoti> mDataset;

    //private static MyClickListener myClickListener;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView t1;
        TextView t2;

        public DataObjectHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.t1);
            t2 = (TextView) itemView.findViewById(R.id.t2);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
          // myClickListener.onItemClick(getAdapterPosition(), v)

         }
    }

    //public void setOnItemClickListener(MyClickListener myClickListener) {
     //   this.myClickListener = myClickListener;
    //}


    public custom_offersAndNoti_adapter(ArrayList<custom_offersAndNoti> myDataset) {
        mDataset = myDataset;
    }


    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_offersandnoti, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.t1.setText(mDataset.get(position).getT1());
        holder.t2.setText(mDataset.get(position).getT2());

    }
}
