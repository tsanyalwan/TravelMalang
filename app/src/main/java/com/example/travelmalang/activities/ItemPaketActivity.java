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
import com.example.travelmalang.fragments.PaketFragment;
import com.example.travelmalang.models.ItemPaketModels;
import com.example.travelmalang.models.LoginModels;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ItemPaketActivity extends AppCompatActivity {
    public TextView txtJudul;
    public TextView txtHarga;
    public TextView txtDesc;
    public ImageView imgPaket;
    public Button btnConf;

    private DatabaseReference database;
    private ProgressDialog loading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_paket);

        database = FirebaseDatabase.getInstance().getReference();

        imgPaket = findViewById(R.id.imgPaket);
        txtJudul = findViewById(R.id.txtJudul);
        txtDesc = findViewById(R.id.txtDesc);
        txtHarga = findViewById(R.id.txtHarga);
        btnConf = findViewById(R.id.btnConf);
        final int a = getIntent().getExtras().getInt("gambar");
        final String b = getIntent().getExtras().getString("judul");
        final String c = getIntent().getExtras().getString("desc");
        final String d = getIntent().getExtras().getString("harga");
        imgPaket.setImageResource(a);
        txtJudul.setText(b);
        txtDesc.setText(c);
        txtHarga.setText(d);
        btnConf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                loading = ProgressDialog.show(ItemPaketActivity.this,
                        null,
                        "please wait..",
                        true,
                        false);

                final ItemPaketModels paket = new ItemPaketModels(b,c,d,a);

                database.child("paket").push().setValue(paket).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        loading.dismiss();
                        txtJudul.setText("");
                        txtDesc.setText("");
                        txtHarga.setText("");
                        Toast.makeText(ItemPaketActivity.this,"Data Berhasil Ditambahkan",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(ItemPaketActivity.this,MainActivity.class);
                        i.putExtra("gambar",a);
                        i.putExtra("paket",b);
                        startActivity(i);
                    }
                });

            }
        });
    }
}
