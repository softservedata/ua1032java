package com.softserve.edu.practical.Practical_tasks_07_OOP_Interfaces_Polymorphism.task_1;

class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog");
    }
}