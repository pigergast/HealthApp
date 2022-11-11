package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Excercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_excercises);

        Button btn = findViewById(R.id.button3);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layout.getVisibility() == View.VISIBLE) {
                    layout.setVisibility(View.GONE);
                }
                else {
                    layout.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}