package practicalTaskOne;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof!^^");
    }

    @Override
    public void feed() {
        System.out.println("Dogs adore sausages!");
    }
}
