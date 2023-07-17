package firstPracticalTask;



public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("Meow meow");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat");
    }
}
