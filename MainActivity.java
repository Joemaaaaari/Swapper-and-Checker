package com.example.handsonactivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);
    }
    public void swapPos(View view){
        String textOne = text1.getText().toString();
        String textTwo = text2.getText().toString();
        text1.setText(textTwo);
        text2.setText(textOne);
    }
    public void checkSim(View view){
        String textOne = text1.getText().toString();
        String textTwo = text2.getText().toString();
        String result = "";
        if (textOne.equals(textTwo)) {
            result = "SAME";
        }
        else {
            result = "NOT THE SAME";
        }
        Intent i = new Intent(this, Message.class);
        i.putExtra("result", result);
        startActivity(i);
    }
}