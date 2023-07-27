package com.softserve.HomeWork.HW9.task2;

import java.util.*;

public class Student {
    String name;
    int group;
    int course;
    List<Integer> grades;

    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public double getAverage() {
        double average = 0;
        for (int i = 0; i < grades.size(); i++) {
            average += grades.get(i);
        }
        return average / grades.size();
    }

    public void clearGrades() {
        grades.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && course == student.course && Objects.equals(name, student.name) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, grades);
    }

    @Override
    public String toString() {
        return "\n\tStudent{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
