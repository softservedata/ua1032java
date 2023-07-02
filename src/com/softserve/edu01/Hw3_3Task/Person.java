package com.softserve.edu01.Hw3_3Task;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private int yearBirthday;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - yearBirthday;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birth Year: ");
        yearBirthday = scanner.nextInt();

        scanner.nextLine(); // Consume the remaining newline character

        System.out.println();
    }

    public void output() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Birth Year: " + yearBirthday);
        System.out.println("Age: " + getAge());
        System.out.println();
    }

    public void changeName(String fn, String ln) {
        name = fn;
        surname = ln;
    }
}

