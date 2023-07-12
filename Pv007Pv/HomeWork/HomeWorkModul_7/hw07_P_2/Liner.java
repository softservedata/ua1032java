package hw07_P_2;

// Liner class represents a liner, which is a type of water vehicle
public class Liner extends WaterVehicle {
    int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    // Method to indicate that the liner is sailing and the number of floors it has
    @Override
    public void isSailing() {
        super.isSailing();
        System.out.println(", namely on a liner. Number of floors: " + floors);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
