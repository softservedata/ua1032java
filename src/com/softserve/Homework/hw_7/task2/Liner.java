package com.softserve.Homework.hw_7.task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {}

    @Override
    public void isSailing() {
        System.out.print("\tLiner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

