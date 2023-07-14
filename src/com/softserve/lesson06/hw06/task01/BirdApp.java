package com.softserve.lesson06.hw06.task01;

public class BirdApp {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};
        birds[0].fly();
        birds[0].feathers = 7000;
        birds[0].layEggs = 4;
        System.out.println(birds[0]);
        System.out.println("///");
        birds[1].fly();
        birds[1].feathers = 2000;
        birds[1].layEggs = 5;
        System.out.println(birds[1]);
        System.out.println("///");
        birds[2].fly();
        birds[2].feathers = 150000;
        birds[2].layEggs = 2;
        System.out.println(birds[2]);
        System.out.println("///");
        birds[3].fly();
        birds[3].feathers = 13;
        birds[3].layEggs = 1;
        System.out.println(birds[3]);
    }
}
