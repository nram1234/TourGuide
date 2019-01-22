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
import com.example.android.tourguide.dataType.HistoricalDataType;
import com.example.android.tourguide.dataType.RestaurantDataType;
import com.example.android.tourguide.interfaces.ItemClickListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Restaurant_RecyclerView extends RecyclerView.Adapter<Restaurant_RecyclerView.Restaurant_ViewHolder> {
    ItemClickListener clickListener;
    Context context;
    List<RestaurantDataType> data_list;

    public Restaurant_RecyclerView(Context context, List<RestaurantDataType> folderData) {
        this.context = context;
        this.data_list = folderData;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    @NonNull
    @Override
    public Restaurant_ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.restaurant_layout, viewGroup, false);
        return new Restaurant_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Restaurant_ViewHolder restaurant_viewHolder, int i) {
        RestaurantDataType data = data_list.get(i);
        restaurant_viewHolder.name.setText(data.name);
        restaurant_viewHolder.imageView.setImageResource(data.imag);
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    public class Restaurant_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.restaurant_name)
        TextView name;
        @BindView(R.id.restaurant_image)
        ImageView imageView;

        public Restaurant_ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onClick(view, getAdapterPosition());
        }
    }
}
