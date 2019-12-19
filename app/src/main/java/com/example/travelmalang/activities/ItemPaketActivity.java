package com.example.travelmalang.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.travelmalang.R;
import com.example.travelmalang.fragments.HomeFragment;
import com.example.travelmalang.models.LoginModels;
import com.google.android.gms.tasks.OnSuccessListener;

public class ItemPaketActivity extends AppCompatActivity {
    public TextView txtJudul;
    public TextView txtHarga;
    public TextView txtDesc;
    public ImageView imgPaket;
    public Button btnConf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_paket);
        imgPaket = findViewById(R.id.imgPaket);
        txtJudul = findViewById(R.id.txtJudul);
        txtDesc = findViewById(R.id.txtDesc);
        txtHarga = findViewById(R.id.txtHarga);
        btnConf = findViewById(R.id.btnConf);
        imgPaket.setImageResource(getIntent().getExtras().getInt("gambar"));
        txtJudul.setText(getIntent().getExtras().getString("judul"));
        txtDesc.setText(getIntent().getExtras().getString("desc"));
        txtHarga.setText(getIntent().getExtras().getString("harga"));
        btnConf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ItemPaketActivity.this,"Data Berhasil Ditambahkan",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ItemPaketActivity.this,HomeFragment.class));
//                finish();
//                Intent intent = new Intent(view.getContext(), HomeFragment.class);
//                view.getContext().startActivity(intent);
            }
        });
    }
}
