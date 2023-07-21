package com.softserve.Homework.hw_7.task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {}

    @Override
    public void isSailing() {
        System.out.println("\tBoat is sailing");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
