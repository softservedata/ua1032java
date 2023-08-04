package com.softserve.edu01.hw8.task2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1);
        Student student2 = new Student(2);

        student1.info();
        System.out.println(student1.activity());

        student2.info();
        System.out.println(student2.activity());
    }
}
