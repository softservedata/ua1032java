package com.softserve.edu01.hw9.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private final String name;
    private int course;
    private final List<Integer> grades;

    public Student(String name, int course, List<Integer> grades) {
        this.name = name;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public void promoteToNextCourse() {
        if (getAverageGrade() >= 3.0) {
            course++;
            System.out.println(name + " promoted to course " + course);
        }
    }
    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                System.out.println(student.getName() + " has been removed.");
                iterator.remove();
            }
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

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Integer> grades1 = List.of(4, 3, 5);
        List<Integer> grades2 = List.of(2, 3, 2);
        List<Integer> grades3 = List.of(5, 4, 5);

        students.add(new Student("John", 1, grades1));
        students.add(new Student("Alice", 2, grades2));
        students.add(new Student("Bob", 3, grades3));

        removeUnderperformingStudents(students);

        for (Student student : students) {
            student.promoteToNextCourse();
        }

        printStudents(students, 1);
    }
}











