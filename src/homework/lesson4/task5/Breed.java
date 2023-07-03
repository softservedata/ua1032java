package homework.lesson4.task5;

public enum Breed{
    BULLDOG("Bulldog"),SHEPHERD("Shepherd"),CORGI("Corgi"),JACK_RUSSEL("Jack Russell");
    private String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
