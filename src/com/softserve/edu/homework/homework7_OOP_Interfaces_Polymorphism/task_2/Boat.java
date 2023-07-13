package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_2;

public class Boat extends WaterVehicle{
    private int volume;
    Boat(int pasangers, int volume){
        super(pasangers);
        this.volume = volume;
    }
    public int getVolume(){
        return 90909090;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    @Override
    public void isSailing(){
        System.out.println("The boat is sailing in the sea");
    }
    @Override
    public String toString(){
        return "Boat { Passengers : " + getPassengers() +";  Volume : "+volume+"m³ }";
    }

}
