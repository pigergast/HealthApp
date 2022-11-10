package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class BMICalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
        Button calculate = (Button) findViewById(R.id.calculate);
        EditText height = (EditText) findViewById(R.id.height);
        EditText weight = (EditText) findViewById(R.id.weight);
        TextView BMI = (TextView) findViewById(R.id.BMI);
        TextView status = (TextView) findViewById(R.id.Status);
        TextView heightText = (TextView) findViewById(R.id.heightText) ;
        TextView weightText = (TextView) findViewById(R.id.weightText);
        Switch unit = (Switch) findViewById(R.id.switchUnit);
        unit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Switch btn = (Switch) view;
                if(btn.isChecked()){
                    heightText.setText("Height(In):");
                    weightText.setText("Weight(Lb):");
                }
                else {
                    heightText.setText("Height(Cm):");
                    weightText.setText("Weight(Kg):");
                }
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hString = height.getText().toString();
                String wString = weight.getText().toString();
            }
        });
    }
}