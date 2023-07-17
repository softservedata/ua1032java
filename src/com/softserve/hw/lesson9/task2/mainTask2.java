package com.softserve.hw.lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class mainTask2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(4);
        grades.add(5);
        grades.add(3);
        List<Integer> grades1 = new ArrayList<>();
        grades1.add(2);
        grades1.add(1);
        grades1.add(3);
        grades1.add(3);
        List<Integer> grades2 = new ArrayList<>();
        grades2.add(5);
        grades2.add(5);
        grades2.add(5);
        grades2.add(5);
        students.add(0, new Student("Artur", "APT", 4, grades));
        students.add(1, new Student("Ivar", "RTY", 3, grades1));
        students.add(2, new Student("Alecsandra", "MMA", 4, grades2));
        students.add(1, new Student("Ivari", "RTY", 3, grades1));

        System.out.println(students);
        Student.printStudent(students, 4);
        //remove students bad grades
        for (int i = 0; i < students.size(); i++) {
            if (!students.get(i).transferCourse()) {
                students.remove(i);
                i--;
            }
        }
        System.out.println(students);
        System.out.println("-".repeat(70));
        Student.printStudent(students, 5);
    }
}
