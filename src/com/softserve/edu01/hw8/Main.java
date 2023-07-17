package com.softserve.edu01.hw8;

import com.softserve.edu01.hw3_3Task.Person;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("John", "Doe");
        int age = 30;

        Person person = new Person(fullName, age) {
            public String activity() {
                return "Doing something";
            }
        };

        System.out.println(person.info());
        System.out.println();
    }
}