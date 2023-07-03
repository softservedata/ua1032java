package com.softserve.Homework.hw_4.Task5;
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", Breed.GOLDEN_RETRIEVER, 5);
        Dog dog2 = new Dog("Bella", Breed.LABRADOR_RETRIEVER, 7);
        Dog dog3 = new Dog("Charlie", Breed.GERMAN_SHEPHERD, 6);

        if (!dog1.getName().equals(dog2.getName()) && !dog1.getName().equals(dog3.getName()) && !dog2.getName().equals(dog3.getName())) {
            System.out.println("There are no two dogs with the same name");
        } else {
            System.out.println("There are two dogs with the same name");
        }
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("The oldest dog is " + oldestDog.getName() + " and its breed is " + oldestDog.getBreed().getName());
    }
}