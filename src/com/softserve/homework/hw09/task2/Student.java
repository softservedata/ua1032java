package com.softserve.homework.hw09.task2;

import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    //Середній бал
    public double getAverageGrade() {
        double sum = 0;

        for (double grade : grades) {
            sum = sum + grade;
        }
        return sum / grades.size();
    }

    public void promoteToNextCourse() {
        course = course +1;
    }
}