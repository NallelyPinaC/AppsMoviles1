package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgF;
    TextView txtDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgF = findViewById(R.id.imgF);
        txtDatos = findViewById(R.id.txtDatos);
        imgF.setImageResource(R.drawable.fondo);
        txtDatos.setText(R.string.mis_datos);
    }
}