package com.softserve.java_homework.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mathias", 2));
        students.add(new Student("Elias", 2));
        students.add(new Student("Tobias", 1));
        students.add(new Student("Louis", 3));
        students.add(new Student("Thomas", 3));

        System.out.println("Current students: ");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort((s1, s2) -> {
            int result = s1.getName().compareTo(s2.getName());
            if (result == 0) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
            return result;
        });

        System.out.println("\nStudents sorted by name: ");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort((s1, s2) -> {
            int result = Integer.compare(s1.getCourse(), s2.getCourse());
            if (result == 0) {
                return s1.getName().compareTo(s2.getName());
            }
            return result;
        });

        System.out.println("\nStudents sorted by course: ");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
