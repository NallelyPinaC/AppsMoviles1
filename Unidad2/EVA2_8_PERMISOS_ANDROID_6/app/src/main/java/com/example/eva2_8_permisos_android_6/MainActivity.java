package com.example.eva2_8_permisos_android_6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTxt;
    Intent intent;
    final int PERMISO_LLANAR = 1000;
    boolean bande = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxt = findViewById(R.id.edtTxt);
        //Permiso
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            //No tiene permiso
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, PERMISO_LLANAR);

        }
    }
    public void llamar(View v){
        if(bande) {
            String sTel = "tel:" + edtTxt.getText().toString();
            intent = new Intent(Intent.ACTION_CALL, Uri.parse((sTel)));
            startActivity(intent);
        }else{
            Toast.makeText(this,"No tienes permisos para relizar la llamada",  Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == PERMISO_LLANAR){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                bande=true;
            }
        }
    }
}