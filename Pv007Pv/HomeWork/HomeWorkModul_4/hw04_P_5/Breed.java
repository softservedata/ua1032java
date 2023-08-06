package HomeWork.HomeWorkModul_4.hw04_P_5;

/**
 * enum for field breed.
 */

public enum Breed {
    BULLDOG("Bulldog"),
    DOBERMAN("Doberman"),
    PUG("Poodle"),
    DACHSHUND("Dachshund"),
    CHIHUAHUA("Chihuahua");

    private final String breed;

    /**
     * Constructs a Breed with the specified breed name.
     */
    Breed(String breed) {
        this.breed = breed;
    }

    /**
     * Returns the name of the breed.
     */
    public String getBreed() {
        return breed;
    }
}