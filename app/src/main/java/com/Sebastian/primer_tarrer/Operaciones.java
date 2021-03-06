package com.Sebastian.primer_tarrer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Operaciones extends AppCompatActivity implements View.OnClickListener {
    EditText numero1, numero2;
    Button sumar,restar,multiplicar,dividir,mcd,mcm,mayor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        numero1 = findViewById(R.id.editnumero1);
        numero2 = findViewById(R.id.editnumero2);
        sumar = findViewById(R.id.btnsumar);
        restar = findViewById(R.id.btnrestar);
        multiplicar = findViewById(R.id.btnmultiplicar);
        dividir = findViewById(R.id.btndividir);
        mcd = findViewById(R.id.btnmcd);
        mcm = findViewById(R.id.btnmcm);
        mayor = findViewById(R.id.btnmayor);
        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        mcd.setOnClickListener(this);
        mcm.setOnClickListener(this);
        mayor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(numero1.getText()) || TextUtils.isEmpty(numero2.getText())) {
            Toast toast = Toast.makeText(getApplicationContext(), "Los campos no puden estar vacios ", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {


        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        switch (v.getId()) {
            case R.id.btnsumar:

                Toast suma = Toast.makeText(this, "Suma = " + (n1 + n2), Toast.LENGTH_LONG);
                suma.setGravity(Gravity.CENTER, 0, 0);
                suma.show();
                break;

            case R.id.btnrestar:
                Toast resta= Toast.makeText(this, "Resta = " + (n1 - n2), Toast.LENGTH_LONG);
                resta.setGravity(Gravity.CENTER, 0, 0);
                resta.show();
                break;
            case R.id.btnmultiplicar:
                Toast multiplicacion = Toast.makeText(this, "Multiplicacion = " + (n1 * n2), Toast.LENGTH_LONG);
                multiplicacion.setGravity(Gravity.CENTER, 0, 0);
                multiplicacion.show();
                break;
            case R.id.btndividir:
                if (n2 != 0) {
                    Toast divicion = Toast.makeText(this, "Division= " + (n1 / n2), Toast.LENGTH_LONG);
                    divicion.setGravity(Gravity.CENTER, 0, 0);
                    divicion.show();
                    break;
                } else {
                    Toast no = Toast.makeText(this, "Nose puede dividir entre cero", Toast.LENGTH_LONG);
                    no.setGravity(Gravity.CENTER, 0, 0);
                    no.show();
                    break;
                }
            case R.id.btnmcd:
                int num1 = n1, num2 = n2;
                while (num1 != num2) {
                    if (num1 > num2) {
                        num1 = num1 - num2;
                    } else {
                        num2 = num2 - num1;
                    }
                }
                Toast mcd=Toast.makeText(this, "MCD = " + num1, Toast.LENGTH_LONG);
                mcd.setGravity(Gravity.CENTER, 0, 0);
                mcd.show();
                break;
            case R.id.btnmcm:
                int numer1 = n1, numer2 = n2, mcm = 1, i = 2;
                while (i <= numer1 || i <= numer2) {
                    if (numer1 % i == 0 || numer2 % i == 0) {
                        mcm = mcm * i;
                        if (numer1 % i == 0) numer1 = numer1 / i;
                        if (numer2 % i == 0) numer2 = numer2 / i;
                    } else
                        i = i + 1;
                }
                Toast mc = Toast.makeText(this, "MCM = " + mcm, Toast.LENGTH_LONG);
                mc.setGravity(Gravity.CENTER, 0, 0);
                mc.show();
                break;
            case R.id.btnmayor:
                if (n1 > n2){
                    Toast mayor = Toast.makeText(this, "Mayor = " + n1, Toast.LENGTH_LONG);
                    mayor.setGravity(Gravity.CENTER, 0, 0);
                    mayor.show();
                    break;
            }else{
                    Toast mayor = Toast.makeText(this, "Mayor = " + n2, Toast.LENGTH_LONG);
                    mayor.setGravity(Gravity.CENTER, 0, 0);
                    mayor.show();
                    break;
                }
            }
        }
    }
}
