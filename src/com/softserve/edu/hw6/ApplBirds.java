package com.softserve.edu.hw6;

public class ApplBirds {
    public static void main(String[] args) {
        Bird[] bird = {new Eagle(), new Kiwi(), new Penguin(), new Swallow()};

        bird[0].setAttributes(true, true, "gold feather");
        System.out.println(bird[0] + "\n" +bird[0].fly() + "\n");

        bird[1].setAttributes(false, false, "a feather looks like a fur");
        System.out.println(bird[1] + "\n" +bird[1].fly() + "\n");

        bird[2].setAttributes(false, false, "waterproof feather");
        System.out.println(bird[2] + "\n" +bird[2].fly() + "\n");

        bird[3].setAttributes(false, false, "swallow's feather");
        System.out.println(bird[3] + "\n" +bird[3].fly() + "\n");

    }
}
