package homework.lesson6.task1;

public class NonFlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }

    public NonFlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

}
