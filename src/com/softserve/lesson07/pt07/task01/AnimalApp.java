package com.softserve.lesson07.pt07.task01;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cat(), new Dog()};

        animals[0].voice();
        animals[0].feed();
        animals[1].voice();
        animals[1].feed();
        animals[2].voice();
        animals[2].feed();
        animals[3].voice();
        animals[3].feed();
    }
}
