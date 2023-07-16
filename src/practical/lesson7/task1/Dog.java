package practical.lesson7.task1;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println(name + " was fed.");
    }
}
