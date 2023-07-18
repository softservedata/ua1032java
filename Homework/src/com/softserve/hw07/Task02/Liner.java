package com.softserve.hw07.Task02;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int floors, int passengers) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
