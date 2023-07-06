package com.softserve.Homework.hw_6.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("Brown", true);
        birds[1] = new Swallow("Blue", true);
        birds[2] = new Penguin("Black and White", true);
        birds[3] = new Kiwi("Brown", true);

        for (Bird bird : birds) {
            System.out.printf(bird.getClass().getSimpleName()+ " ");
            bird.fly();
            System.out.println(bird.getClass().getSimpleName() + " has " + bird.feathers + " feathers and " + (bird.layEggs ? "can" : "cannot") + " lay eggs.");
        }
    }
}

