package com.softserve.homework.hw05;
/*
Create a class called Dog that has the following fields: name, breed, age.
Declare enum for field breed.
In main() method create three instances of type Dog.
Check if there are no two dogs with the same name;
Output the name and the breed of the oldest dog.
 */

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Breed getBreed () {
        return breed;
    }

    public void setBreed ( String breed ) {
        this.breed = Breed.valueOf(breed);
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public Dog ( String name, Breed breed, int age ) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString () {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
