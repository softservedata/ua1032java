package secondHomeWork.flyingVehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Helicopter can flies in a short distances");

    }

    @Override
    public void land() {
        super.land();
        System.out.println("Helicopter can uses land for landing and taking off");
    }

    @Override
    public String toString() {
        return "Helicopter : weight=" + weight + ";" + " maxWeight=" + maxHeight + ";" + super.toString();
    }
}
