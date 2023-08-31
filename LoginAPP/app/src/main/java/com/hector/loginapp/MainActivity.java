package com.hector.loginapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText txtUsuario, txtContraseña;
    Button btn_ingresar;
    Button btn_registro;
    String usuarioTemporal="hector";
    String passwordTemporal="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsuario = (EditText) findViewById(R.id.editTextText);
        txtContraseña = (EditText) findViewById(R.id.editTextText2);
        btn_ingresar = (Button) findViewById(R.id.button);
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        btn_registro = (Button) findViewById(R.id.button2);
        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registro();
            }
        });
    }

    private void registro() {
        Toast.makeText(this, "Redirecting", Toast.LENGTH_LONG).show();
        // Intent intent = new Intent(this,MainPrincipal.class);
        startActivity(new Intent(this,MainRegistro.class));
    }

    private void login() {
        if (!txtUsuario.getText().toString().equals(usuarioTemporal)){
            Toast.makeText(this, "Fail checa el usuario", Toast.LENGTH_LONG).show();
            //txtLoading.setText("Usuario o contrasena incorrecto");
            //btn_ingresar.setEnabled(false);
            return;

        }
        if (!txtContraseña.getText().toString().equals(passwordTemporal)){
            Toast.makeText(this, "Fail Checa tu password", Toast.LENGTH_LONG).show();
            return;

        }

        Toast.makeText(this, "Redirecting", Toast.LENGTH_LONG).show();
       // Intent intent = new Intent(this,MainPrincipal.class);
        startActivity(new Intent(this,MainPrincipal.class));
    }
}