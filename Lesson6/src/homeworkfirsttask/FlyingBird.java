package homeworkfirsttask;

public class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Flying");
    }
}
