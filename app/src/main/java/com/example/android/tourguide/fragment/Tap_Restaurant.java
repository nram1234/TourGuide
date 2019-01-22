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
import com.example.android.tourguide.adapter.Restaurant_RecyclerView;
import com.example.android.tourguide.dataType.RestaurantDataType;
import com.example.android.tourguide.interfaces.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Tap_Restaurant extends Fragment implements ItemClickListener {
    @BindView(R.id.restaurant_recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.restaurant_image)
    ImageView restaurantImage;
    @BindView(R.id.restaurant_name)
    TextView restaurantname;
    @BindView(R.id.restaurant_address)
    TextView restaurantaddress;
    @BindView(R.id.restaurant_workTime)
    TextView restaurantworkTime;
    @BindView(R.id.restaurant_phone)
    TextView restaurantphone;
    @BindView(R.id.restaurant_email)
    TextView restaurantemail;
    @BindView(R.id.restaurant_detail)
    TextView restaurantdetail;
    List<RestaurantDataType> data;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        ButterKnife.bind(this, view);
        data = new ArrayList<>();
        data.add(new RestaurantDataType(R.drawable.dining,  getResources().getString(R.string.restaurantname),getResources().getString(R.string.restaurantdetail),getResources().getString(R.string.restaurantaddress),getResources().getString(R.string.restaurantphone),getResources().getString(R.string.restaurantemail),getResources().getString(R.string.restaurantworkTime)));
        data.add(new RestaurantDataType(R.drawable.largejpg, getResources().getString(R.string.restaurantname),getResources().getString(R.string.restaurantdetail),getResources().getString(R.string.restaurantaddress),getResources().getString(R.string.restaurantphone),getResources().getString(R.string.restaurantemail),getResources().getString(R.string.restaurantworkTime)));
        data.add(new RestaurantDataType(R.drawable.maison,  getResources().getString(R.string.restaurantname),getResources().getString(R.string.restaurantdetail),getResources().getString(R.string.restaurantaddress),getResources().getString(R.string.restaurantphone),getResources().getString(R.string.restaurantemail),getResources().getString(R.string.restaurantworkTime)));
        data.add(new RestaurantDataType(R.drawable.chocolate,  getResources().getString(R.string.restaurantname),getResources().getString(R.string.restaurantdetail),getResources().getString(R.string.restaurantaddress),getResources().getString(R.string.restaurantphone),getResources().getString(R.string.restaurantemail),getResources().getString(R.string.restaurantworkTime)));
        Restaurant_RecyclerView adapter;
        adapter = new Restaurant_RecyclerView(getContext(), data);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        ((LinearLayoutManager) mLayoutManager).setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);
        restaurantname.setText( data.get(0).name);
        restaurantImage.setImageResource(data.get(0).imag);
        restaurantaddress.setText( data.get(0).address);
        restaurantworkTime.setText( data.get(0).workTime);
        restaurantphone.setText( data.get(0).phone);
        restaurantemail.setText( data.get(0).email);
        restaurantdetail.setText(data.get(0).detail);
        return view;
    }

    @Override
    public void onClick(View view, int position) {
        restaurantImage.setImageResource(data.get(position).imag);
        restaurantname.setText( data.get(position).name);
        restaurantaddress.setText( data.get(position).address);
        restaurantworkTime.setText( data.get(position).workTime);
        restaurantphone.setText( data.get(position).phone);
        restaurantemail.setText(data.get(position).email);
        restaurantdetail.setText( data.get(position).detail);
    }
}
