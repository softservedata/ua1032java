package com.softserve.edu.homework.homework07_OOP_Interfaces_Polymorphism.task_2;

public abstract class Passengers{
    private int passengers ;
    Passengers(int passengers){
        this.passengers = passengers;
    }
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

