package com.softserve.edu01.hw10.task3;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public record Student(String name, int course) {

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.course() == course) {
                System.out.println(student.name());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::name);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::course);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Max", 1));
        students.add(new Student("Lily", 2));
        students.add(new Student("Ann", 1));
        students.add(new Student("Emma", 3));
        students.add(new Student("Miya", 2));

        System.out.println("Students sorted by name:");
        students.sort(compareByName());
        for (Student student : students) {
            System.out.println(student.name() + " - Course: " + student.course());
        }

        System.out.println("\nStudents sorted by course:");
        students.sort(compareByCourse());
        for (Student student : students) {
            System.out.println(student.name() + " - Course: " + student.course());
        }

        int targetCourse = 2;
        System.out.println("\nStudents enrolled in Course " + targetCourse + ":");
        printStudents(students, targetCourse);
    }
}
