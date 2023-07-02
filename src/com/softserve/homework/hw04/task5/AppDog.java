package com.softserve.homework.hw04.task5;

import java.util.Scanner;

public class AppDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog[] dogs = new Dog[2];

        //input information for 3 dogs from console
        for (int i=0; i < dogs.length; i++){
            System.out.println("Input information for the dog " + (i+1));
            dogs[i]= Dog.inputDog();
        }

        //output information about dogs
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].toString(i));
        }

        //Check if there are no two dogs with the same name
        System.out.println("If there are dogs wit the same name? : "+ Dog.hasDogsSameName(dogs));

        //find oldest dog and output name and breed
        System.out.println("Oldest dog: ");
        System.out.println(Dog.findOldestDog(dogs).toString());
    }
}
