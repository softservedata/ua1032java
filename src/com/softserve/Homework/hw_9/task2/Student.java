package com.softserve.Homework.hw_9.task2;
import java.util.*;

class Student {
    String name;
    int group;
    int course;
    List<Double> grades;

    public Student(String name, int group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}




