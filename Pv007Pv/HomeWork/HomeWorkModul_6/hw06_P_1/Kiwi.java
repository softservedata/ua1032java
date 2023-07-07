package hw06_P_1;


// Represents a kiwi, a type of non-flying bird.
public class Kiwi extends NonFlyingBird {
    private double weight; // The weight of the kiwi.

    //Constructs a Kiwi object.
    public Kiwi(boolean feathers, String habitat, double weight) {
        super(feathers, habitat);
        this.weight = weight;
    }

    //Overrides the fly method from the parent class.
    @Override
    public void fly() {
        System.out.println("Kiwi does not fly");
    }

    //Overrides the toString method.

    @Override
    public String toString() {
        return super.toString() + "\nWeight: " + weight + " kg";
    }
}



