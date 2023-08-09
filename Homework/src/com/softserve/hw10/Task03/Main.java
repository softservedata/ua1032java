package com.softserve.hw10.Task03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 3));
        students.add(new Student("Mark", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Will", 4));
        students.add(new Student("Rick", 5));
        //
        student.printStudents(students, 4);
        student.printStudents(students, 1);
        //
        students.sort(new Student.ByName());
        System.out.println("\nSorted by name" + students);
        //
        students.sort(new Student.ByCourse());
        System.out.println("\nSorted by course" + students);
    }
}
