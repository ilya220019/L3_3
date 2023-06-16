package com.example.l3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public PhoneViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_phone);
    }

    public void bind(String namePhone) {
        textView.setText(namePhone);
    }
}
