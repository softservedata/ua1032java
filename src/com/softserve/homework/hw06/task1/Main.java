package com.softserve.homework.hw06.task1;
/*
Task 1
Create abstract class called Bird  by scheme with attributes feathers and layEggs and an abstaract fly() method.  
Create classes FlyingBird and NonFlyingBird.
Create classes Eagle, Swallow, Penguin and Kiwi.
In main() method create an array Bird and add different birds to it.
Call fly() method for all of it. Output the information about each type of created bird.

Створіть абстрактний клас під назвою Bird за схемою з атрибутами feathers і layEggs і методом abstaract fly().
Створіть класи FlyingBird і NonFlyingBird.
Створіть класи Орел, Ластівка, Пінгвін і Ківі.
У методі main() створіть масив Bird і додайте до нього різних птахів.
Викличте метод fly() для всього цього. Виведіть інформацію про кожен вид створеного птаха.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        Bird[] arrayOfBird = new Bird[4];
        arrayOfBird[0] = new Kiwi();
        arrayOfBird[1] = new Eagle();
        arrayOfBird[2] = new Penguin();
        arrayOfBird[3] = new Swallow();

        for (int i = 0; i < arrayOfBird.length; i++) {
            System.out.println( arrayOfBird[i]);
        }
    }
}