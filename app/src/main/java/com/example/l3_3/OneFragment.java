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

public class OneFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<String> oneList = new ArrayList<>();
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initListener();
        OneAdapter oneAdapter = new OneAdapter(oneList);
        recyclerView.setAdapter(oneAdapter);

    }

    public void initListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.one_container, new PhoneFragment()).commit();
            }
        });
    }

    public void initView() {
        recyclerView = requireActivity().findViewById(R.id.rv_one);
        button = requireActivity().findViewById(R.id.btn_next1);
    }

    public void loadData() {
        oneList.add("Антон");
        oneList.add("Владимир");
        oneList.add("Николай");
        oneList.add("Кирилл");
        oneList.add("Илья");
        oneList.add("Константин");
        oneList.add("Алексей");
        oneList.add("Борис");
        oneList.add("Сергей");
        oneList.add("Петр");
    }
}