package com.softserve.homework.hw07.task2.water_vehicle;

public class Liner extends  WaterVehicle{

    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        super.isSailing();
        System.out.println("Liner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Liner: floors=" + floors +  super.toString();
    }
}
