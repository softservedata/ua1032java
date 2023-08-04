package com.softserve.homework.homework9.task2;

import java.util.List;

public class Student {
    String name;
    String group;
    int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name = '" + name + '\'' +
                ", group = '" + group + '\'' +
                ", course = " + course +
                ", grades = " + grades +
                " }";
    }
}
