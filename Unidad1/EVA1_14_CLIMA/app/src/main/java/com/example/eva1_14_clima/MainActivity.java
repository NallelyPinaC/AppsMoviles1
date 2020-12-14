package com.example.eva1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Weather[] weathers ={
            new Weather("Chihuahua", 20, "Lluvia ligera", R.drawable.light_rain),
            new Weather("CD. Juarez", 15, "Nublado", R.drawable.cloudy),
            new Weather("Camargo", 33.11, "Vientos moderados", R.drawable.atmospher),
            new Weather("Parral", 24, "Lluvioso", R.drawable.rainy),
            new Weather("Jimenez", 21, "Soleado", R.drawable.sunny),
            new Weather("Cuauhtemoc", 19, "Nevado", R.drawable.snow),
            new Weather("Aldama", 17, "Lluvias intensas", R.drawable.thunderstorm),
            new Weather("Casas grandes", 15, "Lluvioso", R.drawable.rainy),
            new Weather("Ojinaga", 18, "Lluvia ligera", R.drawable.tornado),
            new Weather("Creel", 25, "Lluvias intensas", R.drawable.thunderstorm),
            new Weather("Batopilas", 11, "Nublado", R.drawable.cloudy),
    };
    ListView lstViewClima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstViewClima = findViewById(R.id.lstViewClima);
        lstViewClima.setAdapter(new WeatherAdapter(
                this,
                R.layout.layout_weather,
                weathers

        ));
    }
}