package com.example.eva1_8_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Aquí se declaran los widgest
    RadioGroup rdGrp_Idioma;
    RadioButton rdBtnEspañol, rdBtnIngles, rdBtnMucho, rdBtnPoco, rdBtnNada;
    TextView txtNombre, txtApellido, txtSexo;
    EditText txtHintNombre, txtHintApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se conecta los widgets declarados con las id de los widgets que estan en la interfaz
        rdGrp_Idioma = findViewById(R.id.rdGrp_Idioma);
        rdBtnEspañol = findViewById(R.id.rdBtnEspañol);
        rdBtnIngles = findViewById(R.id.rdBtnIngles);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtHintApellido = findViewById(R.id.txtHintNombre);
        txtHintApellido = findViewById(R.id.txtHintApellido);
        txtSexo = findViewById(R.id.txt_sexo);
        rdBtnMucho = findViewById(R.id.rdBtnMucho);
        rdBtnPoco = findViewById(R.id.rdBtnPoco);
         rdBtnNada = findViewById(R.id.rdBtnNada);

        rdGrp_Idioma.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if(i == R.id.rdBtnEspañol) {
                            rdBtnEspañol.setText(R.string.btn_es_español);
                            rdBtnIngles.setText(R.string.btn_es_ingles);
                            txtNombre.setText("Nombre");
                            txtApellido.setText("Apellido");
                            txtHintNombre.setText("Introduce tu nombre");
                            txtHintApellido.setText("Introduce tu apellido");
                            txtSexo.setText("Sexo");
                            rdBtnMucho.setText("Mucho");
                            rdBtnPoco.setText("Poco");
                            rdBtnNada.setText("Nada");

                        }else if(i == R.id.rdBtnIngles){
                            rdBtnEspañol.setText(R.string.btn_en_español);
                            rdBtnIngles.setText(R.string.btn_en_ingles);
                            txtNombre.setText("First name");
                            txtApellido.setText("Last name");
                            txtHintNombre.setText("Your first name");
                            txtHintApellido.setText("Your last name");
                            txtSexo.setText("Sex");
                            rdBtnMucho.setText("As a hollywood star");
                            rdBtnPoco.setText("A little");
                            rdBtnNada.setText("Nothing");

                        }

                    }
                }
        );

    }
}