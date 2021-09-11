package com.jm.ejextraclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    EditText txtCantidad;
    ImageButton btnMetrosKm;
    ImageButton btnKgGr;
    ImageButton btnMinH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtCantidad = findViewById(R.id.editTextCantidad);
        txtCantidad.setOnClickListener(this);
        btnMetrosKm = findViewById(R.id.imageButton1);
        btnMetrosKm.setOnClickListener(this);
        btnKgGr = findViewById(R.id.imageButton2);
        btnKgGr.setOnClickListener(this);
        btnMinH = findViewById(R.id.imageButton3);
        btnMinH.setOnClickListener(this);
    }

    public double MetrosKm(double num) {
        double metroskm = 0;
        metroskm = num / 1000;
        return metroskm;
    }

    public double KgGr(double num) {
        double kggr = 0;
        kggr = num * 1000;
        return kggr;
    }

    public double MinHr(double num) {
        double minhr = 0;
        minhr = num / 60;
        return minhr;
    }

    @Override
    public void onClick(View v) {
        DecimalFormat df = new DecimalFormat();
        switch (v.getId()) {
            case R.id.imageButton1: {
                Double cantidad = Double.parseDouble(txtCantidad.getText().toString());
                Double mtkm = Double.valueOf(df.format(MetrosKm(cantidad)));
                Toast.makeText(this, "El resultado de la conversión de metros a kilómetros es: " + mtkm, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.imageButton2: {
                Double cantidad = Double.parseDouble(txtCantidad.getText().toString());
                Double kgr = Double.valueOf(df.format(KgGr(cantidad)));
                Toast.makeText(this, "El resultado de la conversión de kilogramos a gramos es: " + kgr, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.imageButton3: {
                Double cantidad = Double.parseDouble(txtCantidad.getText().toString());
                Double mhr = Double.valueOf(df.format(MinHr(cantidad)));
                Toast.makeText(this, "El resultado de la conversión de minutos a horas es: " + mhr, Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}