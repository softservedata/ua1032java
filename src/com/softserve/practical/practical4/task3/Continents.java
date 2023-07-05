package com.softserve.practical.practical4.task3;

public enum Continents {
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    EUROPE("Europe"),
    AFRICA("Africa"),
    ASIA("Asia"),
    OCEANIA("Oceania");

    public final String continentName;

    Continents(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
}
