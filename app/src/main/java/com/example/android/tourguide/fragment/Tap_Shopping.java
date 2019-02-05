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

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.RentCar_RecyclerView;
import com.example.android.tourguide.dataType.RentCarDataType;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Tap_Shopping extends Fragment {
    @BindView(R.id.rentcar_recyclerView)
    RecyclerView recyclerView;
    List<RentCarDataType> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rentcar, container, false);
        ButterKnife.bind(this, view);
        data = new ArrayList<>();
        data.add(new RentCarDataType( getResources().getString(R.string.rentcarname),getResources().getString(R.string.rentcaraddress),getResources().getString(R.string.rentcaraphone),getResources().getString(R.string.rentcaraworkTime)));
        data.add(new RentCarDataType( getResources().getString(R.string.rentcarname),getResources().getString(R.string.rentcaraddress),getResources().getString(R.string.rentcaraphone),getResources().getString(R.string.rentcaraworkTime)));
        data.add(new RentCarDataType( getResources().getString(R.string.rentcarname),getResources().getString(R.string.rentcaraddress),getResources().getString(R.string.rentcaraphone),getResources().getString(R.string.rentcaraworkTime)));
        data.add(new RentCarDataType( getResources().getString(R.string.rentcarname),getResources().getString(R.string.rentcaraddress),getResources().getString(R.string.rentcaraphone),getResources().getString(R.string.rentcaraworkTime)));
        RentCar_RecyclerView adapter;
        adapter = new RentCar_RecyclerView(getContext(), data);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        ((LinearLayoutManager) mLayoutManager).setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
