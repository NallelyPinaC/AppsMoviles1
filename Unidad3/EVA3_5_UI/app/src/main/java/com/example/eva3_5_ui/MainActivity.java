package com.example.eva3_5_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTexto = findViewById(R.id.txtTexto);

        Thread thilo = new Thread(){
            @Override
            public void run() {
                super.run();
                int i=0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.wtf("Runnable1",i+"");
                    txtTexto.append(i+"\n");
                    i++;
                }

            }
        };
        thilo.start();
    }
}