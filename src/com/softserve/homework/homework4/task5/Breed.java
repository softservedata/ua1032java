package com.softserve.homework.homework4.task5;

public enum Breed {
    BEAGLE("Beagle"),
    SHEPARD("Shepard"),
    BULLDOG("Bulldog"),
    LABRADOR("Labrador"),
    HOUND("Hound");

    private final String breedName;

    Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }
}
