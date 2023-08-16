package com.softserve.hw.lesson4.task4;

public class Faculty {
    private int numberStudents;
    private Seasons seasons;

    public Faculty(int numberStudents, Seasons seasons) {
        this.numberStudents = numberStudents;
        this.seasons = seasons;
    }

    public Faculty() {

    }

    public int getNumberStudents() {
        return numberStudents;
    }

    public void setNumberStudents(int numberStudents) {
        this.numberStudents = numberStudents;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "Faculty " +
                "numberStudents= " + numberStudents +
                ", seasons=" + seasons;
    }
}
