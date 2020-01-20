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

public class ActivityDocente extends AppCompatActivity {

    TextView textShp;
    TextView textShp2;
    TextView textShp3;
    FloatingActionButton botonDocente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente);



        textShp = findViewById(R.id.Id_NameDocente);
        textShp2 = findViewById(R.id.Id_DescriptionDocente);
        textShp3 = findViewById(R.id.Id_GeneroDocente);
        botonDocente = findViewById(R.id.ButtonDocente);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();

        String data = prefs.getString("nombreEstudiante", "no id");
        String data2 = prefs.getString("carreraEstudiante", "no id");
        String data3 = prefs.getString("NickUser", "no id");

        textShp.setText(data);
        textShp2.setText(data2);
        textShp3.setText(data3);

        botonDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityDocente.this,   HorarriosActivity.class);
                startActivity(i);
            }
        });
    }




}
