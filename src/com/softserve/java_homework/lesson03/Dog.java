package com.softserve.java_homework.lesson03;

public class Dog {
    enum Breed {
        BULLDOG("Bulldog"),
        DALMATIAN("Dalmatian"),
        GERMAN_SHEPHERD("German Shepherd"),
        BEAGLE("Beagle"),
        LABRADOR_RETRIEVER("Labrador Retriever"),
        SIBERIAN_HUSKY("Siberian Husky");

        private final String nameOfBreed;

        Breed(String nameOfBreed) {
            this.nameOfBreed = nameOfBreed;
        }

        public String getNameOfBreed() {
            return nameOfBreed;
        }
    }

    Breed breed;
    private String name;
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

    @Override
    public String toString() {
        return "Dog { name = " + getName()
                + ", breed = " + getBreed().getNameOfBreed()
                + ", age = " + getAge();
    }
}