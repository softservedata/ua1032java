package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_2;

public class Appl {
    public static void main(String[]args){
        Car[] cars = new Car[5];
        cars[0] = new Truck("Truck1",80,2010,5000);
        cars[1] = new Truck("Truck2", 100, 2020, 5000);
        cars[2] = new Sedan("Sedan1", 190, 2022, 4.8F);
        cars[3] = new Truck("Truck3", 90, 2018, 6000);
        cars[4] = new Sedan("Sedan2", 170, 2020, 5.6F);
        for (Car car : cars) {
            car.run();
            car.printInfo();
            car.stop();
            System.out.println();
        }
    }
}
