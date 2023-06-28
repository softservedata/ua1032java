package com.softserve.Homework.hw_3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++) {
            persons[i] = new Person();
            persons[i].input(reader);
        }

        for (Person person : persons) {
            person.output();
        }
    }
}