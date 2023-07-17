package secondPracticalTask;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("Calculating salary for " + getType());
    }

    @Override
    public String getType() {
        return TYPE_PERSON;
    }

    @Override
    void print() {
        System.out.println("I am a " + getType());
    }
}
