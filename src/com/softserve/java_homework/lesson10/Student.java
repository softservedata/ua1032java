package com.softserve.java_homework.lesson10;

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

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            var value = iterator.next();
            if (value.getCourse() == course) {
                System.out.println(value.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Student { name = " +getName()
                + ", course = " + getCourse()
                + " }";
    }
}
