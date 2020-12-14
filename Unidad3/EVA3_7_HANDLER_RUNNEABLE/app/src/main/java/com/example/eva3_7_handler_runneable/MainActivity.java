package com.example.eva3_7_handler_runneable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtText;
    int i;
    Handler miHand = new Handler();
    Runnable backGroundRun = new Runnable() {//segundo plano
        @Override
        public void run() {
            i = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                miHand.post(foreGroundRun);
                Log.wtf("thread", i + "");
                i++;
            }
        }
    };


        Runnable foreGroundRun = new Runnable() {//modifica la ui
            @Override
            public void run() {
                txtText.append("Valor: " + i + "\n");
            }
        };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtText = findViewById(R.id.txtText);
        Thread thread = new Thread(backGroundRun);
        thread.start();
    }
}