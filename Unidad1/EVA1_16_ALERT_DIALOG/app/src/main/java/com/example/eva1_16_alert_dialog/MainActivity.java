package com.example.eva1_16_alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowAlertDialog(View v){
        new AlertDialog.Builder(this)
                .setTitle("CUADRO DE DIALOGO DE ANDROID")
                .setMessage("Cuadro de diálogo del sistema")
                .setIcon(R.drawable.ic_launcher_foreground)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("Alert dialog", "Yes");
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("Alert dialog", "No");
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("Alert dialog", "Cancel");
                    }
                })
                .create()
                .show();
    }
    public void onShowMyAlertDialog(View v){
        final Dialog miCuadroDialogo = new Dialog(this);
        miCuadroDialogo.setContentView(R.layout.mi_dialogo);

        TextView txtView = miCuadroDialogo.findViewById(R.id.txtView);
        txtView.setText("¡ESTE ES MI CUADRO DE DIALOGO!");
        final EditText edTxtDatos = miCuadroDialogo.findViewById(R.id.edTxtDatos);
        Button btnOk = miCuadroDialogo.findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sCade = edTxtDatos.getText().toString();
                Log.wtf("Cuadro personalizado", sCade);
                miCuadroDialogo.dismiss();

            }
        });
        miCuadroDialogo.show();
    }
}