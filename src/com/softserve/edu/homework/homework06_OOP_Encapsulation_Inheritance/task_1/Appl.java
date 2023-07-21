package com.softserve.edu.homework.homework06_OOP_Encapsulation_Inheritance.task_1;

public class Appl {
    public static void main (String [] args){
        Eagle eagle = new Eagle("brown ", true);
        Swallow swallow = new Swallow("dark blue with white", true);
        Penguin penguin = new Penguin("black and white ", true);
        Kiwi kiwi = new Kiwi("brown ", true);

        System.out.println("Hi, I'm Eagle : " + "\nMy feathers are " + eagle.feathers);
        eagle.fly();
        eagle.flight_speed();

        System.out.println("\nHi, I'm Swallow : " + "\nMy feathers are " + swallow.feathers);
        swallow.fly();
        swallow.flight_speed();

        System.out.println("\nHi, I'm Penguin : " + "\nMy feathers are " + penguin.feathers);
        penguin.fly();
        penguin.swimming_speed();

        System.out.println("\nHi, I'm Kiwi : "+ "\nMy feathers are " + kiwi.feathers);
        kiwi.fly();
        kiwi.Lifetime();
    }
}
