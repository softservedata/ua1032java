package com.softserve.practical_tasks.pr06.task2;

import com.softserve.practical_tasks.pr06.task2.Car;

public class Sedan extends Car {
    private int numberOfPlaces;
    public Sedan(String model, double maxSpeed, int yearOfProduction, int numberOfPlaces) {
        super(model, maxSpeed, yearOfProduction);
        this.numberOfPlaces = numberOfPlaces;
    }

    @Override
    public String run(){
        return "Sedan runs";
    }

    @Override
    public String stop(){
        return "Sedan stops";
    }
}
