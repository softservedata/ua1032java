package practical.lesson6.task2;

public class CarsApp {
    public static void main(String[] args) {
        Car honda = new Sedan(2021, 260, "Honda Civic");
        Car renault = new Truck(2013, 160, "Renault T-Truck");

        honda.run();
        honda.stop();

        renault.run();
        renault.stop();
    }
}
