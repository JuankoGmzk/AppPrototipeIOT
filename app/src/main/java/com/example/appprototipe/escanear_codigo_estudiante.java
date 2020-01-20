package com.example.appprototipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.TextView;


public class escanear_codigo_estudiante extends AppCompatActivity {


    TextView nameStudent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escanear_codigo_estudiante);



        nameStudent = findViewById(R.id.qrEstudiante);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();

        String data = prefs.getString("nombreEstudiante", "no id");

        Log.e("CARGO", data);


        nameStudent.setText(data);



    }
}