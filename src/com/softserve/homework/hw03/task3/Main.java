package com.softserve.homework.hw03.task3;

/*
3*. Create Console Application  and add class called Person to the project. Class Person should consist of:
        three private fields: firstName, lastName and birthYear (the birthday year);
        properties for access to these fields;
        default constructor and constructor with 2 parameters (first and last names);
            Methods:
            (**) getAge() - to calculate the age of a person;
            input() - to input information about the person;
            output() - to output information about the person;
            changeName(String fn, String ln) - to change the first name or/and last name.
In the main() method create 5 objects of Person type and input information about them to console.
 */
public class Main {
    public static void main ( String[] args ) {
            Person taras = new Person();
            taras.input("Taras", "Shevchenko", 1814);

            Person ivan = new Person();
            ivan.input("Ivan", "Franko", 1856);

            Person lesya = new Person();
            lesya.input("Lesya", "Ukrainka", 1871);

            Person panas = new Person();
            panas.input("Panas", "Mirnyi", 1849);

            Person lina = new Person();
            lina.input("Lina", "Kostenko", 1930);

            taras.output();
            ivan.output();
            lesya.output();
            panas.output();
            lina.output();
    }
}
