package com.softserve.HomeWork.HW10.task3;

import java.util.*;

public class HW_task3 {
    public static void printStudents(List<Student> list, int course) {
        // Iterator<Student> iterator = list.listIterator();
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student element = iterator.next();
            if (course == element.getCourse()) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Taras", 1));
        list.add(new Student("Rostyslav", 1));
        list.add(new Student("Lev", 2));
        list.add(new Student("Maria", 2));
        list.add(new Student("Sasha", 1));
        list.add(new Student("Tom", 2));
        list.add(new Student("Peter", 2));
        list.add(new Student("Barry", 3));
        list.add(new Student("Barry", 2));
        printStudents(list, 3);

        System.out.println("===================================");
        Collections.sort(list);
        System.out.println(list);
    }
}
