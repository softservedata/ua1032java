package com.softserve.edu01.Hw3_3Task;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
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

}

