package practicalTaskTwo;

/* Create abstract class called Car with:
• fields: model, maxSpeed and yearOfProduction;
• methods: run() and stop().
Create classes called Truck and Sedan which extend class Car.
In main() method create array of Car’s objects. Add to this array some trucks and sedans and print info about it. */

public class TestCars {
    public static void main(String[] args) {
        Car cars[] = new Car[5];
        cars[1] = new Sedan("Toyota Tacoma", 220, 2020);
        cars[2] = new Sedan("Chevrolet Silverado", 200, 2019);
        cars[3] = new Truck("Audi A4", 190, 2021);
        cars[4] = new Truck("Toyota Camry", 221, 2018);

        for (int i = 1; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
            System.out.println("Year of Production: " + car.getYearOfProduction());
            car.run();
            car.stop();
        }
    }
}
