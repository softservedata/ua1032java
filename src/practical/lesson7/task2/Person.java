package practical.lesson7.task2;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }
}
