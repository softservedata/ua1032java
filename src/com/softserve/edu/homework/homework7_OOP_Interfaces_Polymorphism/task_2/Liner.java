package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_2;

public class Liner extends WaterVehicle{
    private int floors;
    Liner(int padangers, int floors){
        super(padangers);
        this.floors =floors;
    }
    @Override
    public void isSailing(){
        super.isSailing();
        System.out.println("The liner is sailing in the ocean");
    }
    public int getFloors(){
        return floors;
    }
    public void setFloors(int floors){
        this.floors = floors;
    }
    @Override
    public String toString() {
        return "Liner { Passengers : " + getPassengers() +";  Floors : " +floors+" }";
    }
}
