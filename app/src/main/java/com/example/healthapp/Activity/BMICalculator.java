package com.example.healthapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.example.healthapp.Model.BMI_Model;
import com.example.healthapp.R;

import java.text.DecimalFormat;

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
                if(!hString.isEmpty() && !wString.isEmpty()){
                    DecimalFormat df = new DecimalFormat("0.00");
                    BMI_Model bmi = new BMI_Model(Double.parseDouble(hString), Double.parseDouble(wString), !unit.isChecked());
                    BMI.setText(df.format(bmi.getBMI()));
                    status.setText(bmi.getStatus().name());
                }
            }
        });

        Button back = (Button) findViewById(R.id.backBtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}