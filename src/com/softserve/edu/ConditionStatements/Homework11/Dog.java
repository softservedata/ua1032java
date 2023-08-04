package com.softserve.edu.ConditionStatements.Homework11;

enum Breeds {
    BULLDOG,
    LABRADOR,
    CHIHUAHUA

}
public class Dog {
    private String name;
    private Breeds breed;
    private int age;

    public String getName() {
        return name;
    }

    public Breeds getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, Breeds breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    @Override
    public String toString() {
        return "the oldest dog is: "+ name +
                " dog's breed: " + breed;
    }

    @Override
    public boolean equals(Object obj) {

        if((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        Dog otherDog = (Dog) obj; //we used explicit conversion type

        if((name == null) && (otherDog.name != null)
                || (name != null) && (otherDog.name == null)) {
            return false;
        }

        if(name == null && otherDog.name == null) {
            return true;
        }

        return name.equals(otherDog.name);
    }
}
