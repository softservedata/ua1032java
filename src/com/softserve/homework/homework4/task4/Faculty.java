package com.softserve.homework.homework4.task4;

public class Faculty {
    private int quantityOfStudents;
    private Season season;

    public Faculty(int quantityOfStudents, Season season) {
        this.quantityOfStudents = quantityOfStudents;
        this.season = season;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }
    public void setSeason(Season season) {
        this.season = season;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }
    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "quantityOfStudents=" + quantityOfStudents +
                ", season=" + season +
                '}';
    }
}
