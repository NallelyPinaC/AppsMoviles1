package com.example.eva1_3_widgets_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtVwHolaMundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwHolaMundo = findViewById(R.id.txtVwDatos);
        txtVwHolaMundo.setText("Mi primer código en android");
    }
}