package homework.lesson6.task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Kiwi [" + super.toString() +  "] ";
    }
}
