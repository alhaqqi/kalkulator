package com.example.kalkulatoral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button btTambah, btKurang, btKali, btBagi, btClear;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.editTextNumber);
        et2=(EditText) findViewById(R.id.editTextNumber2);
        tvHasil=(TextView) findViewById(R.id.textViewHasil);
        btTambah=(Button) findViewById(R.id.buttontambah);
        btKurang=(Button) findViewById(R.id.buttonkurang);
        btKali=(Button) findViewById(R.id.buttonkali);
        btBagi=(Button) findViewById(R.id.buttonbagi);
        btClear=(Button) findViewById(R.id.buttonclear);

        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2 , hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1+bil2;
                String hasil1=String.valueOf(hasil);
                tvHasil.setText(hasil1);

            }
        });

        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2 , hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1-bil2;
                String hasil1=String.valueOf(hasil);
                tvHasil.setText(hasil1);

            }
        });

        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2 , hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1*bil2;
                String hasil1=String.valueOf(hasil);
                tvHasil.setText(hasil1);

            }
        });

        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2 , hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1/bil2;
                String hasil1=String.valueOf(hasil);
                tvHasil.setText(hasil1);

            }
        });


    }
}