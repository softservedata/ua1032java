package com.softserve.Practical.P7.task1;


import com.softserve.Practical.P7.task1.Class.Animals;
import com.softserve.Practical.P7.task1.Class.Cat;
import com.softserve.Practical.P7.task1.Class.Dog;

public class P7_task1 {
    public static void main(String[] args) {
        Animals[] array = {
                new Cat(),
                new Cat(),

                new Dog(),
                new Dog()
        };
        getVoice(array);
        getFeed(array);


    }
    public static void getVoice(Animals... animals){
        for (Animals a: animals){
            a.voice();
        }
    }
    public static void getFeed(Animals... animals){
        for (Animals a: animals){
            a.feed();
        }
    }
}
