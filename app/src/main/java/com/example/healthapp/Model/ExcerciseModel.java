package com.example.healthapp.Model;

import java.util.ArrayList;
import java.util.List;

public class ExcerciseModel {
    public List<SetModel> excerciseList;
    public String excerciseName;
    public int duration;

    public ExcerciseModel(String excerciseName, int duration) {
        this.excerciseName = excerciseName;
        this.duration = duration;
        this.excerciseList = new ArrayList<SetModel>();
    }


    public static List<ExcerciseModel> getExcerciseList()
    {
        List<ExcerciseModel> list = new ArrayList<>();
        SetModel set = new SetModel("Bicep Curl", 12, 4);
        ExcerciseModel excercise = new ExcerciseModel("Arms", 1);
        excercise.excerciseList.add(set);
        list.add(excercise);
        return list;

    }
}
