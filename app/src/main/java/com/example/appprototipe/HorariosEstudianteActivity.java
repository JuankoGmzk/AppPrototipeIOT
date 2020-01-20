package com.example.appprototipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HorariosEstudianteActivity extends AppCompatActivity {

    FloatingActionButton buttonQrEstudiantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios_estudiante);


        buttonQrEstudiantes = findViewById(R.id.ButtonEstudianteHorario2);

        buttonQrEstudiantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HorariosEstudianteActivity.this,   escanear_codigo_estudiante.class);
                startActivity(i);
            }
        });
    }
}
