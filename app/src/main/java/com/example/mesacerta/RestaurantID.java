package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantID extends AppCompatActivity {
    Button button_com;
    Button button_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_i_d);

        button_com = (Button) findViewById(R.id.button_comanda);
        button_com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        button_menu = (Button) findViewById(R.id.button_card);
        button_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }

    public void openActivity5() {
        Intent i = new Intent(this, Comanda.class);
        startActivity(i);
    }

    public void openActivity6() {
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}
