package com.softserve.Homework.hw_9.task2;

import java.util.*;


public class Main {
    public static void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yura", 1, 1, Arrays.asList(2.5, 3.0, 3.5)));
        students.add(new Student("Alice", 1, 1, Arrays.asList(3.5, 4.0, 4.5)));
        students.add(new Student("Sasha", 2, 2, Arrays.asList(2.0, 2.5, 3.0)));
        students.add(new Student("David", 2, 2, Arrays.asList(4.0, 4.5, 5.0)));

        System.out.println("Original list of students:");
        for (Student student : students) {
            System.out.println(student.name + " (course " + student.course + ")");
        }

        removeLowPerformingStudents(students);

        System.out.println("\nAfter removing low performing students:");
        for (Student student : students) {
            System.out.println(student.name + " (course " + student.course + ")");
        }

        System.out.println("\nStudents in course 2:");
        printStudents(students, 2);
        System.out.println("\nStudents in course 3:");
        printStudents(students, 3);
    }
}
