package com.example.android.tourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.dataType.EventDataType;
import com.example.android.tourguide.dataType.HistoricalDataType;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Event_RecyclerView extends RecyclerView.Adapter<Event_RecyclerView.Event_ViewHolder> {
    Context context;
    List<EventDataType> data_list;

    public Event_RecyclerView(Context context, List<EventDataType> data_list) {
        this.context = context;
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public Event_ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.event_layout, viewGroup, false);
        return new Event_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Event_ViewHolder event_viewHolder, int i) {
        EventDataType data = data_list.get(i);
        event_viewHolder.address.setText(data.getAddress());
        event_viewHolder.date.setText(data.getDate());
        event_viewHolder.imageView.setImageResource(data.getImage());
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    public class Event_ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvdate)
        TextView date;
        @BindView(R.id.tvlocation)
        TextView address;
        @BindView(R.id.imageVevent)
        ImageView imageView;

        public Event_ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
