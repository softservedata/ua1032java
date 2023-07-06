package com.softserve.homework.hw05.task3;

import java.time.Year;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Car {
    private TypeOfCars type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(TypeOfCars type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public static Car inputCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Input car ----");

        // Car type
        TypeOfCars carType;
        do {
            System.out.print("Type: ");
            String type = sc.nextLine().toUpperCase();
            try {
                carType = TypeOfCars.valueOf(type);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid car type. Input again");
            }
        } while (true);

        // Year
        int year;
        int currentYear = Year.now().getValue();
        do {
            try {
                System.out.print("Year of production: ");
                String yearStr = sc.nextLine();
                year = Integer.parseInt(yearStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid year format. Input again.");
                year = 0;
            }
        } while (year <= 1800 || year > currentYear);

        // Engine capacity
        double engineCapacity = 0;
        do {
            System.out.print("Engine capacity: ");
            engineCapacity = sc.nextDouble();
            if (engineCapacity > 0) {
                break;
            } else {
                System.out.println("Invalid engine capacity. Input again.");
            }
        } while (true);

        sc.nextLine();

        return new Car(carType, year, engineCapacity);
    }
    public static Car[] findModelByYear(Car[] cars, int year) {
        int count = 0;
        for (Car car : cars) {
            if (car != null && car.getYearOfProduction() == year) {
                count++;
            }
        }

        Car[] foundCars = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car != null && car.getYearOfProduction() == year) {
                foundCars[index] = car;
                index++;
            }
        }
        return foundCars;
    }
    public static Car[] sortCarsByYear(Car[] cars) {
        if (cars.length > 0) {
            Car[] sortedCars = Arrays.copyOf(cars, cars.length);
            boolean isSorted = false;

            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < sortedCars.length - 1; i++) {
                    if (sortedCars[i].getYearOfProduction() > sortedCars[i + 1].getYearOfProduction()) {
                        Car temp = sortedCars[i];
                        sortedCars[i] = sortedCars[i + 1];
                        sortedCars[i + 1] = temp;
                        isSorted = false;
                    }
                }
            }
            return sortedCars;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Car \n" +
                "  type: " + type + "\n" +
                "  year of production = " + yearOfProduction + "\n"+
                "  engineCapacity = " + engineCapacity + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getYearOfProduction() == car.getYearOfProduction() && Double.compare(car.engineCapacity, engineCapacity) == 0 && type == car.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, getYearOfProduction(), engineCapacity);
    }
}
