package com.example.appprototipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivityEstudiantes extends AppCompatActivity {


    TextView textShp;
    TextView textShp2;
    TextView textShp3;
    FloatingActionButton botton_estudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        textShp = findViewById(R.id.Id_Name);
        textShp2 = findViewById(R.id.Id_Description);
        textShp3 = findViewById(R.id.Id_Genero);
        botton_estudiante = findViewById(R.id.ButtonEstudiantePerfil);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();

        String data = prefs.getString("nombreEstudiante", "no id");
        String data2 = prefs.getString("carreraEstudiante", "no id");
        String data3 = prefs.getString("NickUser", "no id");

        textShp.setText(data);
        textShp2.setText(data2);
        textShp3.setText(data3);

        botton_estudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityEstudiantes.this,   HorariosEstudianteActivity.class);
                startActivity(i);
            }
        });
    }

}
