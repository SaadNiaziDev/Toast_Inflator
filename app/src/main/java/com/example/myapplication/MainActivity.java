package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button1);
        b.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),adan.class);
            intent.putExtra("key","Adan");
            intent.putExtra("key2","12345");
            startActivity(intent);
        });
    }


}