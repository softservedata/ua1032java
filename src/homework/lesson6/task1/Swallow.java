package homework.lesson6.task1;

public class Swallow extends FlyingBird{
    public Swallow(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow [" + super.toString() + "] ";
    }
}
