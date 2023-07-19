package com.softserve.edu.hw4.Homework10;

public class Faculty {


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
