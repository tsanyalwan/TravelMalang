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
        imgPaket.setImageResource(getIntent().getExtras().getInt("gambar"));
        txtJudul.setText(getIntent().getExtras().getString("judul"));
        txtDesc.setText(getIntent().getExtras().getString("desc"));
        txtHarga.setText(getIntent().getExtras().getString("harga"));
        btnConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Berhasil Konfirmasi Paket",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), HomeFragment.class);
                intent.putExtra("gambar",R.drawable.bromo);
                intent.putExtra("judul","PAKET 1");
                intent.putExtra("desc","Destinasi :\n"+
                        "1. Jatim Park 1\n"+
                        "2. Jatim Park 2\n"+
                        "3. Batu Night Spectacular\n"+
                        "4. Museum Ankgut\n");
                intent.putExtra("harga","Total : Rp.900.000");
                view.getContext().startActivity(intent);
            }
        });
    }
}
