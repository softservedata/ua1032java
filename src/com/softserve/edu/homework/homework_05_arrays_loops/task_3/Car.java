package com.softserve.edu.homework.homework_05_arrays_loops.task_3;


public class Car {
    private String type;
    private int year_of_production;
    private double engine_capacity;
    public Car(String type, int year_of_production, double engine_capacity){
        this.type = type;
        this.year_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

    public int getYear_of_production(){
        return year_of_production;
    }
    @Override
    public String toString(){
        return "Machine type : " + type +";  Year of manufacture of the car  :  "+year_of_production+";  engine volume of the car  :  "+ engine_capacity;
    }
}
