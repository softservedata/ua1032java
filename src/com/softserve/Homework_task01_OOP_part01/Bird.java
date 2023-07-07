package com.softserve.Homework_task01_OOP_part01;

abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying bird is flying.");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying bird cannot fly.");
    }
}

class Eagle extends FlyingBird {
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}

class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying swiftly through the air.");
    }

    @Override
    public String toString() {
        return "Swallow";
    }
}

class Penguin extends NonFlyingBird {
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Penguins cannot fly, but they swim gracefully.");
    }

    @Override
    public String toString() {
        return "Penguin";
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi birds are flightless birds.");
    }

    @Override
    public String toString() {
        return "Kiwi";
    }
}

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Penguin(true, true);
        birds[3] = new Kiwi(true, true);

        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.feathers);
            System.out.println("Lay Eggs: " + bird.layEggs);
            System.out.println();
        }
    }
}