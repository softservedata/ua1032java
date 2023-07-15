package com.softserve.homework.hw09.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Methods {

    //Swap the maximum and minimum elements in the list.
    public static List<Integer> swapMaxAndMin(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        } else {
            int max = Collections.max(list);
            int maxPosition = list.indexOf(max);

            int min = Collections.min(list);
            int minPosition = list.indexOf(min);

            if (max != min) {
                System.out.println("MAX[" + maxPosition + "] = " + max);
                System.out.println("MIN[" + minPosition + "] = " + min);

                Collections.swap(list, maxPosition, minPosition);
            }
            return new ArrayList<>(list);
        }
    }

    //Insert a random three-digit number before the first negative element of the list
    public static List<Integer> insertRand3DigitBeforeNegative(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }else {
            List<Integer> modifiedCollection = new ArrayList<>(list);
            for (int i = 0; i < modifiedCollection.size() ; i++) {
                if (list.get(i) < 0) {  //find first negative
                    Random random = new Random();
                    int rand3Digit = random.nextInt(900) + 100; // generate a random three-digit number
                    System.out.println("First negative = " + list.get(i));
                    System.out.println("Rand = " + rand3Digit);
                    modifiedCollection.add(i, rand3Digit);
                    break;
                }
            }
            return modifiedCollection;
        }
    }

    //Insert a zero between all neighboring elements collection myCollection
    // with different signs
    public static List<Integer> insertZeroBetweenDifferentSigns(List<Integer> list) {
        List<Integer> modifiedCollection = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            modifiedCollection.add(list.get(i));

            if (i < list.size() - 1 && list.get(i) * list.get(i + 1) < 0) {
                modifiedCollection.add(0);
            }
        }

        return modifiedCollection;
    }

    //Copy the first k elements of the myCollection to the list1,
    // in direct order, and the rest to the list2 in reverse order
    public static void copyToTwoLists(List<Integer> myCollection, int k, List<Integer> list1, List<Integer> list2) {
        if (myCollection.size() < k) {
            throw new IllegalArgumentException("myCollection does not have enough elements.");
        }

        // Copy first k elements to list1 in direct order
        list1.addAll(myCollection.subList(0, k));

        // Copy the rest of the elements to list2 in reverse order
        List<Integer> restOfElements = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(restOfElements);
        list2.addAll(restOfElements);
    }

    //In a list myCollection remove the last even element
    // (if there are even elements in the list).
    // If there is no such element, display a message.
    public static List<Integer> removeLastEvenElement(List<Integer> list){
        List<Integer> removedLastEvenElement = new ArrayList<>(list);
        boolean hasEven = false;
        if (list.isEmpty()){
            return null;
        }else {
            for (int i = removedLastEvenElement.size()-1; i >0 ; i--) {
                if(removedLastEvenElement.get(i) % 2 ==0){
                    System.out.println("Even = " + removedLastEvenElement.get(i));
                    removedLastEvenElement.remove(i);
                    hasEven = true;
                    break;
                }
            }
            if (!hasEven){
                System.out.println("No even elements");
                return null;
            }
            return removedLastEvenElement;
        }
    }

    //Remove from the list myCollection the element following the first minimum.
    // If the minimum element is the last one, nothing needs to be removed.
    public static List<Integer> removeElementAfterFirstMinimum(List<Integer> myCollection) {
        if (myCollection.size() <= 1) {
            return null; // No elements or only one element in the list
        }else {
            List<Integer> modifiedList = new ArrayList<>(myCollection);
            int min = modifiedList.get(0);
            int minIndex = 0;

            // Find the index of the first minimum element
            for (int i = 1; i < modifiedList.size(); i++) {
                if (modifiedList.get(i) < min) {
                    min = modifiedList.get(i);
                    minIndex = i;
                }
            }

            // Remove the element following the first minimum, if it exists
            if (minIndex < modifiedList.size() - 1) {
                System.out.println("Min[ "+ minIndex+"] = " + min);
                modifiedList.remove(minIndex + 1);
            }
            return modifiedList;
        }
    }
}
