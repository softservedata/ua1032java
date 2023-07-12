package com.softserve.edu.Homeworks4.Homework10;
enum Season{
    //enum elements
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String name;

    //with constructor we can write values into enum elements
    private Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Faculty{
    //an instance variables or class fields
    private int numOfStudents;
    private Season currentSeason;


    //setters
    public void setNumStd(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setCurSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }


    //getters
    public int getNumStd() {
        return numOfStudents;
    }

    public String getCurSeason() {
        return currentSeason.getName();
    }
}
