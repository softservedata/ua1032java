package com.softserve.homework.hw10.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {
        // Create a List of Student objects
        List<Student> students = new ArrayList<>();

        // Add Students to the list
        students.add(new Student("Student1", 101));
        students.add(new Student("Student2", 102));
        students.add(new Student("Student3", 101));
        students.add(new Student("Student4", 103));
        students.add(new Student("Student5", 102));

        // Display the list of students
        System.out.println("\nOriginal list of students:");
        for (Student student : students) {
            System.out.println(student.getName() + " : " + student.getCourse());
        }

        //Display students enrolled to the course 101
        Student.printStudents(students, 101);

        // Sort the list of students by name using compareByName comparator
        students.sort(Student.compareByName());

        // Display the list of students sorted by name
        System.out.println("\nList of students sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " : " + student.getCourse());
        }

        // Sort the list of students by course using the compareByCourse comparator
        students.sort(Student.compareByCourse());

        // Display the list of students sorted by course
        System.out.println("\nList of students sorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " : " + student.getCourse());
        }
    }
}
