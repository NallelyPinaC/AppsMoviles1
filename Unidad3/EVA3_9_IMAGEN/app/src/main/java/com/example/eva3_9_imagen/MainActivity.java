package com.example.eva3_9_imagen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    ImageView imgInternet;
    Bitmap imagen;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            imgInternet.setImageBitmap(imagen);
        }
    };

    @Override
    protected void onCrueate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgInternet = findViewById(R.id.imgInternet);

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                imagen = cargarImagen("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/180612_Harry_Styles_Live_On_Tour_in_Nashville.png/220px-180612_Harry_Styles_Live_On_Tour_in_Nashville.png");
                Message msg = handler.obtainMessage();
                handler.sendMessage(msg);
            }
        };
        thread.start();

    }
    public Bitmap cargarImagen(String url){
        try {
            InputStream inputStream = (InputStream) new URL(url).getContent();
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}