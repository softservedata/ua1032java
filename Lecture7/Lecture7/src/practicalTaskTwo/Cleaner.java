package practicalTaskTwo;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    String getPersonType() {
        return TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("The salary for " + getPersonType());
    }

    @Override
    void print() {
        System.out.println("I am a " + getPersonType()+ "!");
    }
}

