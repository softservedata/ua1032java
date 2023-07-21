package com.softserve.edu.homework.homework07_OOP_Interfaces_Polymorphism.task_2;
public class Appl {
    public static void main (String []args){
        Vehicle[] vehicles = new  Vehicle[7];

        vehicles[0] = new Bus(40, "Poland -> Germany");
        vehicles[1] = new Motorcycle(2, 240);
        vehicles[2] = new Car(5, "BMW");

        vehicles[3] = new Liner(1000, 8);
        vehicles[4] = new Boat(40, 10);

        vehicles[5] = new Plane(180, 11000);
        vehicles[6] = new Helicopter(8, 5100, 6000);

       for (int i = 0; i < vehicles.length ; i++){
           System.out.println(vehicles[i]);
       }
    }
}
