package com.softserve.java_homework.lesson08;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Integer> grades1 = new ArrayList<>();
        grades1.add(1);
        grades1.add(1);
        grades1.add(1);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(1);
        grades2.add(2);
        grades2.add(1);

        List<Integer> grades3 = new ArrayList<>();
        grades3.add(3);
        grades3.add(2);
        grades3.add(4);

        List<Integer> grades4 = new ArrayList<>();
        grades4.add(5);
        grades4.add(2);
        grades4.add(3);

        students.add(new Student("Marko", "Group C", 3, grades1));
        students.add(new Student("Elias", "Group A", 3, grades2));
        students.add(new Student("Mathias", "Group B", 1, grades3));
        students.add(new Student("Thomas", "Group A", 2, grades4));

        Student.printStudents(students, 3);
        System.out.println();

        Student.removeStudentWithLowAverage(students);
        for (Student student : students) {
            if (student.averageOfGrades() > 3.0) student.promoteCourse();
        }

        System.out.println("Students who have entered the next course: ");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Average grade: " + student.averageOfGrades());
            System.out.println();
        }
    }
}
