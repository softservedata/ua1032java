package com.softserve.hw.lesson8;

import com.softserve.hw.lesson8.task1.FullName;
import com.softserve.hw.lesson8.task1.Student;

public class mainLesson8 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Arthur","Mitasov"),20,4);
        System.out.println(student1.activity());
        System.out.println(student1.info());
        Student student2 = (Student) student1.clone();
        System.out.println("These clone");
        System.out.println(student2.activity());
        System.out.println(student2.info());

        student1.setCurse(5);

        System.out.println("Update");
        System.out.println(student1.activity());
        System.out.println(student1.info());
        System.out.println("These clone");
        System.out.println(student2.activity());
        System.out.println(student2.info());
    }
}
