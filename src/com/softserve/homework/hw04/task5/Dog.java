package com.softserve.homework.hw04.task5;

import java.util.Objects;
import java.util.Scanner;

public class Dog {

    private String name;

    private Breed breed;

    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static Dog inputDog(){
        Scanner sc = new Scanner(System.in);

        System.out.print("name: ");
        String name = sc.nextLine();


        Breed breed;
        while (true) {
            System.out.print("breed: ");
            String breedString = sc.nextLine();
            try {
                breed = Breed.valueOf(breedString.toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid breed. Please try again.");
            }
        }

        System.out.print("age: ");
        int age = sc.nextInt();

        return new Dog(name, breed, age);
    }

    public static boolean hasDogsSameName(Dog[] dogs){
        boolean result=false;
        for(int i=0; i < dogs.length - 1; i++){
            for (int j=i+1; j< dogs.length - 1; j++){
                if(dogs[i].name.equals(dogs[j].name)) result = true;
            }
        }
        return result;
    }

    public static Dog findOldestDog(Dog[] dogs) {
        Dog oldestDog = null;
        if (dogs.length > 0) {
            oldestDog = dogs[0];
            for (int i = 0; i < dogs.length - 1; i++) {
                for (int j = i+1; j < dogs.length - 1; j++) {
                    if(dogs[i].age < dogs[j].age){
                        oldestDog = dogs[j];
                    }
                }
            }
        }
        return oldestDog;
    }

    @Override
    public boolean equals(Object obj1) {
        if (this == obj1) return true;
        if (obj1 == null || getClass() != obj1.getClass()) return false;
        Dog other = (Dog) obj1;
        if (!name.equals(other.name)) return true;
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString(int iterator) {
        return  "--------Dog " + (iterator+1) + "--------\n" +
                "    name: " + name + ", \n" +
                "    breed: " + breed + ", \n" +
                "    age=" + age + "\n";
    }
    @Override
    public String toString() {
        return  "-------- Dog --------\n" +
                "    name: " + name + ", \n" +
                "    breed: " + breed + " \n";
    }
}
