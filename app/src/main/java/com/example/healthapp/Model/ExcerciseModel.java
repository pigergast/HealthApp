package com.example.healthapp.Model;

import java.util.ArrayList;
import java.util.List;

import kotlin.text.UStringsKt;

public class ExcerciseModel {
    public List<SetModel> excerciseList;
    public String excerciseName;
    public String duration;

    public ExcerciseModel(String excerciseName, String duration) {
        this.excerciseName = excerciseName;
        this.duration = duration;
        this.excerciseList = new ArrayList<SetModel>();
    }


    public static List<ExcerciseModel> getExcerciseList()
    {
        List<ExcerciseModel> list = new ArrayList<>();

        ExcerciseModel excercise = new ExcerciseModel("\uD83D\uDCAAArms", "1H");
        excercise.excerciseList.add(new SetModel("Bicep Curl", 12, 4));
        excercise.excerciseList.add(new SetModel("Tricep Pushdown", 12, 4));
        excercise.excerciseList.add(new SetModel("Hammer Curl", 12, 3));
        excercise.excerciseList.add(new SetModel("Skull Crushers", 8, 3));
        list.add(excercise);
        ExcerciseModel excercise2 = new ExcerciseModel("\uD83E\uDDB5Legs", "1H");
        excercise2.excerciseList.add(new SetModel("Squat", 5, 4));
        list.add(excercise2);
        list.add(excercise2);

        return list;

    }
}
