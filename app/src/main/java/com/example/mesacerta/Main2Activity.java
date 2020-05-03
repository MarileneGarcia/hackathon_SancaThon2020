package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button button_casa;
    Button button_cadastro;
    Button button_lupa;
    Button button_estrela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button_lupa = (Button) findViewById(R.id.button_info);
        button_lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button_cadastro = (Button) findViewById(R.id.button_cadastro);
        button_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUser();
            }
        });

        button_casa = (Button) findViewById(R.id.button_casa);
        button_casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button_estrela = (Button) findViewById(R.id.button_estrela);
        button_estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }
    public void openActivityUser(){
        Intent i = new Intent(this, Userprofile.class);
        startActivity(i);
    }
    public void openActivity2(){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void openActivity3(){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
    public void openActivity5(){
        Intent i = new Intent(this, Favoritos.class);
        startActivity(i);
    }
}
