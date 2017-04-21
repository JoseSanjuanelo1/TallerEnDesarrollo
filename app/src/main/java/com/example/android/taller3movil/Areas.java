package com.example.android.taller3movil;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas  {

    private ListView ls;
    private Resources res;
    private String [] opc;
    private Intent i;

    String operacion;
    int datos, resultado;

    public Areas(String operacion, int datos, int resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() { return operacion; }

    public void setOperacion(String operacion) { this.operacion = operacion;}

    public int getDatos() { return datos; }

    public void setDatos(int datos) { this.datos = datos; }

    public int getResultado() {return resultado; }

    public void setResultado(int resultado) { this.resultado = resultado; }

    public void guardar(){ Datos.guardar(this);}

}
