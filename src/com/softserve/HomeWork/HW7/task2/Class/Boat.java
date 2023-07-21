package com.softserve.HomeWork.HW7.task2.Class;

public class Boat extends WaterVehicle {
    int volume;
    public Boat(int passengers,int volume) {
        super(passengers);
        this.volume = volume;
    }
    public Boat() {
        super();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Yes, this is sailing");
    }
}
