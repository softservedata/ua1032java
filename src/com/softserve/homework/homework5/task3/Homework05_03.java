package com.softserve.homework.homework5.task3;

import java.util.Scanner;

public class Homework05_03 {
    // TODO: Create class called Car with fields: type, year of production and engine capacity.
    //      Create and initialize in main() method four instances of class Car.
    //      Output result for cars:
    //      certain model year (enter year in the console);
    //      sorted cars by the field “year of production ”.

    public static Car findCertainModel(int inputYear, Car[] cars){
        Car temp = null;

        for (Car car : cars) {
            if (car.getYear() == inputYear) {
                System.out.println(car);
                temp = car;
            }
        }

        return temp;
    }

    public static void sortCarsByYear(Car[] cars){
        Car temp;

        for(int i = 0; i < cars.length - 1; i++){
            for(int j = i + 1; j < cars.length; j++){
                if (cars[i].getYear() < cars[j].getYear()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car(CarType.MINIVAN, 2023, 3.0);
        Car car2 = new Car(CarType.CROSSOVER, 2011, 2.2);
        Car car3 = new Car(CarType.SUV, 2022, 5.0);
        Car car4 = new Car(CarType.HATCHBACK, 2012, 1.5);
        Car[] cars = {car1, car2, car3, car4};
        int inputYear;

        System.out.print("Enter the year of a car: ");
        inputYear = sc.nextInt();

        if(findCertainModel(inputYear, cars) == null){
            System.out.println("There aren't any car with " + inputYear + " year.");
        }
        //
        sortCarsByYear(cars);

        System.out.println("\nList of cars sorted by the year of production:");
        for(Car car: cars){
            System.out.println(car);
        }
    }
}
