package com.softserve.lesson04.hw04.task05;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return breed == dog.breed;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name= '" + name + '\'' +
                ", breed= " + breed +
                ", age= " + age +
                '}';
    }

    public void checkDogNames(Dog dog) {
        if (this.name.equals(dog.name)) {
            System.out.println("These two dogs have the same name");
        }
        else {
            System.out.println("The dog names are " + this.name + " and " + dog.name);
        }
    }

    public Dog checkDogAge(Dog dogOne, Dog dogTwo) {
        if (this.age >= dogOne.age && this.age >= dogTwo.age) {
            return  this;
        }
        if (dogOne.age>= dogTwo.age) {
            return dogOne;
        }
        return dogTwo;
    }
}
