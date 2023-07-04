package com.softserve.homework.hw03.task3;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    //Default Constructors:
    public Person() {
    }

    //Constructor with 2 parameters (first and last names)
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Properties for access to these fields - Getters & Setters:
    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public int getBirthYear () {
        return birthYear;
    }

    public void setBirthYear ( int birthYear ) {
        this.birthYear = birthYear;
    }

    //Method: to calculate the age of a person
    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    //Method: input() - to input information about the person;
    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    //Method: output() - to output information about the person;
    public void output() {
        System.out.println("Firstname: " + firstName + "\nLastname: " + lastName + "\nThe birthday year: " + birthYear + "\n");
    }

    //Method: changeName(String fn, String ln) - to change the first name or/and last name.
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}