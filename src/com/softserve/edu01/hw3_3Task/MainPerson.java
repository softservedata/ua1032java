package com.softserve.edu01.hw3_3Task;

public class MainPerson {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + ":");
            Person person = new Person();
            person.input();
            people[i] = person;
            System.out.println();
        }

        System.out.println("Information about people:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}
