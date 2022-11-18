package com.example.healthapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthapp.Adapter.ExcerciseAdapter;
import com.example.healthapp.Model.ExcerciseModel;
import com.example.healthapp.R;

import java.util.List;

public class Excercises extends AppCompatActivity {

    List<ExcerciseModel> excercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_excercises);

        RecyclerView exList = (RecyclerView) findViewById(R.id.excerciseList);

        excercises = ExcerciseModel.getExcerciseList();
        ExcerciseAdapter adapter = new ExcerciseAdapter(excercises);

        exList.setAdapter(adapter);

        exList.setLayoutManager(new LinearLayoutManager(this));

        Button back = (Button) findViewById(R.id.backButton);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });





    }
}