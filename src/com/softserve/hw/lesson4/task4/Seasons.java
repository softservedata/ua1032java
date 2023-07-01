package com.softserve.hw.lesson4.task4;

public enum Seasons {
    SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn"), WINTER("Winter");

    Seasons(String nameSeason) {
        this.nameSeason = nameSeason;
    }

    private String nameSeason;

    @Override
    public String toString() {
        return " " + nameSeason;
    }

}
