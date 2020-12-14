package com.example.eva2_4_extras;

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
        txtDatos.append(intent.getStringExtra("MENSAJE"));
        txtDatos.append(""+ intent.getIntExtra("Entero", 0));
        txtDatos.append(""+intent.getFloatExtra("Precio", 0.0f));

    }
}