package com.softserve.hw04.Task05;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Black", Breed.BULLDOG,2);
        Dog dog2 = new Dog("Aslan", Breed.HUSKY, 6);
        Dog dog3 = new Dog("Archie", Breed.BEAGLE, 4);
        if(dog1.getName().equals(dog2.getName())){
            System.out.println("The two dogs have same name");
        } else if(dog1.getName().equals(dog3.getName())){
            System.out.println("The two dogs have same name");
        } else if(dog2.getName().equals(dog3.getName())){
            System.out.println("The two dogs have same name");
        } else {
            System.out.println("The two dogs haven`t same name");
        }

        if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()){
            System.out.println("The oldest dog is: " + dog1.getName() + " " + dog1.getBreed());
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog is: " + dog2.getName() + " and his breed is " + dog2.getBreed());
        } else {
            System.out.println("The oldest dog is " + dog3.getName() + " and his breed is " + dog3.getBreed());
        }


    }
}
