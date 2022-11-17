package com.example.healthapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toBMI = (Button) findViewById(R.id.bmi_button);
        Button toEx = (Button) findViewById(R.id.excercises);
        Button toTips = (Button) findViewById(R.id.Tips);
        toBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BMICalculator.class);
                startActivity(intent);
            }
        });
        toEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Excercises.class);
                startActivity(intent);
            }
        });
        toTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tips.class);
                startActivity(intent);
            }
        });
  }
}