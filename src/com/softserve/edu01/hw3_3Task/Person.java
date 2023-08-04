package com.softserve.edu01.hw3_3Task;

import com.softserve.edu01.hw8.task1.FullName;

import java.util.Scanner;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(FullName fullName, int age) {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        lastName = scanner.nextLine();
        System.out.println("Enter your birth year");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Your first name: " + firstName);
        System.out.println("Your last name: " + lastName);
        System.out.println("Your birth year: " + birthYear);
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            firstName = fn;
        }

        if (ln != null && !ln.isEmpty()) {
            lastName = ln;
        }
    }

    public int info() {
        return 0;
    }

    public abstract String activity();
}

