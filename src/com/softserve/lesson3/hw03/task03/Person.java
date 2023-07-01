package com.softserve.lesson3.hw03.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = 0;
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
        int currentYear = Year.now().getValue();
        return currentYear-this.birthYear;
    }

    public void input() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first name: ");
        this.firstName = bufferedReader.readLine();
        System.out.println("Input last name: ");
        this.lastName = bufferedReader.readLine();
        System.out.println("Input birth year: ");
        this.birthYear = Integer.parseInt(bufferedReader.readLine());
    }

    public void output() {
        System.out.println("First name is " + this.firstName);
        System.out.println("Second name is " + this.lastName);
        System.out.println("Birth year is " + this.birthYear);
    }

    public void changeName (String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

}
