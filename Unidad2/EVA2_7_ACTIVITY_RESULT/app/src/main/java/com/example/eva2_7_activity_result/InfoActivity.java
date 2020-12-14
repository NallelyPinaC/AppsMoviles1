package com.example.eva2_7_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {
    EditText edTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        edTxt = findViewById(R.id.edtxt);
    }
        public void onClick2(View v){
            Intent intent = new Intent();
            String sCade =edTxt.getText().toString();
            intent.putExtra("Datos",sCade);
            setResult(Activity.RESULT_OK, intent);
            finish();
        }

}