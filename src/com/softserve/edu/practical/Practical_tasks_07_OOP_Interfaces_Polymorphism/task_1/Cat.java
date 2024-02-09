package com.softserve.edu.practical.Practical_tasks_07_OOP_Interfaces_Polymorphism.task_1;

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat");
    }
}
