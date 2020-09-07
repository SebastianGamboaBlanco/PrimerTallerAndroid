package com.Sebastian.primer_tarrer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario,contraseña;
    Button ingresar,cancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.editusuario);
        contraseña =findViewById(R.id.editcontraseña);
        ingresar = findViewById(R.id.btniniciar);
        cancelar = findViewById(R.id.btncerrar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(contraseña.getText()) || TextUtils.isEmpty(usuario.getText())){
                    Toast.makeText(getApplicationContext(),"No puden haber campos vacios ", Toast.LENGTH_LONG).show();
                }else{
                    Intent i = new Intent(getApplicationContext(),Operaciones.class);
                    startActivity(i);
                }
            }
        });
    }

}
