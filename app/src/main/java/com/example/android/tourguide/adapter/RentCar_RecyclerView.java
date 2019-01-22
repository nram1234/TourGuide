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
import com.example.android.tourguide.dataType.RentCarDataType;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RentCar_RecyclerView extends RecyclerView.Adapter<RentCar_RecyclerView.RentCar_ViewHolder> {
    Context context;
    List<RentCarDataType> data_list;

    public RentCar_RecyclerView(Context context, List<RentCarDataType> data_list) {
        this.context = context;
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public RentCar_RecyclerView.RentCar_ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rentcar_layout, viewGroup, false);
        return new RentCar_RecyclerView.RentCar_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RentCar_RecyclerView.RentCar_ViewHolder RentCarDataType_viewHolder, int i) {
        RentCarDataType data = data_list.get(i);
        RentCarDataType_viewHolder.rentcarName.setText(data.getName());
        RentCarDataType_viewHolder.rentcarAddress.setText(data.getAddress());
        RentCarDataType_viewHolder.rentcarWorkTime.setText(data.getWorkTime());
        RentCarDataType_viewHolder.rentcarPhone.setText(data.getPhone());
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    public class RentCar_ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.rentcar_name)
        TextView rentcarName;
        @BindView(R.id.rentcar_address)
        TextView rentcarAddress;
        @BindView(R.id.rentcar_workTime)
        TextView rentcarWorkTime;
        @BindView(R.id.rentcar_phone)
        TextView rentcarPhone;

        public RentCar_ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
