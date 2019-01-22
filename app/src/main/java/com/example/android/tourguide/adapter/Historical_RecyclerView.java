package com.example.android.tourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.interfaces.ItemClickListener;
import com.example.android.tourguide.R;
import com.example.android.tourguide.dataType.HistoricalDataType;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Historical_RecyclerView extends RecyclerView.Adapter<Historical_RecyclerView.Historical_ViewHolder> {
    ItemClickListener clickListener;
    Context context;
    List<HistoricalDataType> data_list;

    public Historical_RecyclerView(Context context, List<HistoricalDataType> data_list) {
        this.context = context;
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public Historical_ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.historical_layout, viewGroup, false);
        return new Historical_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Historical_ViewHolder historical_viewHolder, int i) {
        HistoricalDataType data = data_list.get(i);
        historical_viewHolder.name.setText(data.title);
        historical_viewHolder.imageView.setImageResource(data.imag);
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    public class Historical_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.textView_recycler_item)
        TextView name;
        @BindView(R.id.img_recycler_item)
        ImageView imageView;

        public Historical_ViewHolder(@NonNull View itemView) {
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
