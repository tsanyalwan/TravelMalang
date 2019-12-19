package com.example.travelmalang.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.travelmalang.R;
import com.example.travelmalang.fragments.HomeFragment;
import com.example.travelmalang.models.LoginModels;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.travelmalang.R.id.btnLogin;
import static com.example.travelmalang.R.id.submit_area;

public class LoginActivity extends AppCompatActivity {
    private EditText inputPass;
    private EditText inputUser;
    private Button btnLogin;
    private static final String TAG = "alwan";
    private DatabaseReference database;
    private ProgressDialog loading;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        database = FirebaseDatabase.getInstance().getReference();

        inputUser = findViewById(R.id.inputUser);
        inputPass = findViewById(R.id.inputPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputUser.equals("")) {
                    inputUser.setError("Silahkan Masukkan Nama");
                    inputUser.requestFocus();
                }else if (inputPass.equals("")){
                    inputUser.setError("Silahkan Masukkan Password");
                    inputUser.requestFocus();
                }else if (inputPass.equals("")&&inputUser.equals("")){
                    inputUser.setError("Username dan Password Harus Diisi");
                    inputUser.requestFocus();
                }else{
                    loading = ProgressDialog.show(LoginActivity.this,
                            null,
                            "please wait..",
                            true,
                            false);

                    final LoginModels login = new LoginModels(inputUser.getText().toString(),inputPass.getText().toString());

                    database.child("login").push().setValue(login).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            loading.dismiss();
                            inputUser.setText("");
                            inputPass.setText("");
                            Toast.makeText(LoginActivity.this,"Data Berhasil Ditambahkan",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(LoginActivity.this,MainActivity.class);
                            i.putExtra("name",login.getUsername());
                            startActivity(i);
                        }
                    });
                    }
            }
        });
    }}
