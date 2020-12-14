package com.example.eva2_2_action_sednto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtxtTel, edtxtMsg;
    Intent intent;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtMsg = findViewById(R.id.edtxtMsg);
        edtxtTel = findViewById(R.id.edtxtTel);
    }
    public void onClick(View v){
        String sTel="smsto:"+edtxtTel.getText().toString();
        String sMsg =edtxtMsg.getText().toString();
        intent =new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        intent.putExtra("sms_body",sMsg);
        startActivity(intent);
    }
}