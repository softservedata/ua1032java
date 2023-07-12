package com.softserve.homework.hw07.task2.water_vehicle;

public class Boat extends WaterVehicle {

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
        super.isSailing();
        System.out.println("Boat is sailing");
    }

    @Override
    public String toString() {
        return "Boat : volume=" + volume + super.toString();
    }
}
