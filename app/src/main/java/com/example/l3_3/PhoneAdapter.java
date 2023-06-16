package com.example.l3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneViewHolder> {
    ArrayList<String> phone;

    public PhoneAdapter(ArrayList<String> phone) {
        this.phone = phone;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhoneViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.phone_item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        holder.bind(phone.get(position));
    }

    @Override
    public int getItemCount() {
        return phone.size();
    }
}
