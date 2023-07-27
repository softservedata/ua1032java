package com.softserve.HomeWork.HW9.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW_task2 {
    public static void nextCourse(List<Student> list) {
        for (Student s : list) {
            if (s.getAverage() >= 3.0) {
                s.setCourse(s.getCourse() + 1);
                s.clearGrades();
            }
        }
    }

    public static void printStudents(List<Student> list, int course){
        for (Student s: list){
            if (s.getCourse() == course){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Oleg", 1, 1, List.of(1, 2, 3, 4, 5, 2, 4)));
        list.add(new Student("Sasha", 2, 3, List.of(5, 2, 3, 4, 5, 2, 2)));
        list.add(new Student("Maria", 3, 1, List.of(2, 2, 2, 3, 3, 3, 3)));
        list.add(new Student("Anastasia", 3, 1, List.of(5, 5, 1, 2, 3, 3, 3)));

        System.out.println(list);
//        nextCourse(list);
//        System.out.println(list);
        printStudents(list, 1);
    }
}
