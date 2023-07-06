package com.softserve.java_homework.lesson02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[5];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].input(scanner);
        }
        scanner.close();

        for (Person person : persons) {
            person.output();
        }
    }
}