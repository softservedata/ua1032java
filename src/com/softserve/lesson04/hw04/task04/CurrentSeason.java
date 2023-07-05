package com.softserve.lesson04.hw04.task04;

public enum CurrentSeason {
    AUTUMN("Autumn"), WINTER("Winter"), SPRING("Spring"), SUMMER("Summer");

    private final String name;

    CurrentSeason (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
