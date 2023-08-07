package com.softserve.homework.homework10.task3;

import java.util.ArrayList;
import java.util.List;

public class Homework10_03 {
    // TODO: Create a class named Student that stores information about the student's name and course.
    //      - The class should include properties to access these fields, a constructor with parameters, and a method called printStudents that takes a List of students and an Integer representing the course number as arguments.
    //      - This method should print the names of the students from the list who are enrolled in the specified course to the console using an iterator.
    //      - Additionally, add methods to compare students by name and by course.
    //      - In the main() method, create a List named "students" and add five different Student
    //      objects to it. Then, display the list of students sorted by name and sorted by course.

    public static void printStudents(List<Student> studentList, int course) {
        studentList.forEach(st -> {
            if(st.getCourse() == course || course == 0) System.out.println(st);
        });
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", 1));
        students.add(new Student("Mary Jones", 2));
        students.add(new Student("Peter Williams", 3));
        students.add(new Student("Susan Brown", 4));
        students.add(new Student("David Davis", 2));

        System.out.println("Original:");
        printStudents(students, 0);
        students.sort(Student::compareByName);
        System.out.println("\nSorted by name:");
        printStudents(students, 0);
        students.sort(Student::compareByCourse);
        System.out.println("\nSorted by course:");
        printStudents(students, 0);
    }
}
