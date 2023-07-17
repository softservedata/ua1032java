package secondPracticalTask;

public class Teacher extends Staff{
    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return TYPE_PERSON;
    }

    @Override
    void print() {
        System.out.println("I am a " + getType());
    }
    @Override
    public void salary() {
        System.out.println("Calculating salary for " + getType());
    }
}
