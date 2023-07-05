package com.softserve.lesson04.hw04.task05;

public class DogApp {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Luna", Breed.SHEPHERD, 5);
        Dog dogTwo = new Dog("Max", Breed.BERNESE, 6);
        Dog dogThree = new Dog("Luna", Breed.LABRADOR, 4);

        dogOne.checkDogNames(dogTwo);
        dogOne.checkDogNames(dogThree);
        dogTwo.checkDogNames(dogThree);

        Dog oldestDog = dogOne.checkDogAge(dogTwo,dogThree);
        System.out.println("The name of the oldest dog " + oldestDog.getName() + " and breed "
                + oldestDog.getBreed().getName());
    }
}
