package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button button_prox2;
    Button button_loc;
    Button button_fav;
    Button button_ocup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button_loc = (Button) findViewById(R.id.button_loc);
        button_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        button_fav = (Button) findViewById(R.id.button_f);
        button_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

        button_ocup = (Button) findViewById(R.id.button_ocup);
        button_ocup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });

        button_prox2 = (Button) findViewById(R.id.button_prox2);
        button_prox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

    }

    public void openActivity4(){
        Intent i = new Intent(this, Activity4.class);
        startActivity(i);
    }

    public void openActivity5(){
        Intent i = new Intent(this, Localidadde.class);
        startActivity(i);
    }

    public void openActivity6(){
        Intent i = new Intent(this, Fav.class);
        startActivity(i);
    }

    public void openActivity7(){
        Intent i = new Intent(this, Ocup.class);
        startActivity(i);
    }
}
