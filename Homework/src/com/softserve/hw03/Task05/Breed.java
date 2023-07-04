package com.softserve.hw03.Task05;

public enum Breed {
    BULLDOG("Bulldog"),
    HUSKY("Husky"),
    BEAGLE("Beagle");
    private String breed;
    private Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return breed;
    }
}
