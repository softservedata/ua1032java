package com.softserve.hw05.Task01;

public class Main {
    public static void main(String[] args) {
        Bird [] birds = {new Eagle(true, true),
                new Kiwi(true, true),
                new Swallow(true, true),
                new Penguin(true, true)};
        for(Bird bird:birds){
            System.out.println("Does the bird fly? " + bird.fly());
        }
    }
}
