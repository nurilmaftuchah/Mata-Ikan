package com.example.mataikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAngin, btnGelombang, btnHarga, btnCuaca, btnPrediksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHarga=findViewById(R.id.btn_harga);
        btnAngin=findViewById(R.id.btn_angin);
        btnCuaca=findViewById(R.id.btn_cuaca);
        btnGelombang=findViewById(R.id.btn_gelombang);
        btnPrediksi=findViewById(R.id.btn_prediksi);

        btnHarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, HargaActivity.class);
                startActivity(intent);
            }
        });

        btnAngin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(MainActivity.this, AnginActivity.class);
                startActivity(intent2);
            }
        });

        btnGelombang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(MainActivity.this, GelombangActivity.class);
                startActivity(intent3);
            }
        });

        btnPrediksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(MainActivity.this, PrediksiActivity.class);
                startActivity(intent4);
            }
        });

        btnCuaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5= new Intent(MainActivity.this, CuacaActivity.class);
                startActivity(intent5);
            }
        });
    }
}
