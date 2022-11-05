package com.example.healthapp.Model;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class JournalModel {
    public JournalModel(Date time, String thoughts, Mood mood) {
        this.time = time;
        this.thoughts = thoughts;
        this.mood = mood;
    }

    enum Mood{
        HAPPY,
        OKAY,
        SAD
    }
    Date time = Calendar.getInstance().getTime();
    String thoughts;
    Mood mood;
}
