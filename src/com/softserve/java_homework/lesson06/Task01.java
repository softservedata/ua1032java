package com.softserve.java_homework.lesson06;

public class Task01 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Penguin(true, true);
        birds[3] = new Kiwi(true, true);

        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName() + ": " + bird);
            bird.fly();
            System.out.println();
        }
    }
}