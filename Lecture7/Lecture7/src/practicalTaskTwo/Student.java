package practicalTaskTwo;

public class Student extends Person {
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    String getPersonType() {
        return TYPE_PERSON;
    }

    @Override
    void print() {
        System.out.println("I am a " + getPersonType() + "!");
    }
}
