package com.softserve.practical_tasks.pr07.task1;

public class Dog implements Animal{
    private String breed;
    private int age;
    private String colorOfFur;

    public Dog(String breed, int age, String colorOfFur) {
        this.breed = breed;
        this.age = age;
        this.colorOfFur = colorOfFur;
    }

    @Override
    public void voice(){
        System.out.println("Voice of dog: Howl");
    }

    @Override
    public void feed(){
        System.out.println("Dog eats meat");
    }
}
