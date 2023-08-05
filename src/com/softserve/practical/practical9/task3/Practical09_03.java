package com.softserve.practical.practical9.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Practical09_03 {
    // TODO: In main() method declare a collection myCollection of 10 integers and fill it (from the console or random):
    //      - Find and save in list newCollection all positions of element more than 5 in the collection. Output newCollection to the console;
    //      - Remove from collection myCollection elements, which are greater then 20. Output the result
    //      - Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position – xxx, value of element – xxx”
    //      - Sort and print collection.

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(30));
        }
        System.out.println("Original: " + myCollection);

        for(int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) > 5) newCollection.add(i);
        }
        System.out.println("List of positions of elements more than 5: " + newCollection);

        for(int i = myCollection.size() - 1; i > 0; i--) {
            if(myCollection.get(i) > 20) myCollection.remove(i);
        }
        System.out.println("Elements greater than 20 deleted from myCollection: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        System.out.println();
        for(int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        System.out.println();
        Collections.sort(myCollection);
        System.out.println("Sorted myCollection: " + myCollection);
    }
}
