package hw06_P_1;


// Represents a penguin, a type of non-flying bird.
public class Penguin extends NonFlyingBird {
    private double weight; // The weight of the penguin.

    // Constructs a Penguin object.
    public Penguin(boolean feathers, String habitat, double weight) {
        super(feathers, habitat);
        this.weight = weight;
    }

    //Overrides the fly method from the parent class.
    @Override
    public void fly() {
        System.out.println("Penguin does not fly");
    }

    //Overrides the toString method.
    @Override
    public String toString() {
        return super.toString() + "\nWeight: " + weight + " kg";
    }
}



