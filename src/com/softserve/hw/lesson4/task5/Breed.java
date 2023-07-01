package com.softserve.hw.lesson4.task5;

public enum Breed {
    SHEEPDOG("Sheepdog"), HUSKY("Husky"), LABRADOR("Labrador"), BULLDOG("Bulldog");

    Breed(String breed) {
        this.breed = breed;
    }

    private String breed;
}
