package com.hector.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainRegistro extends AppCompatActivity {

    Button registro;
    EditText textUsuario;
    EditText textPass;
    EditText textRPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_registro);

        textUsuario = (EditText) findViewById(R.id.editTextText);
        textPass = (EditText) findViewById(R.id.editTextText2);
        textRPass = (EditText) findViewById(R.id.editTextText3);
        registro = (Button) findViewById(R.id.button);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registroOK();
            }
        });
    }

    private void registroOK() {
        if (textUsuario.getText().toString().isEmpty() || textPass.getText().toString().isEmpty() || textRPass.getText().toString().isEmpty()) {
            if (textUsuario.getText().toString().isEmpty()) {
                Toast.makeText(this, "El campo de usuario está vacío", Toast.LENGTH_LONG).show();
            }
            if (textPass.getText().toString().isEmpty()) {
                Toast.makeText(this, "El campo de contraseña está vacío", Toast.LENGTH_LONG).show();
            }
            if (textRPass.getText().toString().isEmpty()) {
                Toast.makeText(this, "El campo de confirmación de contraseña está vacío", Toast.LENGTH_LONG).show();
            }
        } else {
            if (textRPass.getText().toString().equals(textPass.getText().toString())) {
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, MainActivity.class));
            } else {
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show();
            }
        }


    }

}