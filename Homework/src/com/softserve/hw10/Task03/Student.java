package com.softserve.hw10.Task03;

import java.util.Comparator;
import java.util.List;

public class Student {

    public static class ByName implements Comparator<Student>{
        @Override
        public int compare(Student std1, Student std2){
            return std1.getName().compareTo(std2.getName());
        }
    }
    public static class ByCourse implements Comparator<Student>{
        @Override
        public int compare(Student std1, Student std2){
            return std1.getCourse() - std2.getCourse();
        }
    }

    private String name;
    private int course;


    public Student() {
        name = "";
        course = -1;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public void printStudents(List<Student> students, int course){
        for(Student std : students){
            if(std.getCourse() == course)
                System.out.println("Name: " + std.getName() + " Course: " + std.getCourse());
        }
    }
    @Override
    public String toString() {
        return "\nStudent{" +
                "name = " + name +
                ", course = " + course +
                "}";
    }
}
