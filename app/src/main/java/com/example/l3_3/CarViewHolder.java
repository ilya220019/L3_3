package com.example.l3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_car);
    }
    public void bind(String nameCar){
        textView.setText(nameCar);
    }
}
