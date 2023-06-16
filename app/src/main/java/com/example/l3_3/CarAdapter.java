package com.example.l3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {
    public CarAdapter(ArrayList<String> car) {
        this.car = car;
    }

    ArrayList<String> car;



    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bind(car.get(position));
    }

    @Override
    public int getItemCount() {
        return car.size();
    }
}
