package com.example.travelmalang.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.travelmalang.R;
import com.example.travelmalang.fragments.HomeFragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    EditText inputPass;
    EditText inputUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inputUser = findViewById(R.id.inputUser);
        inputPass = findViewById(R.id.inputPass);
    }

    public void BtnLogin(View view) {
        String usernameInput = inputUser.getText().toString();
        String passwordInput = inputPass.getText().toString();
        if (!usernameInput.equals("") && !passwordInput.equals("") && usernameInput.equals(passwordInput)) {
            Bundle bundle = new Bundle();
            bundle.putString("USERNAME_KEY", usernameInput);
            bundle.putString("PASSWORD_KEY", passwordInput);
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (usernameInput != passwordInput) {
            Toast.makeText(this, "Username and Password Invalid", Toast.LENGTH_SHORT).show();
        } else if (usernameInput.equals("") || passwordInput.equals("")) {
            Toast.makeText(this, "Username and Password Can't be Null", Toast.LENGTH_SHORT).show();
        } else {

        }
    }
}
