package com.example.travelmalang.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travelmalang.R;

public class ItemPaketActivity extends AppCompatActivity {
    public TextView txtJudul;
    public TextView txtHarga;
    public ImageView imgPaket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_paket);
        imgPaket = findViewById(R.id.imgPaket);
        txtJudul = findViewById(R.id.txtJudul);
        txtHarga = findViewById(R.id.txtHarga);
    }
}
