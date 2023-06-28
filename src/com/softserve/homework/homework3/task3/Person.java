package com.softserve.homework.homework3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = "none";
        lastName = "none";
        birthYear = 0;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getAge(){
        return Year.now().getValue() - birthYear;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first name: ");
        firstName = br.readLine();
        System.out.print("Enter last name: ");
        lastName = br.readLine();
        System.out.print("Enter birth year: ");
        birthYear = Integer.parseInt(br.readLine());
        System.out.print("\n");
    }

    public void output(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Birth year: " + getBirthYear());
        System.out.println("Age: " + getAge() + "\n");
    }

    public void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }
}
