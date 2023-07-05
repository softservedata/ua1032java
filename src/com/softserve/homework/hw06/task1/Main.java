package com.softserve.homework.hw06.task1;
/*
Task 1
Create abstract class called Bird  by scheme with attributes feathers and layEggs and an abstaract fly() method.  
Create classes FlyingBird and NonFlyingBird.
Create classes Eagle, Swallow, Penguin and Kiwi.
In main() method create an array Bird and add different birds to it.
Call fly() method for all of it. Output the information about each type of created bird.
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