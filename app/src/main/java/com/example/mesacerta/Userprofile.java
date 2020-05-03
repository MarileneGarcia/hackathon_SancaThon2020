package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Userprofile extends AppCompatActivity {
    Button button_casa;
    Button button_cadastro;
    Button button_lupa;
    Button button_info;
    Button button_estrela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);

        button_cadastro = (Button) findViewById(R.id.button_cadastro);
        button_casa = (Button) findViewById(R.id.button_casa);
        button_lupa = (Button) findViewById(R.id.button_info);
        button_info = (Button) findViewById(R.id.button_faq);
        button_estrela= (Button) findViewById(R.id.button_estrela);

        button_casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUser();
            }
        });
        button_lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFaq();
            }
        });
        button_estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }

    public void openActivity2(){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void openActivityUser(){
        Intent i = new Intent(this, Userprofile.class);
        startActivity(i);
    }

    public void openActivity4(){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
    public void openFaq(){
        Intent i = new Intent(this, Faq.class);
        startActivity(i);
    }
    public void openActivity5(){
        Intent i = new Intent(this, Fav.class);
        startActivity(i);
    }
}
