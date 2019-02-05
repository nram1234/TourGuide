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
import com.example.android.tourguide.adapter.Historical_RecyclerView;
import com.example.android.tourguide.dataType.HistoricalDataType;
import com.example.android.tourguide.interfaces.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Tap_Hotels extends Fragment implements ItemClickListener {
    @BindView(R.id.historical_layout)
    RecyclerView recyclerView;
    @BindView(R.id.historical_image)
    ImageView historicalImage;
    @BindView(R.id.historical_detail)
    TextView historicalDetail;
    List<HistoricalDataType> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        data = new ArrayList<>();
        data.add(new HistoricalDataType(R.drawable.pyramids, getResources().getString(R.string.AQUADIVERS), getResources().getString(R.string.pyramidsdetail)));
        data.add(new HistoricalDataType(R.drawable.luxor,  getResources().getString(R.string.luxortitle), getResources().getString(R.string.luxordetail)));
        data.add(new HistoricalDataType(R.drawable.islamic,  getResources().getString(R.string.AQUADIVERS), getResources().getString(R.string.pyramidsdetail)));
        data.add(new HistoricalDataType(R.drawable.aswan,  getResources().getString(R.string.luxortitle), getResources().getString(R.string.luxordetail)));
        data.add(new HistoricalDataType(R.drawable.abusimbel, getResources().getString(R.string.AQUADIVERS), getResources().getString(R.string.pyramidsdetail)));
        Historical_RecyclerView adapter;
        adapter = new Historical_RecyclerView(getContext(), data);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        ((LinearLayoutManager) mLayoutManager).setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);
        historicalDetail.setText(data.get(0).detail);
        historicalImage.setImageResource(data.get(0).imag);
        return view;
    }

    @Override
    public void onClick(View view, int position) {
        historicalDetail.setText(data.get(position).detail);
        historicalImage.setImageResource(data.get(position).imag);
    }
}
