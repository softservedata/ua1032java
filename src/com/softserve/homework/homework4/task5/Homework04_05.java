package com.softserve.homework.homework4.task5;

public class Homework04_05 {
    // TODO: Create a class called Dog that has the following fields: name, breed, age.
    //      Declare enum for field breed.
    //      In main() method create create three instances of type Dog.
    //      Check if there are no two dogs with the same name;
    //      Output the name and the breed of the oldest dog.

    public static void main(String[] args) {
        Dog dog1 = new Dog("Mia", Breed.SHEPARD, 11);
        Dog dog2 = new Dog("Jack", Breed.BEAGLE, 5);
        //Dog dog3 = new Dog("Nick", Breed.BULLDOG, 8);
        Dog dog3 = new Dog("Mia", Breed.BULLDOG, 8);

        if(dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)){
            System.out.println("There are two dogs with the same name.");
        } else {
            System.out.println("There aren't any dogs with the same name.");
        }

        if(dog1.getAge() >= dog2.getAge() && dog1.getAge() >= dog3.getAge()){
            System.out.println(dog1);
        } else if (dog2.getAge() >= dog1.getAge() && dog2.getAge() >= dog3.getAge()){
            System.out.println(dog2);
        } else {
            System.out.println(dog3);
        }
    }
}
