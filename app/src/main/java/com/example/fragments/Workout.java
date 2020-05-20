package com.example.fragments;

public class Workout {
    private String name;
    private String description;
    public static final Workout[] workouts = {
            new Workout("Zaczynam prace",
                    "Pamiętaj żeby nie siedzieć przy komputerze dłużej niż 1h\nPo tym odpocznij\n "),
            new Workout("Przerwa od pracy",
                    "Przerwa powinna trwać min. 15 min \n Odejdź od komputera i zajmuj się czymś innym na tą chwilę"),
            new Workout("Lab5",
                    "Praca na tą laborką nie powinna zajęć Ci dłużej niż\n 1h"),

    };
    //Each Workout has a name and description
    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}