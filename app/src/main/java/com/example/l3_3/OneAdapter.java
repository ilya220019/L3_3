package com.example.l3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kotlin.jvm.internal.Lambda;

public class OneAdapter extends RecyclerView.Adapter <OneViewHolder> {


    ArrayList<String> oneList;
    @NonNull
    @Override
    public OneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OneViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull OneViewHolder holder, int position) {
        holder.bind(oneList.get(position));
    }
    public OneAdapter(ArrayList<String> oneList) {
        this.oneList = oneList;
    }
    @Override
    public int getItemCount() {
        return oneList.size();
    }
}
