package com.softserve.edu.homework.homework_04_condition_statements.task_5;
public class Dog {
    private String name;
    private Breed breed;
    private int age ;
    public Dog(String name, Breed breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getName(){
        return name ;
    }
    public Breed getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "{  Name :  " + name + ";    Breed  :  " + breed + ";   Age  :   " + age + "   }";
    }
}
enum Breed {
    DOBERMAN,
    COCKER_SPANIEL,
    LABRADOR;
}

