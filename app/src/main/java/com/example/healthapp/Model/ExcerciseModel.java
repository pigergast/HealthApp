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

        ExcerciseModel Arms = new ExcerciseModel("\uD83D\uDCAAArms", "1H");
        Arms.excerciseList.add(new SetModel("Bicep Curl", 12, 4));
        Arms.excerciseList.add(new SetModel("Tricep Pushdown", 12, 4));
        Arms.excerciseList.add(new SetModel("Hammer Curl", 12, 3));
        Arms.excerciseList.add(new SetModel("Skull Crushers", 8, 3));
        list.add(Arms);
        ExcerciseModel Legs = new ExcerciseModel("\uD83E\uDDB5Legs", "1H");
        Legs.excerciseList.add(new SetModel("Leg Curl", 8, 4));
        Legs.excerciseList.add(new SetModel("Leg Extention", 8, 4));
        Legs.excerciseList.add(new SetModel("Leg Press", 4, 3));
        list.add(Legs);
        ExcerciseModel Powerlifting = new ExcerciseModel("\uD83C\uDFCBPowerlifting", "2H");
        Powerlifting.excerciseList.add(new SetModel("Bench Press", 5, 4));
        Powerlifting.excerciseList.add(new SetModel("Squat", 5, 4));
        Powerlifting.excerciseList.add(new SetModel("Deadlift", 5, 4));
        Powerlifting.excerciseList.add(new SetModel("Overhead Press", 5, 4));
        list.add(Powerlifting);
        ExcerciseModel Shoulder = new ExcerciseModel("\uD83D\uDCAAShoulders", "1H");
        Shoulder.excerciseList.add(new SetModel("Dumbbell Press", 8, 4));
        Shoulder.excerciseList.add(new SetModel("Lateral Raises", 8, 4));
        Shoulder.excerciseList.add(new SetModel("Front Raises", 8, 4));
        list.add(Shoulder);
        ExcerciseModel Back = new ExcerciseModel("\uD83D\uDEB6Back", "1H");
        Back.excerciseList.add(new SetModel("Pulldowns", 10, 4));
        Back.excerciseList.add(new SetModel("Cable Row", 8, 4));
        Back.excerciseList.add(new SetModel("Bentover Row", 5, 4));
        list.add(Back);





        return list;

    }
}
