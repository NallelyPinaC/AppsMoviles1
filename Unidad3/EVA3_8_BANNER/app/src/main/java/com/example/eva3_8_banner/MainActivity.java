package com.example.eva3_8_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgBanner;
    int[] imagenes = {R.drawable.f1,R.drawable.f2, R.drawable.f3};
    int ind = 0;
    Handler handler = new Handler();
    Runnable backG = new Runnable() {
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.post(foreG);
            }
        }
    };
    Runnable foreG = new Runnable() {
        @Override
        public void run() {
            imgBanner.setImageResource(imagenes[ind]);
            if(ind == 2){
                ind=0;
            }else{
                ind++;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBanner = findViewById(R.id.imgBanner);

        Thread thread = new Thread(backG);
        thread.start();
    }
}