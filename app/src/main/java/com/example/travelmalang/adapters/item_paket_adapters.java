package com.example.travelmalang.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelmalang.R;
import com.example.travelmalang.models.ItemMenuModels;
import com.example.travelmalang.models.ItemPaketModels;

import java.util.List;

public class item_paket_adapters extends RecyclerView.Adapter<item_menu_adapters.MyHolderView> {

    Context context;
    LayoutInflater inflater;
    List<ItemPaketModels> itemPaket;
    View itemPaketView;

    public item_paket_adapters(Context c, List<ItemPaketModels> itemPaket) {
        this.context = c;
        this.itemPaket = itemPaket;
        this.inflater = LayoutInflater.from(this.context);
    }

    @NonNull
    @Override
    public item_menu_adapters.MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemPaketView =inflater.inflate(R.layout.menu_layout,parent,false);
        return new item_menu_adapters.MyHolderView(itemPaketView);
    }

    @Override
    public void onBindViewHolder(@NonNull item_menu_adapters.MyHolderView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyHolderView extends RecyclerView.ViewHolder {
        public TextView nama_paket;
        public TextView deskripsi;
        public ImageView gambar;
        public CardView cvMenu;

        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            nama_paket = itemView.findViewById(R.id.nama_paket);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            gambar = itemView.findViewById(R.id.gambar);
            cvMenu = itemView.findViewById(R.id.cvMenu);
        }
    }
}
