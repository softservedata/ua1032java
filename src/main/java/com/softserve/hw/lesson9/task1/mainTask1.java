package com.softserve.hw.lesson9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mainTask1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Insert value at List");
        ClassHelper.addElementList(myCollection, 40);
        System.out.println(myCollection);

        System.out.println("Swap the maximum and minimum elements in the list.");
        ClassHelper.reverseMaxAndMinValue(myCollection);
        System.out.println(myCollection);

        System.out.println(" Insert a random three-digit number before the first negative element of the list");
        ClassHelper.setThreeDigitNumber(myCollection);
        System.out.println(myCollection);

        System.out.println("Insert a zero between all neighboring elements collection myCollection " +
                "with different signs");
        ClassHelper.setZeroBetweenWithDifferentSigns(myCollection);
        System.out.println(myCollection);

        System.out.println("Copy the first k elements of the myCollection to the list1, in direct order," +
                " and the rest to the list2 in reverse order.");
        ClassHelper.createSecondList(myCollection, 7);

        System.out.println("In a list myCollection remove the last even element (if there are even elements in the list)." +
                " If there is no such element, display a message.");
        ClassHelper.deleteLastEvenElement(myCollection);
        System.out.println(myCollection);

        System.out.println(" Remove from the list myCollection the element following the first minimum." +
                " If the minimum element is the last one, nothing needs to be removed.");
        ClassHelper.deleteElementFollowingTheFirstMinimum(myCollection);
        System.out.println(myCollection);
    }

}
