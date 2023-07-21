package com.softserve.HomeWork.HW7.task2.Class;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }
    public Liner() {
        super();
    }
    @Override
    void isSailing() {
        System.out.println("No, this is not sailing");
    }
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
