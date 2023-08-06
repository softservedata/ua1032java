package com.softserve.edu;

import com.softserve.edu03oop.Student;

public class Appl {

    public static void main(String[] args) {
        System.out.println("Hello");
        Student st1 = new Student("Ivan", "Ivanov", 20);
        System.out.println("stud1: firstname = " + st1.getFirstname()
                + "  lastname = " + st1.getLasttname()
                + "  age = " + st1.getAge());

    }

}
