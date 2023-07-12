package homework;


/* Create class called Car with fields: type, year of production and engine capacity.
• Create and initialize in main() method four instances of class Car.
Output result for cars:
• Certain model year (enter year in the console);
• Sorted cars by the field “year of production ”. */


import java.util.Scanner;

public class Car {
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

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Crossover", 2021, 2.1);
        Car car2 = new Car("Hatchback", 2023, 1.6);
        Car car3 = new Car("SUV", 2021, 3.5);
        Car car4 = new Car("Sedan", 2022, 2.0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("~Enter a year to search for cars: ");
        int year = scanner.nextInt();

        System.out.println("~Cars produced in " + year + ":");
        printCarInfo(car1, year);
        printCarInfo(car2, year);
        printCarInfo(car3, year);
        printCarInfo(car4, year);
    }

    private static void printCarInfo(Car car, int year) {
        if (car.getYearOfProduction() == year) {
            System.out.println("Type: " + car.getType());
            System.out.println("Engine Capacity: " + car.getEngineCapacity() + " liters");
            System.out.println();
        }
    }

    private static void carSortingByYear() {
        
    }
}
