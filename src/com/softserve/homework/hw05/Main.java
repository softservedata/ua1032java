package com.softserve.homework.hw05;

import com.softserve.homework.hw03.task4.Season;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.softserve.homework.hw05.Breed.*;

/*
Create a class called Dog that has the following fields: name, breed, age.
Declare enum for field breed.
In main() method create three instances of type Dog.
Check if there are no two dogs with the same name;
Output the name and the breed of the oldest dog.
 */
public class Main {
    public static void main ( String[] args ) {

        Dog dog1 = new Dog("Chase", SHEEPDOG, 5);
        Dog dog2 = new Dog("Marshal", DALMATIAN, 8);
        Dog dog3 = new Dog("Roky", DOBERMAN, 4);

        if ( dog1.getName().equalsIgnoreCase(dog2.getName()) || dog2.getName().equalsIgnoreCase(dog3.getName())) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("There are no two dogs with the same name");
        }

        System.out.println("The oldest dog is:");

        if ( dog1.getAge( ) > dog2.getAge( ) ) {
            System.out.println( "Name: " + dog1.getName( ) );
            System.out.println( "Breed: " + dog1.getBreed( ) );

        } else if ( dog2.getAge( ) > dog3.getAge( ) ) {
            System.out.println( "Name: " + dog2.getName( ) );
            System.out.println( "Breed: " + dog2.getBreed( ) );
        } else {
            System.out.println( "Name: " + dog3.getName( ) );
            System.out.println( "Breed: " + dog3.getBreed( ) );
        }

    }
}