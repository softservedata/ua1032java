package homework.lesson7.task2;

public class Bus extends GroundVehicle{
    String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }
}
