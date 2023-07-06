package com.softserve.homework.hw06.task1;

public class AppBird {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("Brown", true);
        birds[1] = new Swallow("Black", true);
        birds[2] = new Penguin("Black and White", true);
        birds[3] = new Kiwi("Brown", true);

        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.getFeathers());
            System.out.println("Can lay eggs? " + bird.canLayEggs());
            System.out.println();
        }
    }
}
