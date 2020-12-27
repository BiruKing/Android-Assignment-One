package com.ethiop.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /* get intent and value*/
        Intent current = getIntent();
        Bundle extras = current.getExtras();
        int count = extras.getInt("count");

        String convert = String.valueOf(count);

        /*//get text view and asign val*/
        TextView hello = (TextView) findViewById(R.id.CView);
        hello.setText(convert);

    }
}