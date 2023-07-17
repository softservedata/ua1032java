package hm06;

abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void displayInformation() {
        System.out.println(getClass().getSimpleName() + " Information:");
        System.out.println("Feathers: " + feathers);
        System.out.println("Lay Eggs: " + layEggs);
    }
}

class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Flying...");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Unable to fly.");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super("Golden", true);
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super("Blue", true);
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Black and White", true);
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Brown", true);
    }
}

public class Task01 {
    public static void main(String[] args) {
        Bird[] birds = { new Eagle(), new Swallow(), new Penguin(), new Kiwi() };

        for (Bird bird : birds) {
            bird.displayInformation();
            bird.fly();
            System.out.println();
        }
    }
}

