package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtDatos = findViewById(R.id.txtDatos);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        txtDatos.append(bundle.getString("Ciudad"));
        txtDatos.append(bundle.getInt("Posicion")+"");

    }
}