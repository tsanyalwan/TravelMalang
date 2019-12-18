package com.example.travelmalang.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelmalang.R;
import com.example.travelmalang.adapters.item_menu_adapters;
import com.example.travelmalang.models.ItemMenuModels;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    View view;
    item_menu_adapters adapters;
    List<ItemMenuModels> ListItemMenu = new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.listMenu);

        ItemMenuModels item = new ItemMenuModels("PAKET 1","adlah", R.drawable.bromo);
        ListItemMenu.add(item);
        ItemMenuModels item2 = new ItemMenuModels("PAKET 2","adlah", R.drawable.jeep);
        ListItemMenu.add(item2);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        item_menu_adapters adapters = new item_menu_adapters(getActivity(), ListItemMenu);
        recyclerView.setAdapter(adapters);
        return view;
    }

}
