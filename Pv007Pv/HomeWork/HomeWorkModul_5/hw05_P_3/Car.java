package hw05_P_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**3.* Create class called Car with fields: type, year of production and engine capacity.
        • Create and initialize in main() method four instances of class Car.
        • Output result for cars:
        o certain model year (enter year in the console);
        o sorted cars by the field “year of production ”.
 */
public class Car {
    private String type; // Type of the car
    private int year; // Year of manufacture
    private double engineVolume; // Engine volume
    // Constructor to initialize the car object
    public Car(String type, int year, double engineVolume) {
        this.type = type;
        this.year = year;
        this.engineVolume = engineVolume;
    }
    // Getters and setters for the fields
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public double getEngineVolume() {return engineVolume;}
    public void setEngineVolume(double engineVolume) {this.engineVolume = engineVolume;}
    public static void main(String[] args) {

        // Create objects.
        Car car1 = new Car("Sedan",2019,150);
        Car car2 = new Car("SUV",2021,180);
        Car car3 = new Car("Pickup",2022,140);
        Car car4 = new Car("Pickup",2020,165);

    Car [] cars = { car1, car2,car3,car4};  // Declaration and initialization of the array of Car objects.
        System.out.println("----------------------------------------------------------");
        System.out.println("All objects of the Car class.");
        // Display all information about objects.
        int i = 1;
        for (Car car : cars) {
            System.out.println("Car" + i +
                    ". Type: " + car.getType() +
                    ", Year: " + car.getYear() +
                    ", Engine Volume: " + car.getEngineVolume());
        i++;
        }
        System.out.println("----------------------------------------------------------");
        //Entering and reading the year of manufacture of the car for its search.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the model year:");
        int modelYear = scanner.nextInt();
        // Search for a car by the entered year of manufacture.
        System.out.println("Cars with model year " + modelYear + ":");
        boolean found = false;
        for (Car car : cars) {
            if (car.getYear() == modelYear) {
                System.out.println("Type: " + car.getType() +
                        ", Year: " + car.getYear() +
                        ", Engine Volume: " + car.getEngineVolume());
                found = true;
            }
        }
        if (found == false){ System.out.println("There is no car with this year.");}
        System.out.println("----------------------------------------------------------");
        // Sort by the "release year" field in ascending order.
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));
        // Output of sorted cars by year of manufacture.
        System.out.println("Sorted cars by year.");
        for (Car car : cars) {
            System.out.println("Car" + i + ". Type: " + car.getType() +
                    ", Year: " + car.getYear() +
                    ", Engine Volume: " + car.getEngineVolume());
            i++;
        }
    }
}

