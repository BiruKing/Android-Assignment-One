package com.ethiop.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void counter(View view) {
        TextView countView = (TextView)   findViewById(R.id.coubtView);
        String getString = (String) countView.getText();
        int increment = Integer.parseInt(getString);
        increment++;
        countView.setText(String.valueOf(increment));
    }

    public void sayHello(View view) {
        Intent next = new Intent(this,MainActivity2.class);
        /* getCountViewTe */
        TextView count = (TextView) findViewById(R.id.coubtView);
        String getView = (String) count.getText();
        int getInt = Integer.parseInt(getView);
        next.putExtra("count",getInt);
        startActivity(next);

    }
}