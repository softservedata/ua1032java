package secondHomeWork.groundVehicle;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Drive motorcycle");
    }

    @Override
    public String toString() {
        return "Motorcycle : " + "maxSpeed=" + maxSpeed+ ";" + super.toString();
    }
}
