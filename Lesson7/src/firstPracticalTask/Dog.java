package firstPracticalTask;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof woof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog.");
    }
}