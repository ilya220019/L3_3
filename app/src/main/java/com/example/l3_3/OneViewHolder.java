package com.example.l3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OneViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public OneViewHolder(@NonNull View itemView) {
        super(itemView);
        initView();


    }

    private void initView() {textView = itemView.findViewById(R.id.tv_all);
    }

    public void bind(String name){
        textView.setText(name);

    }
}
