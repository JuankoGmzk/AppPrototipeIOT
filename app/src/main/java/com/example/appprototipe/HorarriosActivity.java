package com.example.appprototipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HorarriosActivity extends AppCompatActivity {

    FloatingActionButton buttonQrProfesores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarrios);



        buttonQrProfesores = findViewById(R.id.ButtonDocente);


        buttonQrProfesores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HorarriosActivity.this,   MainPicture.class);
                startActivity(i);
            }
        });
    }
}
