package com.softserve.homework.hw05;

public enum Breed {
    SHEEPDOG ("Sheep Dog"),
    HUSKY ("Husky"),
    DOBERMAN ("Doberman"),
    DALMATIAN ("Dolmatian");

    private final String name;

    Breed ( String name ) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return name;
    }
}
