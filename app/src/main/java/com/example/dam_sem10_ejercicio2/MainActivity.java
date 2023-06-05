package com.example.dam_sem10_ejercicio2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView lista;
    List<String> estudiantes;

    Button BtnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. Conectamos nuestro listView a lista a través del id
        lista = findViewById(R.id.listview);

        // 2. Instanciamos la Lista y agregamos elementos
        estudiantes = new ArrayList<>();
        estudiantes.add("Analisis y Diseño de Sistemas");
        estudiantes.add("Sistemas de Informacion");
        estudiantes.add("Simulacion de sistemas");
        estudiantes.add("Diseño de aplicaciones moviles");
        estudiantes.add("SCRUM");
        estudiantes.add("Sistemas Operativos");
        estudiantes.add("Arquitectura de computadoras");

        // 3. Definir el Adaptador
        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                estudiantes
        );

        // 4. Vinculamos el Adaptador con el listView
        lista.setAdapter(adaptadorEstudiantes);
        BtnToast = findViewById(R.id.buttonFinalizar);


        BtnToast.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Matricula enviada", Toast.LENGTH_SHORT).show();
    }
}
