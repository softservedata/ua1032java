package com.softserve.Homework.hw_10.task3;
import java.util.*;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
     public int comparebyCourse(Student other) {
         return Integer.compare(this.course, other.course);
     }
    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

