package com.example.eva2_6_permisos_android_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLlamar;
    Intent intent
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:6143051863"));
    }

    public void onClick(View v){
        startActivity(intent);

    }
}