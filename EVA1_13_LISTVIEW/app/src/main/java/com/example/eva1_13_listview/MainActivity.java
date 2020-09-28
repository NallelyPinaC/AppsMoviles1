package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] datos ={"Sandia","Manzana","Fresas","Durazno","Uvas","Melon","Papaya","Mango","Mandarina","Naranja","Piña","Kiwi","Tuna" +
            "Pera","Peron","Ciruela","Nectarina","Zarzamora","Frambuesa","Limon","Platano"};
    ListView lstViewDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstViewDatos = findViewById(R.id.lstViewDatos);

        lstViewDatos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                datos
        ));

        lstViewDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),datos[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}