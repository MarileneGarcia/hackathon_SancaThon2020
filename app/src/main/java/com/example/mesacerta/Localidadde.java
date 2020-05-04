package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mesacerta.MapsActivity2;
import com.example.mesacerta.R;

import java.net.URISyntaxException;

public class Localidadde extends AppCompatActivity {
    EditText estado;
    EditText cidade;
    EditText bairro;

    String localizacao = "Sao Paulo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localidadde);
        estado = (EditText) findViewById(R.id.editTextE);
        cidade = (EditText) findViewById(R.id.editTextC);
        bairro = (EditText) findViewById(R.id.editTextB);

        Button button_buscar;
        button_buscar = (Button) findViewById(R.id.button_buscar);
        button_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    openActivity5();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public void openActivity5() throws URISyntaxException {
        if(estado.getText().length() != 0 &&  cidade.getText().length() != 0 && bairro.getText().length() != 0 ){
            localizacao = estado.getText().toString() + "," + cidade.getText().toString() + "," + bairro.getText().toString();
        }

        else if(estado.getText().length() != 0 &&  cidade.getText().length() != 0 && bairro.getText().length() == 0 ){
            localizacao = estado.getText().toString() + "," + cidade.getText().toString();
        }

        else if(estado.getText().length() != 0 &&  cidade.getText().length() == 0 && bairro.getText().length() == 0 ){
            localizacao = estado.getText().toString();
        }

        else if(estado.getText().length() == 0 &&  cidade.getText().length() != 0 && bairro.getText().length() != 0 ){
            localizacao = cidade.getText().toString()+ "," + bairro.getText().toString();
        }

        else if(estado.getText().length() == 0 &&  cidade.getText().length() != 0 && bairro.getText().length() == 0 ){
            localizacao = cidade.getText().toString();
        }

        else if (estado.getText().length() == 0 &&  cidade.getText().length() == 0 && bairro.getText().length() != 0 ){
            localizacao = bairro.getText().toString();
        }

        else if (estado.getText().length() != 0 &&  cidade.getText().length() == 0 && bairro.getText().length() != 0 ){
            localizacao = estado.getText().toString() + "," + bairro.getText().toString();
        }

        Intent i = new Intent(this, MapsActivity2.class);
        Bundle params = new Bundle();
        params.putString("mensagem", localizacao);
        i.putExtras(params);
        startActivity(i);
    }
}