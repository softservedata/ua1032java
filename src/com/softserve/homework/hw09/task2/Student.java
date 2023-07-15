package com.softserve.homework.hw09.task2;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int group;
    private  int course;
    private List<Integer> grades;

    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public double calculateAverageGrade() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean isPromoted() {
        double averageGrade = calculateAverageGrade();
        if (averageGrade >= 3.0) {
            course++;
            return true;
        } else {
            return false;
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public String toString() {
        return " name= " + name + "\n" +
                " group= " + group +"\n"+
                " course= " + course +"\n" +
                " grades=" + grades + "\n";
    }
}
