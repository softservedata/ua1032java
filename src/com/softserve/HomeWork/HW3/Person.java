package com.softserve.HomeWork.HW3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Person {
    private String firstName = "noName";
    private String lastName = "noLastName";
    private int birthYear = 2023;

    Person() throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("First name: ");
        firstName = br.readLine();

        System.out.print("LastName: ");
        lastName = br.readLine();

        System.out.print("Year: ");
        birthYear = Integer.parseInt(br.readLine());
    }
    Person(String firstName, String lastName, int birthYear ){
        this.lastName =lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge(){
        return 2023-birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + getAge() +
                ", birthYear=" + birthYear +

                '}';
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
}
