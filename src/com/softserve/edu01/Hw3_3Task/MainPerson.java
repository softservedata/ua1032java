package com.softserve.edu01.Hw3_3Task;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("John", "Doe");
        person1.input();

        Person person2 = new Person("Jane", "Smith");
        person2.input();

        System.out.println("\nInformation about the people:");
        person1.output();
        person2.output();

        scanner.close();
    }
}

