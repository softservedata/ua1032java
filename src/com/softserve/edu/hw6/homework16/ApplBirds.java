package com.softserve.edu.hw6.homework16;

public class ApplBirds {
    public static void main(String[] args) {
        Bird[] bird = {new Eagle(), new Kiwi(), new Penguin(), new Swallow()};


        bird[0].setAttributes(true, true, "gold feather");
        bird[1].setAttributes(false, false, "feather looks like a fur");
        bird[2].setAttributes(false, false, "waterproof feather");
        bird[3].setAttributes(false, false, "swallow's feather");

        for(Bird b : bird){
            System.out.println(b + "\n" + b.fly() + "\n");
        }

    }
}
