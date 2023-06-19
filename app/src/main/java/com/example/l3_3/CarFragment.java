package com.example.l3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class CarFragment extends Fragment {
    ArrayList<String> car = new ArrayList<>();
    RecyclerView recyclerView;
    Button button;
    public void initListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.one_container, new OneFragment()).commit();
            }
        });
    }

    public void initView() {
        recyclerView = requireActivity().findViewById(R.id.rv_car);
        button = requireActivity().findViewById(R.id.btn_to_first);
    }

    public void loadData() {
        car.add("Bmw");
        car.add("Audi");
        car.add("Mazda");
        car.add("Honda");
        car.add("Mercedes");
        car.add("Lada");
        car.add("Vaz");
        car.add("Bugatti");
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CarAdapter adapter = new CarAdapter(car);
        initView();
        loadData();
        initListener();
        recyclerView.setAdapter(adapter);

    }

}