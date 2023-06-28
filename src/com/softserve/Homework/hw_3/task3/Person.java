package com.softserve.Homework.hw_3.task3;
import java.io.BufferedReader;
import java.io.IOException;


class Person {
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

    public int getAge() {
        return 2023 - birthYear;
    }

    public void input(BufferedReader reader) throws IOException {
        System.out.println("Enter first name: ");
        firstName = reader.readLine();

        System.out.println("Enter last name: ");
        lastName = reader.readLine();

        System.out.println("Enter birth year: ");
        birthYear = Integer.parseInt(reader.readLine());
    }

    public void output() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }
    public void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

}