package com.softserve.homework.hw09.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            int randomNumber =random.nextInt(201)-100;  //generate rand from -100 to 100
            myCollection.add(randomNumber);
        }

        System.out.println("Random generated collection: " + myCollection);

        //Swap the maximum and minimum elements in the list.
        List<Integer> swapMaxMin = Methods.swapMaxAndMin(myCollection);
        System.out.println("\nOriginal: " + myCollection);
        System.out.println("Swapped max and min: " + swapMaxMin);

        //Insert a random three-digit number before the first negative element of the list
        List<Integer> threeDigitsBeforeFirstNegative = Methods.insertRand3DigitBeforeNegative(myCollection);
        System.out.println("\nOriginal: " + myCollection);
        System.out.println("Rand before first negative: " + threeDigitsBeforeFirstNegative);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        List<Integer> zeroBetweenNeighbors = Methods.insertZeroBetweenDifferentSigns(myCollection);
        System.out.println("\nOriginal: " + myCollection);
        System.out.println("Zeros between neighbors:" + zeroBetweenNeighbors);

        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Methods.copyToTwoLists(myCollection, 4, list1, list2);
        System.out.println("\nOriginal: "  + myCollection);
        System.out.println("List 1 in direct order: " + list1);
        System.out.println("List 2 in reversed order: " + list2);

        //In a list myCollection remove the last even element (if there are even elements
        // in the list). If there is no such element, display a message.
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(7);
        myList.add(9);

        System.out.println("\nOriginal: " + myList);
        List<Integer> removedLastEven = Methods.removeLastEvenElement(myList);
        System.out.println("Removed last even: " + removedLastEven);

        //Remove from the list myCollection the element following the first minimum.
        // If the minimum element is the last one, nothing needs to be removed.
        System.out.println("Original: " + myCollection);
        List<Integer> removeAfterMinimum = Methods.removeElementAfterFirstMinimum(myCollection)  ;
        System.out.println("Remove after minimum: " + removeAfterMinimum);
    }
}
