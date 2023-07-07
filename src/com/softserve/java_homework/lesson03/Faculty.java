package com.softserve.java_homework.lesson03;

public class Faculty {
    enum Season {SPRING, SUMMER, FALL, WINTER}
    private Season season;
    private int numberOfStudents;

    public Faculty(int numberOfStudents, Season season) {
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "Faculty { number of students = " + getNumberOfStudents()
                + ", season = " + getSeason() + " }";
    }
}