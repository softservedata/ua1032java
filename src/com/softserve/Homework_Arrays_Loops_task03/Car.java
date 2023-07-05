package com.softserve.Homework_Arrays_Loops_task03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
 class Car {
     private String type;
     private int yearOfProduction;
     private double engineCapacity;

     public Car(String type, int yearOfProduction, double engineCapacity) {
         this.type = type;
         this.yearOfProduction = yearOfProduction;
         this.engineCapacity = engineCapacity;
     }

     public String getType() {
         return type;
     }

     public int getYearOfProduction() {
         return yearOfProduction;
     }

     public double getEngineCapacity() {
         return engineCapacity;
     }

     @Override
     public String toString() {
         return "Type: " + type + ", Year of Production: " + yearOfProduction + ", Engine Capacity: " + engineCapacity;
     }
 }

public class CarManagement {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Create and initialize four Car objects
        cars.add(new Car("Sedan", 2015, 1.6));
        cars.add(new Car("SUV", 2019, 2.0));
        cars.add(new Car("Hatchback", 2012, 1.4));
        cars.add(new Car("Sports", 2018, 3.0));

        // Output cars of a certain model year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of production to filter cars: ");
        int year = scanner.nextInt();
        System.out.println("Cars of the year " + year + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car);
            }
        }

        // Sort cars by the field "year of production"
        Collections.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));
        System.out.println("Cars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
