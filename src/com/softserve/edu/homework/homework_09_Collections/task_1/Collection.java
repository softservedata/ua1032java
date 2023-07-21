package com.softserve.edu.homework.homework_09_Collections.task_1;

import java.util.*;
import java.util.Random;
public class Collection {
    public static void main(String[]args){
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            int randomNumber =random.nextInt(200)-100;
            myCollection.add(randomNumber);
        }
        System.out.println("Swapped max and min: " + Methods.swapMinMax(myCollection) + "\n");
        System.out.println("The three-digit number before the first negative element : " + Methods.random_three_digit_number(new LinkedList<>(myCollection)) + "\n");
        System.out.println("Zero between all neighboring elements : " + Methods.zero_between_all_neighboring_elements(new LinkedList<>(myCollection)) + "\n");
        System.out.println("Copy elements : " + Methods.copy_elements_first_five(new LinkedList<>(myCollection)) + Methods.copy_elements_last_five(new LinkedList<>(myCollection)) + "\n");
        System.out.println("List without the last even number : " + Methods.last_even_number(new LinkedList<>(myCollection)) + "\n");
        System.out.println("Without next of min : " + Methods.min_value(new LinkedList<>(myCollection)) + "\n");
    }
}
