package com.softserve.Homework.hw_10.task3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yura", 2));
        students.add(new Student("Sasha", 4));
        students.add(new Student("Lev", 3));
        students.add(new Student("Maks", 2));
        students.add(new Student("Taras", 5));
        Collections.sort(students);
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + ", Course: "+ student.getCourse());
        }
       students.sort(Student::comparebyCourse);
        System.out.println("\nSorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + ", Course: "+ student.getCourse());
        }
    }
}
