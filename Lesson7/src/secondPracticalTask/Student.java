package secondPracticalTask;

public class Student extends Person{
    private static final String TYPE_PERSON = "Student";
    public Student(String name) {
        super(name);
    }


    @Override
    public String getType() {
        return TYPE_PERSON ;
    }

    @Override
    public void print() {
        System.out.println("I am a "+getType());
    }
}
