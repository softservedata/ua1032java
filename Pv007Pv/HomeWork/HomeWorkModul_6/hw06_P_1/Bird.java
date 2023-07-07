package hw06_P_1;


/**

 The abstract class Bird represents a generic bird.

 It contains information about the feathers and the ability to lay eggs.
 */
public abstract class Bird {
    // Represents whether the bird has feathers.
    private boolean feathers;

    // Indicates that the bird lays eggs.
    private final boolean laysEggs = true;

    // Constructor for the Bird class.
    public Bird(boolean feathers) {
        this.feathers = feathers;
    }

    // Abstract method that represents the bird's ability to fly.
    public abstract void fly();

    // Getter method for the feathers field.
    public boolean isFeathers() {
        return feathers;
    }

    // Getter method for the laysEggs field.
    public boolean isLaysEggs() {
        return laysEggs;
    }

    // Overridden toString method to provide a string representation of the Bird object.
    @Override
    public String toString() {
        return "Feathers: " + feathers + "\nLays Eggs: " + laysEggs;
    }
}
