package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler(); //contador de tempo
        handler.postDelayed(this, 150);

    }
    @Override
    public void run() {
        Intent intent = new Intent(this, Main2Activity.class);

    }

}
