package com.softserve.edu.homework.homework6_OOP_Encapsulation_Inheritance.task_1;

public class Kiwi extends NonFlyingBird {
     public Kiwi(String feathers,boolean layEggs){
         super(feathers,layEggs);
     }
     public void fly(){
         super.fly();
     }
     public void Lifetime(){
         System.out.println("I can live more than 50 years");
     }
}
