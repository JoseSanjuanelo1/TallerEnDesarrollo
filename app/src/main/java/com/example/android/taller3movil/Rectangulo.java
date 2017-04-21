package com.example.android.taller3movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class Rectangulo extends AppCompatActivity {
    private EditText cajaBase, cajaAltura;
    private ArrayAdapter<String> adapter;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        cajaBase = (EditText)findViewById(R.id.txtBase);
        cajaAltura = (EditText)findViewById(R.id.txtAltura);
        i = new Intent(this, resultadoCuadrado.class);
        b = new Bundle();
    }

    public void borrar(View v){
        cajaBase.setText("");
        cajaAltura.setText("");
        cajaBase.requestFocus();
    }

    public void calcularAR(View v){
        if(validar()) {
            double altura,base, result;

            base = Double.parseDouble(cajaBase.getText().toString());
            altura = Double.parseDouble(cajaAltura.getText().toString());
            result = base * altura;

            b.putDouble("L", result);
            i.putExtras(b);

            startActivity(i);
        }
    }

    public boolean validar(){
        if (cajaBase.getText().toString().isEmpty() ){
            //Toast.makeText(getApplicationContext(), "Digite por favor el nombre" , Toast.LENGTH_SHORT).show();
            cajaBase.setError(getResources().getString(R.string.error_2));
            return false;
        }

        if (cajaAltura.getText().toString().isEmpty()){
            //Toast.makeText(getApplicationContext(), "Digite por favor el apellido" , Toast.LENGTH_SHORT).show();
            cajaAltura.setError(getResources().getString(R.string.error_3));
            return false;
        }
        return true;
    }
}
