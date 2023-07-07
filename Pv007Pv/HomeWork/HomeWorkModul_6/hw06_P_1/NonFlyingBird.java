package hw06_P_1;

// Represents a bird that is incapable of flying.
public class NonFlyingBird extends Bird {
    private String habitat; // The habitat of the non-flying bird.

    //Constructs a NonFlyingBird object.
    public NonFlyingBird(boolean feathers, String habitat) {
        super(feathers);
        this.habitat = habitat;
    }

    //Gets the habitat of the bird.
    public String getHabitat() {
        return habitat;
    }

    // Overrides the fly method from the parent class.
    @Override
    public void fly() {
        System.out.println(" cannot fly ");
    }

    //Overrides the toString method.
    @Override
    public String toString() {
        return super.toString() + "\nHabitat: " + habitat;
    }
}

