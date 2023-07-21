package com.softserve.edu.homework.homework_06_OOP_Encapsulation_Inheritance.task_1;
    public abstract class Bird {
        String feathers;
        boolean layEggs;

        public Bird(String fathers, boolean layEggs){
            this.feathers = fathers;
            this.layEggs = layEggs;
        }
        public abstract void fly();
    }




