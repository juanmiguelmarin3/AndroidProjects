package com.jm.ejextraclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private Button btnCalcularImc;
    private Button btnConversor;
    private Button btnCalcular;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        txtNombre = findViewById(R.id.editTextNombre);
        btnCalcularImc = findViewById(R.id.buttonImc);
        btnCalcularImc.setOnClickListener(this);
        btnConversor = findViewById(R.id.buttonConversor);
        btnConversor.setOnClickListener(this);
        btnCalcular = findViewById(R.id.buttonConvencional);
        btnCalcular.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.buttonImc:
                intent = new Intent(this,MainActivity2.class);
                intent.putExtra("EditTextNombre",txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entró por medio de Calculadora IMC", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonConversor:
                intent = new Intent(this,MainActivity3.class);
                intent.putExtra("EditTextNombre",txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entró por medio del Conversor de Unidades", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonConvencional:
                intent = new Intent(this,MainActivity.class);
                intent.putExtra("EditTextNombre",txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entró por medio de Calculadora Convencional", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}