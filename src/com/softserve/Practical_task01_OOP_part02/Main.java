package com.softserve.Practical_task01_OOP_part02;

interface Animal {
    void voice();
    void feed();
}

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("The cat is being fed.");
    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("The dog is being fed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}