package secondPracticalTask;

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

     public abstract String getType();

    abstract void print();


}
