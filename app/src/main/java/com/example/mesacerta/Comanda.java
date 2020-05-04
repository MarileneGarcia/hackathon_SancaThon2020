package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comanda extends AppCompatActivity {
    Button button_card;
    Button button_pag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comanda);

        button_pag = (Button) findViewById(R.id.button_cc);
        button_pag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        button_card = (Button) findViewById(R.id.button_esc);
        button_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }
    public void openActivity5() {
        Intent i = new Intent(this, Pagamentos.class);
        startActivity(i);
    }

    public void openActivity6() {
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}
