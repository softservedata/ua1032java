package com.softserve.edu.homework.homework2_oop_introduction.task3;

import java.util.Scanner;

public class Person {

    private String name;
    private String surname;
    private int year;

    public Person() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name =");
        this.name = input.nextLine();

        System.out.println("Surname =");
        this.surname = input.nextLine();

        System.out.println("The birthday year =");
        this.year = input.nextInt();
    }

    public String toString() {
        return "Person { " + " name = " + name + ", surname = " + surname + ",  year = " + year + ",  Age = " + getAge() + "}";
    }

    public int getAge() {
        return (2023 - year);
    }

    public Person(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSurname(int year) {
        this.year = year;
    }
}
