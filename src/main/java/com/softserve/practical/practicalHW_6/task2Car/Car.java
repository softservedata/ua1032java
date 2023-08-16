package com.softserve.practical.practicalHW_6.task2Car;

public abstract class Car {
     String model;
     int maxSpeed;
     int earsOfProduction;
     public void run(){
         System.out.println("Run car");
     }
     public void stop(){
         System.out.println("Stop car");
     }
}
