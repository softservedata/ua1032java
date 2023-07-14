package com.softserve.homework.homework6.task1;

public class Homework06_01 {
    //  TODO: Create abstract class called Bird by scheme
    //      with attributes feathers and layEggs and an
    //      abstract fly() method.
    //      - Create classes FlyingBird and NonFlyingBird.
    //      - Create classes Eagle, Swallow, Penguin and Kiwi.
    //      - In main() method create an array Bird and
    //      add different birds to it. Call fly() method for
    //      all of it. Output the information about each
    //      type of created bird.

    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, 2),
                new Penguin(false, 1),
                new Swallow(true, 4),
                new Kiwi(false, 1)
        };

        for(Bird bird: birds) {
            System.out.println(bird);
            bird.fly();
            System.out.println();
        }
    }
}
