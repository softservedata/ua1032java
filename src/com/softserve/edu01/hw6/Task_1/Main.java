package com.softserve.edu01.hw6.Task_1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.fly();

            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays eggs: " + bird.laysEggs());

            if (bird instanceof FlyingBird) {
                System.out.println("This is a flying bird.");
            } else if (bird instanceof NonFlyingBird) {
                System.out.println("This is a non-flying bird.");
            }

            System.out.println();
        }
    }
}
