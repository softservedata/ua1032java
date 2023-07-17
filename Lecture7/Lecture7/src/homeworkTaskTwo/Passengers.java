package homeworkTaskTwo;

public abstract class Passengers {
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public Passengers() {

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Passengers = " + passengers;
    }
}
