package com.example.travelmalang.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.sax.Element;
import android.view.View;

import com.example.travelmalang.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    private class AboutPage {
        public AboutPage(AboutActivity aboutActivity) {
        }
    }
}
