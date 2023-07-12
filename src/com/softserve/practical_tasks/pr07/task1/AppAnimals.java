package com.softserve.practical_tasks.pr07.task1;

public class AppAnimals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Cat("Cat0", 2);
        animals[1] = new Cat("Cat1", 11);
        animals[2] = new Cat("Cat2", 12);
        animals[3] = new Dog("Dog1", 11, "black");
        animals[4] = new Dog("Dog2", 2, "grey");

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
