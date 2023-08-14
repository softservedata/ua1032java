package com.softserve.edu.InterfacesPolymorphism;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int floors, int passengers) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("The liner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
