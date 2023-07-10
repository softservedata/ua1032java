package homework.lesson6.task1;

public class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Penguin [" + super.toString() + "] ";
    }
}
