package com.softserve.lesson04.hw04.task05;

public enum Breed {
    LABRADOR("Labrador Retriever"), BEAGLE("Beagle"), SHEPHERD("German Shepherd"),
    BERNESE("Bernese Mountain Dog"), BULLDOG("Bulldog"),  DACHSHUND("Dachshund");

    private final String name;
    Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
