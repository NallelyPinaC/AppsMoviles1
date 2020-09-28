package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    Button btnInListener, btnPorClaseAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInListener = findViewById(R.id.btnInListener);
        btnInListener.setOnClickListener(this);
        btnPorClaseAnonima = findViewById(R.id.btnPorClaseAnonima);
        final Context context = getApplicationContext();
        btnPorClaseAnonima.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "Evento por interfaz", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public void miClick(View v){
        Toast.makeText(this, "Hola Mundo    ", Toast.LENGTH_SHORT).show();
        Log.wtf(tag:"MENSAJE", msg:"FALLA CATASTROFICA");
    }

    @Override
    public void onClick(View view) {
            Toast.makeText(this, "Evento por interfaz", Toast.LENGTH_SHORT).show();
    }
}