package com.softserve.java_homework.lesson03;

import java.util.HashSet;

public class Task05 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Zeus", Dog.Breed.GERMAN_SHEPHERD, 4);
        dogs[1] = new Dog("Amur", Dog.Breed.BULLDOG, 2);
        dogs[2] = new Dog("Lord", Dog.Breed.LABRADOR_RETRIEVER, 1);

        System.out.println("Are there two dogs with the same name: " + checkIfSameNames(dogs));
        System.out.println(getOldestDog(dogs));

    }

    public static boolean checkIfSameNames(Dog[] dogs) {
        HashSet<String> names = new HashSet<>();
        for (Dog dog : dogs) {
            String name = dog.getName();
            if (names.contains(name)) return true;
            names.add(name);
        }
        return false;
    }

    public static String getOldestDog(Dog[] dogs) {
        Dog oldestDog = dogs[0];
        for (Dog dog : dogs) {
            if (oldestDog.getAge() < dog.getAge()) oldestDog = dog;
        }
        return "Oldest dog: name = " + oldestDog.getName()
                + ", breed = " + oldestDog.getBreed().getNameOfBreed();
    }
}