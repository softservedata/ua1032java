package com.softserve.Homework_Collections_part02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student> {
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

    public void printStudents(List<Student> students, int courseNumber) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.course == courseNumber) {
                System.out.println(student.name);
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Eve", 2));

        // Display the list of students sorted by name
        Collections.sort(students);
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();

        // Display the list of students sorted by course
        System.out.println("Sorted by course:");
        students.sort((s1, s2) -> Integer.compare(s1.getCourse(), s2.getCourse()));
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
