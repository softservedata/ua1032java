package practicalTaskTwo;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void print();

    abstract String getPersonType();
}
