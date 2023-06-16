package com.example.l3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;


public class PhoneFragment extends Fragment {
    ArrayList<String> phone = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        PhoneAdapter adapter = new PhoneAdapter(phone);
        recyclerView = requireActivity().findViewById(R.id.rv_phone);
        recyclerView.setAdapter(adapter);
        Button button = requireActivity().findViewById(R.id.btn_next_phone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.one_container, new CarFragment()).commit();

            }
        });

    }


    private void loadData() {
        phone.add("Redmi");
        phone.add("Apple");
        phone.add("Samsung");
        phone.add("Oppo");
        phone.add("Realme");
        phone.add("Vivo");
        phone.add("Poco");
        phone.add("OnePlus");
        phone.add("Google");
        phone.add("Huawei");
        phone.add("Honor");
        phone.add("Xiaomi");
    }
}