package homework.lesson6.task1;

public class FlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    public FlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }


}
