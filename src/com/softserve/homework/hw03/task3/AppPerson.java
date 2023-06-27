package com.softserve.homework.hw03.task3;

public class AppPerson {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        //input 5 persons
        for(int i=0; i<1; i++) {
            System.out.println("PERSON [ " + (i+1) + " ]: ");
            person[i] = new Person();
            person[i].input(person[i]);
        }
        //output 5 persons
        System.out.println("5 PERSONS");
        for (int i = 0; i < 1 ; i++) {
            System.out.println("PERSON [ " + (i+1) + " ]: ");
            person[i].output();
        }
        //change first name in person1
        person[0].changeName("nameF", "nameF");
        System.out.println(person[0]);

        //change last name in person1
        person[0].changeName("nameL", "nameL");
        System.out.println(person[0]);

        //change name and last name in person1
        person[0].changeName("nameFL", "nameFL");
        System.out.println(person[0]);
    }
}
