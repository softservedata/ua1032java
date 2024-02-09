package com.softserve.edu.practical.Practical_tasks_07_OOP_Interfaces_Polymorphism.task_1;

public class Appl {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for (Animal animal : animals) {
            if (animal != null) {
                animal.voice();
                animal.feed();
            }
        }
    }
}