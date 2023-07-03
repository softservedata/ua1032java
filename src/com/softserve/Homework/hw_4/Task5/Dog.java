package com.softserve.Homework.hw_4.Task5;

enum Breed {
    GOLDEN_RETRIEVER("Golden Retriever"),
    LABRADOR_RETRIEVER("Labrador Retriever"),
    GERMAN_SHEPHERD("German Shepherd");

    private final String name;
    Breed(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Dog {
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

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}