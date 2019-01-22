package com.example.android.tourguide.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.Event_RecyclerView;
import com.example.android.tourguide.adapter.Historical_RecyclerView;
import com.example.android.tourguide.dataType.EventDataType;
import com.example.android.tourguide.dataType.HistoricalDataType;
import com.example.android.tourguide.interfaces.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Tap_Event extends Fragment {
    @BindView(R.id.event)
    RecyclerView recyclerView;
    List<EventDataType> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        ButterKnife.bind(this, view);
        data = new ArrayList<>();
        data.add(new EventDataType(getResources().getString(R.string.event1data), getResources().getString(R.string.event1address), R.drawable.gun));
        data.add(new EventDataType(getResources().getString(R.string.event2data), getResources().getString(R.string.event2address), R.drawable.smoke));
        data.add(new EventDataType(getResources().getString(R.string.event1data), getResources().getString(R.string.event1address), R.drawable.gun));
        data.add(new EventDataType(getResources().getString(R.string.event2data), getResources().getString(R.string.event2address), R.drawable.smoke));
        Event_RecyclerView adapter;
        adapter = new Event_RecyclerView(getContext(), data);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        ((LinearLayoutManager) mLayoutManager).setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
