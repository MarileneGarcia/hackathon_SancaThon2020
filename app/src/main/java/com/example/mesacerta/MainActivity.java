package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Delay();
    }

    public void Delay(){
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        }, 5000);
    }

}
