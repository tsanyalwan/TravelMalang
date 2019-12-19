package com.example.travelmalang.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Toast;

import com.example.travelmalang.R;
import com.example.travelmalang.adapters.paket_adapters;
import com.example.travelmalang.models.ItemMenuModels;
import com.example.travelmalang.models.ItemPaketModels;
import com.example.travelmalang.models.PaketModels;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaketFragment extends Fragment {
    private List<ItemPaketModels> itemPaket;
    private DatabaseReference database;
    private RecyclerView recyclerView;
    private paket_adapters paket_adapter;

    public PaketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_paket, container, false);
        Intent i = getActivity().getIntent();
        int gambar = i.getIntExtra("gambar",0);
        String paket = i.getStringExtra("paket");
        Toast.makeText(getActivity(),paket,Toast.LENGTH_SHORT).show();


        database = FirebaseDatabase.getInstance().getReference();

        recyclerView = view.findViewById(R.id.RVPaket);

        database.child("paket").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                itemPaket = new ArrayList<>();
                if(dataSnapshot.exists()){
                    for(DataSnapshot ds : dataSnapshot.getChildren()){
                        ItemPaketModels pm = ds.getValue(ItemPaketModels.class);
                        pm.setKey(ds.getKey());
                        itemPaket.add(pm);
                    }
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                paket_adapter = new paket_adapters(getActivity(),itemPaket);
                recyclerView.setAdapter(paket_adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return view;
    }

}
