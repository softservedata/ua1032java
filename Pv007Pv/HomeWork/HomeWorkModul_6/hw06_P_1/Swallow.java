package hw06_P_1;

// Represents a swallow, a type of flying bird.
public class Swallow extends FlyingBird {
    private double weight; // The weight of the swallow.

    //Constructs a Swallow object.
    public Swallow(boolean feathers, double wingspan, double weight) {
        super(feathers, wingspan);
        this.weight = weight;
    }

    //Overrides the fly method from the parent class.
    @Override
    public void fly() {
        System.out.println("Swallow flies");
    }

    //Overrides the toString method.
    @Override
    public String toString() {
        return super.toString() + "\nWeight: " + weight + " kg";
    }
}

