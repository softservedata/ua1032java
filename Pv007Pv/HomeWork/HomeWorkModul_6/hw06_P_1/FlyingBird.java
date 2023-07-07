package hw06_P_1;

// Represents a bird that is capable of flying.
public class FlyingBird extends Bird {
    private double wingspan; // The wingspan of the flying bird.

    //Constructs a FlyingBird object .

    public FlyingBird(boolean feathers, double wingspan) {
        super(feathers);
        this.wingspan = wingspan;
    }

    // Gets the wingspan of the bird.

    public double getWingspan() {
        return wingspan;
    }

    // Overrides the fly method from the parent class.
    @Override
    public void fly() {
        System.out.println("can fly");
    }

    //Overrides the toString
    @Override
    public String toString() {
        return super.toString() + "\nWingspan: " + wingspan + " m";
    }
}

