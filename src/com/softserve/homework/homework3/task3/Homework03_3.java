package com.softserve.homework.homework3.task3;

import java.io.IOException;

public class Homework03_3 {
    /*
        TODO: Create Console Application and add class called Person to the project. Class Person should consist of:
            three private fields: firstName, lastName and birthYear (the birthday year);
            properties for access to these fields;
            default constructor and constructor with 2 parameters (first and last names);
            Methods:
            getAge() - to calculate the age of a person;
            input() - to input information about the person;
            output() - to output information about the person;
            changeName(String fn, String ln) - to change the first name or/and last name.
            In the main() method create 5 objects of Person type and input information about them to console.
     */

    public static void main(String[] args) throws IOException {
        Person p1 = new Person();
        Person p2 = new Person("Taras", "Shevchenko");
        Person p3 = new Person("Volodymyr", "Velykyi");
        Person p4 = new Person("Maksym", "Petukhov");
        Person p5 = new Person();

        p5.input();
        p1.changeName("Ilya", "Dubai");

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();
    }
}
