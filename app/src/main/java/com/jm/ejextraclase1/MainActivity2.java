package com.jm.ejextraclase1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText txtTitulo;
    EditText txtPeso;
    EditText txtAltura;
    Button btnCalcularimc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtTitulo = findViewById(R.id.editTextTitulo);
        txtPeso = findViewById(R.id.editTextPeso);
        txtAltura = findViewById(R.id.editTextAltura);
        btnCalcularimc = findViewById(R.id.btnCalcular);
        btnCalcularimc.setOnClickListener(this);
        txtPeso.setOnClickListener(this);
        txtAltura.setOnClickListener(this);

    }

    public Double calcularImc(double peso, double altura){
        double imc=0;
        imc = peso / (altura*altura);
        return imc;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalcular: {
                double peso = Double.parseDouble(txtPeso.getText().toString());
                double altura = Double.parseDouble(txtAltura.getText().toString());
                double imc = calcularImc(peso, altura);
                Toast.makeText(this, "Su IMC es: " + imc, Toast.LENGTH_LONG).show();
            }
        }
    }
}