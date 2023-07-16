package com.softserve.java_homework.lesson05;

public class Car {
    enum Type {
        MINIVAN("minivan"),
        SEDAN("sedan"),
        COUPE("coupe"),
        CROSSOVER("crossover");

        private final String carType;

        Type(String carType) {
            this.carType = carType;
        }

        public String getCarType() {
            return carType;
        }
    }

    private Type type;
    private int yearOfProduction;
    private double engineCapacity;

    Car(Type type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public Type getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car {type = " + getType().getCarType()
                + ", year of production = " + getYearOfProduction()
                + ", engine capacity = " + getEngineCapacity()
                + "}";
    }
}