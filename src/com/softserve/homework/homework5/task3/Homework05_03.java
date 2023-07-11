package com.softserve.homework.homework5.task3;

import java.util.Scanner;

public class Homework05_03 {
    // TODO: Create class called Car with fields: type, year of production and engine capacity.
    //      Create and initialize in main() method four instances of class Car.
    //      Output result for cars:
    //      certain model year (enter year in the console);
    //      sorted cars by the field “year of production ”.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car(CarType.MINIVAN, 2023, 3.0);
        Car car2 = new Car(CarType.CROSSOVER, 2011, 2.2);
        Car car3 = new Car(CarType.SUV, 2022, 5.0);
        Car car4 = new Car(CarType.HATCHBACK, 2012, 1.5);
        Car[] cars = {car1, car2, car3, car4};
        Parking parking = new Parking();
        parking.setCars(cars);
        int inputYear;

        System.out.print("Enter the year of a car: ");
        inputYear = sc.nextInt();

        if(parking.getCertainModel(inputYear) == null){
            System.out.println("There aren't any car with " + inputYear + " year.");
        }
        //
        parking.sortCarsByYear();

        System.out.println("\nList of cars sorted by the year of production:\n" + parking.toString());
    }
}
