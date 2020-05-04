package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    Button button_bar;
    Button button_res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        button_bar = (Button) findViewById(R.id.button_prox5);
        button_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        button_res = (Button) findViewById(R.id.button_res5);
        button_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }

    public void openActivity5(){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void openActivity6(){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}
