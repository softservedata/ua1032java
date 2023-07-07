package com.softserve.practical_tasks.pr06.task2;

public abstract class Car {
    private String model;
    private double maxSpeed;
    private int yearOfProduction;

    public Car(String model, double maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String run(){
        return "Car runs";
    }

    public String stop(){
        return "Car stops";
    }

    @Override
    public String toString() {
        return "Car" +
                "model=" + model + "\n" +
                "maxSpeed=" + maxSpeed +"\n"+
                "yearOfProduction=" + yearOfProduction +"\n";
    }
}
