package com.example.travelmalang.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelmalang.R;
import com.example.travelmalang.models.ItemMenuModels;
import com.example.travelmalang.models.ItemPaketModels;
import com.example.travelmalang.models.PaketModels;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.nio.BufferUnderflowException;
import java.util.List;

public class paket_adapters extends RecyclerView.Adapter<paket_adapters.MyHolderView> {

    Context context;
    LayoutInflater inflater;
    public List<ItemPaketModels> data;
    View itemMemuView;
    DatabaseReference database;

    public paket_adapters(Context c, List<ItemPaketModels> data) {
        this.context = c;
        this.data = data;
        this.inflater = LayoutInflater.from(this.context);
    }


    @NonNull
    @Override
    public MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemMemuView =inflater.inflate(R.layout.paket_layout,parent,false);
        return new MyHolderView(itemMemuView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolderView holder, int position) {
        final ItemPaketModels paketModels = data.get(position);

        holder.gbr_paket.setImageResource(paketModels.getImgPaket());
        holder.txt_paket.setText(paketModels.getTxtJudul());

        final String id = paketModels.getKey();
        database = FirebaseDatabase.getInstance().getReference();

        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database.child("paket").child(id).removeValue().addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                });
            }
        });

    }

    @Override
    public int getItemCount() {
        return (data != null) ? data.size() : 0;
    }

    public class MyHolderView extends RecyclerView.ViewHolder {
        public TextView txt_paket;
        public ImageView gbr_paket;
        public CardView CardViewPaket;
        public Button btnDelete;

        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            txt_paket = itemView.findViewById(R.id.txt_paket);
            gbr_paket = itemView.findViewById(R.id.gbr_Paket);
            btnDelete = itemView.findViewById(R.id.btnDelete);
            CardViewPaket = itemView.findViewById(R.id.CardViewPaket);
        }
    }
}
