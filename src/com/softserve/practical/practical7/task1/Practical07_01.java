package com.softserve.practical.practical7.task1;

public class Practical07_01 {
    // TODO: Create an interface called Animal with methods voice() and feed(). Create two classes
    //      Cat and Dog, which implement this interface. In main() method create an array of Animal
    //      and add some Cats and Dogs to it. Call voice() and feed() method for all of it.

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Cat(),
                new Dog()
        };

        for(Animal animal: animals){
            System.out.println(animal);
            animal.feed();
            animal.voice();
        }
    }
}
