package com.softserve.practical_tasks.pr07.task1;

public class Cat implements Animal{
    private String breed;
    private int age;

    public Cat(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void voice(){
        System.out.println("Voice of cat: Meow");
    }

    @Override
    public void feed(){
        System.out.println("Cat eats milk");
    }
}
