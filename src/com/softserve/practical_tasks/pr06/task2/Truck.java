package com.softserve.practical_tasks.pr06.task2;

public class Truck extends Car{
    private boolean hasSleepPlace;
    public Truck(String model, double maxSpeed, int yearOfProduction, boolean hasSleepPlace) {
        super(model, maxSpeed, yearOfProduction);
        this.hasSleepPlace = hasSleepPlace;
    }

    @Override
    public String run(){
        return "Truck runs";
    }

    @Override
    public String stop(){
        return "Truck stops";
    }
}
