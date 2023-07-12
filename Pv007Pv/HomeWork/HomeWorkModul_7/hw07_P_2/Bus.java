package hw07_P_2;

// Bus is a subclass of GroundVehicle
public class Bus extends GroundVehicle {
    String route;

    public Bus(String route) {
        this.route = route;
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    // Method to indicate driving a bus and specify the route
    @Override
    public void Drive() {
        super.Drive();
        System.out.println("route: " + route);
    }
}