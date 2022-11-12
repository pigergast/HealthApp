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

        ExcerciseModel excercise = new ExcerciseModel("Arms", 1);
        excercise.excerciseList.add(new SetModel("Bicep Curl", 12, 4));
        excercise.excerciseList.add(new SetModel("Tricep Pushdown", 12, 4));
        list.add(excercise);
        ExcerciseModel excercise2 = new ExcerciseModel("Legs", 1);
        excercise2.excerciseList.add(new SetModel("Squat", 5, 4));
        list.add(excercise2);
        return list;

    }
}
