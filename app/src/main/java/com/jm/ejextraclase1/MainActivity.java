package com.jm.ejextraclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtNumero1;
    EditText txtNumero2;
    Button btnSuma;
    Button btnResta;
    Button btnMulti;
    Button btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero1 = findViewById(R.id.editTextNum1);
        txtNumero1.setOnClickListener(this);
        txtNumero2 = findViewById(R.id.editTextNum2);
        txtNumero2.setOnClickListener(this);
        btnSuma = findViewById(R.id.buttonSuma);
        btnSuma.setOnClickListener(this);
        btnResta = findViewById(R.id.buttonResta);
        btnResta.setOnClickListener(this);
        btnMulti = findViewById(R.id.buttonMultiplicacion);
        btnMulti.setOnClickListener(this);
        btnDivision = findViewById(R.id.buttonDivision);
        btnDivision.setOnClickListener(this);

    }

    public double Sumar(double uno, double dos){
        double suma = 0;
        suma = uno + dos;
        return suma;
    }

    public double Restar(double uno, double dos){
        double resta = 0;
        resta = uno - dos;
        return resta;
    }

    public double Multiplicar(double uno, double dos){
        double multiplicar = 0;
        multiplicar = uno * dos;
        return multiplicar;
    }

    public double Dividir(double uno, double dos){
        double dividir = 0;
        dividir = uno / dos;
        return dividir;
    }

    @Override
    public void onClick(View v) {
        DecimalFormat df=new DecimalFormat();
        switch (v.getId()){
            case R.id.buttonSuma:{
                Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                Double numero2 = Double.parseDouble(txtNumero2.getText().toString());
                Double sumar = Double.valueOf(df.format(Sumar(numero1, numero2)));
                Toast.makeText(this, "El resultado de la suma es: "+ sumar, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonResta:{
                Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                Double numero2 = Double.parseDouble(txtNumero2.getText().toString());
                Double restar = Double.valueOf(df.format(Restar(numero1, numero2)));
                Toast.makeText(this, "El resultado de la resta es: "+ restar, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonMultiplicacion:{
                Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                Double numero2 = Double.parseDouble(txtNumero2.getText().toString());
                Double multiplicar = Double.valueOf(df.format(Multiplicar(numero1, numero2)));
                Toast.makeText(this, "El resultado de la multiplicación es: "+ multiplicar, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonDivision:{
                Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                Double numero2 = Double.parseDouble(txtNumero2.getText().toString());
                Double dividir = Double.valueOf(df.format(Dividir(numero1, numero2)));
                Toast.makeText(this, "El resultado de la división es: "+ dividir, Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}