package homework.lesson6.task1;

public class Eagle extends FlyingBird{
    public Eagle(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle [" + super.toString() + "] ";
    }
}
