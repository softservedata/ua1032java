package com.softserve.Homework_condstate;
import java.util.ArrayList;
import java.util.List;

public class Dog {
    enum Breed {
        LABRADOR,
        GOLDEN_RETRIEVER,
        GERMAN_SHEPHERD,
        BULLDOG,
        BEAGLE
    }

    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        // Create three instances of type Dog
        Dog dog1 = new Dog("Buddy", Breed.LABRADOR, 5);
        Dog dog2 = new Dog("Max", Breed.GOLDEN_RETRIEVER, 3);
        Dog dog3 = new Dog("Charlie", Breed.GERMAN_SHEPHERD, 7);

        // Add the dogs to the list
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        // Check if there are no two dogs with the same name
        boolean hasUniqueNames = checkUniqueNames(dogs);

        if (hasUniqueNames) {
            // Find the oldest dog
            Dog oldestDog = findOldestDog(dogs);

            // Output the name and breed of the oldest dog
            System.out.println("Oldest Dog: " + oldestDog.getName());
            System.out.println("Breed: " + oldestDog.getBreed());
        } else {
            System.out.println("There are two dogs with the same name.");
        }
    }

    public static boolean checkUniqueNames(List<Dog> dogs) {
        List<String> names = new ArrayList<>();

        for (Dog dog : dogs) {
            if (names.contains(dog.getName())) {
                return false;
            } else {
                names.add(dog.getName());
            }
        }

        return true;
    }

    public static Dog findOldestDog(List<Dog> dogs) {
        Dog oldestDog = dogs.get(0);

        for (Dog dog : dogs) {
            if (dog.getAge() > oldestDog.getAge()) {
                oldestDog = dog;
            }
        }

        return oldestDog;
    }
}