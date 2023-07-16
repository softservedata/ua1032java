package practical.lesson7.task1;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println(name + " was fed.");
    }
}
