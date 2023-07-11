package com.softserve.java_homework.lesson03;

import java.time.LocalDate;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Person(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - getBirthYear();
    }

    public void input(Scanner scanner) {
        System.out.print("Enter the first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter the last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Enter the year of birth: ");
        this.birthYear = scanner.nextInt();
        scanner.nextLine();
    }

    public void output() {
        System.out.println(toString());
    }

    public void changeName(String fn, String ln) {
        if (fn != null) this.firstName = fn;
        if (ln != null) this.lastName = ln;
    }

    @Override
    public String toString() {
        return "\nPerson { first name = "
                + getFirstName() + ", last name = "
                + getLastName() + ", birth year = "
                + getBirthYear() + ", age = "
                + getAge() + " }";
    }
}
