package com.softserve.homework.homework5.task3;

public enum CarType {
    SUV("Suv"),
    COUPE("Coupe"),
    HATCHBACK("Hatchback"),
    WAGON("Station Wagon"),
    MINIVAN("Minivan"),
    SEDAN("Sedan"),
    CROSSOVER("Crossover"),
    SPORTS("Sports");

    private final String carType;

    CarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }
}
