package com.softserve.homework.hw10.task3;

import java.util.Comparator;
import java.util.List;

public class Student{

    private String name;
    private int course;

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

    public static void printStudents(List<Student> studentList, int course){
        int i = 1;
        boolean isEnrolled = false;
        System.out.println("\nStudents enrolled to course " + course + " : ");
        for (Student student : studentList) {
            if(student.getCourse() == course){
                System.out.println(i +") "+ student.name);
                ++i;
                isEnrolled = true;
            }
        }
        if(!isEnrolled){
            System.out.println("No one student enrolled to that course");
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }


}
