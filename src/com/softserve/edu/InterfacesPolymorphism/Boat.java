package com.softserve.edu.InterfacesPolymorphism;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int volume, int passengers) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("The boat is sailing");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
