package com.softserve.java_homework.lesson07.vehicle;

public class Boat extends WatterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Engine started. " + getClass().getSimpleName() + " is sailing.");
    }
}
