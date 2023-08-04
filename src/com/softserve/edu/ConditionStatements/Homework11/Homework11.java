package com.softserve.edu.ConditionStatements.Homework11;

import java.util.Scanner;

public class Homework11 {

    public static void findOldestDog (Dog[] dog) {

        if((dog[0].getAge() > dog[1].getAge()) && (dog[0].getAge() > dog[2].getAge())) {
            System.out.println(dog[0]);
        }
        else if((dog[1].getAge() > dog[0].getAge()) && (dog[1].getAge() > dog[2].getAge())) {
            System.out.println(dog[1]);
        }
        else if((dog[2].getAge() > dog[0].getAge()) && (dog[2].getAge() > dog[1].getAge())) {
            System.out.println(dog[2]);
        }
    }
    public static Dog[] inputValues(int num_obj) {
        Scanner scan = new Scanner(System.in);
        String name;
        Breeds breed;
        Dog dog[];
        int age;

        dog = new Dog[num_obj]; //create a variable with given number to create an array

        for(int i = 0; i < dog.length; i++) {
            System.out.print("Write dog's name: ");
            name = scan.nextLine();

            if(name == "") {
                name = null;
            }

            System.out.print("Write dog's breed: ");

            try
            {
                breed = Breeds.valueOf(scan.nextLine().toUpperCase());
            }catch (IllegalArgumentException a) {
                System.out.println(a.getMessage() + " try one more: ");
                breed = Breeds.valueOf(scan.nextLine().toUpperCase());
            }

            System.out.print("Write dog's age: ");

            age = scan.nextInt();
            scan.nextLine();
            dog[i] = new Dog(name, breed, age);
        }
        scan.close();
        return dog;
    }
    public static void main(String[] args) {
        int num_obj;
        Dog[] dog;
        Dog oldestDog;
        boolean bool = false;
        num_obj = 3;


        dog = inputValues(num_obj);
        for(int i = 0; i < dog.length; i++) {
            for(int j = 0; j < dog.length; j++) {
                if (i == j){
                    continue;
                }
                if(dog[i].equals(dog[j])) {
                    System.out.println("There are two dogs with the same name");
                    bool = true;
                    break;
                }
            }
            if(bool) {
                break;
            }
        }

        findOldestDog(dog); // outputs name, breed and age of the oldest dog

    }
}
