package com.example.handsonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Message extends AppCompatActivity {
    TextView Message;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Message = findViewById(R.id.Message);
        String result = getIntent().getExtras().getString("result");
        Message.setText(result);
    }
}