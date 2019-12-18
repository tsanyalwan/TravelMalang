package com.example.travelmalang.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelmalang.R;
import com.example.travelmalang.models.ItemMenuModels;
import java.util.List;

public class item_menu_adapters extends RecyclerView.Adapter<item_menu_adapters.MyHolderView> {

    Context context;
    LayoutInflater inflater;
    List<ItemMenuModels> itemMenu;
    View itemMemuView;

    public item_menu_adapters(Context c, List<ItemMenuModels> itemMenu) {
        this.context = c;
        this.itemMenu = itemMenu;
        this.inflater = LayoutInflater.from(this.context);
    }

    @NonNull
    @Override
    public item_menu_adapters.MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemMemuView =inflater.inflate(R.layout.menu_layout,parent,false);
        return new MyHolderView(itemMemuView);
    }

    @Override
    public void onBindViewHolder(@NonNull item_menu_adapters.MyHolderView holder, int position) {
        //ambil satu item hero
        ItemMenuModels menu = itemMenu.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.nama_paket.setText(menu.getNama_paket());
        holder.deskripsi.setText(menu.getDeskripsi());
        holder.gambar.setImageResource(menu.getGambar());

    }

    @Override
    public int getItemCount() {
        return (itemMenu != null) ? itemMenu.size() : 0;
    }

    public class MyHolderView extends RecyclerView.ViewHolder {
        public TextView nama_paket;
        public TextView deskripsi;
        public ImageView gambar;

        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            nama_paket = itemView.findViewById(R.id.nama_paket);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
