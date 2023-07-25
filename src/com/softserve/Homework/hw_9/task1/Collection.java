package com.softserve.Homework.hw_9.task1;
import java.util.*;

public class Collection{
    public static void main(String[] args) {
        List<Integer> Collection = new ArrayList<>();
        Methods.fillList(Collection);
        System.out.println("Original collection: " + Collection);

        Methods.swapMaxMin(Collection);
        System.out.println("After swapping max and min: " + Collection);

        Methods.insertRandomBeforeFirstNegative(Collection);
        System.out.println("After inserting random three-digit number: " + Collection);

        Methods.insertZeroBetweenDifferentSigns(Collection);
        System.out.println("After inserting zero between elements with different signs: " + Collection);

        int k = 5;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Methods.splitList(Collection, k, list1, list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        Methods.removeLastEven(Collection);
        System.out.println("After removing last even element: " + Collection);

        Methods.removeElementAfterFirstMin(Collection);
        System.out.println("After removing element following first minimum: " + Collection);
    }
}

