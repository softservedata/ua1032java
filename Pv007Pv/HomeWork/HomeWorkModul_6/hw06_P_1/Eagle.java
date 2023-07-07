package hw06_P_1;

// Represents an eagle, a type of flying bird.
public class Eagle extends FlyingBird {
    private double weight; // The weight of the eagle.

    //Constructs an Eagle object.
    public Eagle(boolean feathers, int wingspan, double weight) {
        super(feathers, wingspan);
        this.weight = weight;
    }

    // Overrides the fly method from the parent class.
    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }

    //Overrides the toString method.
    @Override
    public String toString() {
        return super.toString() + "\nWeight: " + weight + " kg";
    }
}

