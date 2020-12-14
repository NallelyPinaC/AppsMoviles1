package com.example.eva2_7_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final int INFO_ACTIVITY = 100;
    final int INFO_CONTACTOS = 200;
    final int INFO_IMAGENES = 300;

    Intent intent, intentContact, intentImage;
    ImageView imgV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgV = findViewById(R.id.imgV);
        intent = new Intent(this, InfoActivity.class);
        intentContact = new Intent(Intent.ACTION_PICK,
                ContactsContract.Contacts.CONTENT_URI);
        intentImage = new Intent(Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public void onClick(View v){
        startActivityForResult(intent,INFO_ACTIVITY);
    }

    public void onClickContact(View v){
        startActivityForResult(intentContact, INFO_CONTACTOS);
    }
    public void onClickImage(View v){
        startActivityForResult(intentImage, INFO_IMAGENES);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case INFO_ACTIVITY:
                if(resultCode == Activity.RESULT_OK){
                    Toast.makeText(this, data.getStringExtra("Datos"), Toast.LENGTH_LONG).show();
                }
                break;
            case INFO_CONTACTOS:
                if(resultCode == Activity.RESULT_OK){
                    Toast.makeText(this, data.getDataString(),Toast.LENGTH_LONG).show();
                }
                break;
            case INFO_IMAGENES:
                if(resultCode == Activity.RESULT_OK){
                    Toast.makeText(this, data.getDataString(),Toast.LENGTH_LONG).show();
                    imgV.setImageURI(Uri.parse(data.getDataString()));
                }
                break;
            default:
        }
    }

}