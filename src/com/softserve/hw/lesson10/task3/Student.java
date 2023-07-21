package com.softserve.hw.lesson10.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
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

    @Override
    public String toString() {
        return "Student " +
                "name= " + name +
                ", course= " + course + '\n';
    }

    public static void printStudent(List<Student> studentList, int course) {
        Iterator<Student> iterator = studentList.listIterator();
        System.out.println("Specified course: " + course);
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> studentComparatorByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> studentComparatorByCourse() {
        return Comparator.comparing(Student::getCourse);
    }
}
