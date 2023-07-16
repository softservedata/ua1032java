package practical.lesson7.task2;

public class Teacher extends Staff{
    private static final String TYPE_PERSON = "Teacher";


    public Teacher(String name, float salary) {
        super(name, salary);
    }

    @Override
    public void salary() {
        System.out.println("My salary is " + salary + '$');
    }

    @Override
    public void print() {
        super.print();
        System.out.print(TYPE_PERSON + '\n');
    }
}
