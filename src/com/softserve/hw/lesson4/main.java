package com.softserve.hw.lesson4;

import com.softserve.hw.lesson4.task1_2.TasckOneAndTwo;
import com.softserve.hw.lesson4.task3.Error;
import com.softserve.hw.lesson4.task4.Faculty;
import com.softserve.hw.lesson4.task4.Seasons;
import com.softserve.hw.lesson4.task5.Breed;
import com.softserve.hw.lesson4.task5.Dog;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
/**------------------------Task1_2-----------------------------*/
//        TasckOneAndTwo.range();
//        TasckOneAndTwo.maxAndMin();
/**-------------------------Task3-----------------------------*/
//        Error a = Error.ERROR_400;
//        Error b = Error.ERROR_401;
//        Error c = Error.ERROR_402;
//        System.out.println(a.HTTPError());
//        System.out.println(b.HTTPError());
//        System.out.println(c.HTTPError());
/**-------------------------Task4-----------------------------*/
//        Faculty f = new Faculty();
//        System.out.println("Please enter number student");
//        f.setNumberStudents(new Scanner(System.in).nextInt());
//        f.setSeasons(Seasons.SUMMER);
//        System.out.println(f);
/**-------------------------Task5-----------------------------*/
        Dog dog1 = new Dog("Charli", Breed.BULLDOG, 5);
        Dog dog2 = new Dog("Charli", Breed.HUSKY, 10);
        Dog dog3 = new Dog("Riko", Breed.SHEEPDOG, 3);
        System.out.println(dog1.equals(dog2));//true
        System.out.println(dog1.equals(dog3));//false
        int maxEars = Math.max(Math.max(dog1.getAge(), dog2.getAge()), dog3.getAge());
        if (dog1.getAge() == maxEars) {
            System.out.println("These dog is so old: " + dog1.getName());
        } else if (dog2.getAge() == maxEars) {
            System.out.println("These dog is so old: " + dog2.getName());
        } else
            System.out.println("These dog is so old: " + dog3.getName());

    }
}
