package com.softserve.practical.practical12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practical12_02 {
    // TODO: To complete the given task, it is required to create a class named Plant which includes the following fields:
    //      int size, Color color (an Enum), Type type (an Enum)
    //      A constructor must be created to initialize these fields. The toString() method should be overridden to provide a
    //      string representation of the Plant object. Two separate classes named ColorException and TypeException should be
    //      created to describe all possible colors and types of plants respectively. In the main() method, an array of five plants
    //      should be created, and it should be ensured that the exception handling is working correctly for invalid color and type
    //      values.
    //      **Add a method that will verify whether the size of the plant is correct and throw an exception if it is too small or too
    //      large.
    //      **Add a method that will verify whether the color and type are both valid and throw an exception if invalid
    //      parameters are entered.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plant[] plants = new Plant[5];

        for(int i = 0; i < 5; i++){
            try {
                int size;
                String color;
                String type;

                System.out.println("\n[" + i + "]");
                System.out.print("\tEnter the size of the plant: ");
                size = sc.nextInt();
                System.out.print("\tEnter the color of the plant: ");
                color = sc.next();
                System.out.print("\tEnter the type of the plant: ");
                type = sc.next();

                plants[i] = new Plant(size, color, type);
            } catch (InputMismatchException e) {
                System.err.println("Invalid value, try again!");
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }

        System.out.println("Plants: ");
        for(Plant plant: plants){
            System.out.println(plant);
        }

        sc.close();
    }
}
