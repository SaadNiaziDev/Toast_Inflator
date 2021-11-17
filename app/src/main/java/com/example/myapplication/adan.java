package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class adan extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adan);
        t1=findViewById(R.id.txt2);
        t2=findViewById(R.id.txt1);
        String str1=getIntent().getStringExtra("key");
        t1.setText(str1);
        String str2=getIntent().getStringExtra("key2");
        t2.setText(str2);
    }
}