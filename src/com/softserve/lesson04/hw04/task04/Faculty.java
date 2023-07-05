package com.softserve.lesson04.hw04.task04;

public class Faculty {
    private int studentNum;
    private CurrentSeason currentSeason;

    public Faculty(int studentNum, CurrentSeason currentSeason) {
        this.studentNum = studentNum;
        this.currentSeason = currentSeason;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (studentNum != faculty.studentNum) return false;
        return currentSeason == faculty.currentSeason;
    }

    @Override
    public int hashCode() {
        int result = studentNum;
        result = 31 * result + (currentSeason != null ? currentSeason.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Faculty {" +
                "studentNum= " + studentNum +
                ", currentSeason= " + currentSeason +
                '}';
    }
}
