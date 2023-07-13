package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_2;

public class Bus extends GroundVehicle {
    String route;
    Bus(int pasangers, String route){
        super(pasangers);
        this.route = route;
    }
    public String getRoute(){
        return route;
    }
    public void setRoute(){
        this.route = route;
    }
    @Override
    public void drive(){
        System.out.println("I ride on the ground for long distances. ");
    }
    @Override
    public String toString(){
        return "Bus { Passengers : "+getPassengers() +";  Route : " + route + " }";
    }
}
