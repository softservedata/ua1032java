package com.softserve.hw.lesson9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassHelper {
    public static List<Integer> addElementList(List<Integer> integerList, int bound) {
        for (int i = 0; i < 10; i++) {
            integerList.add(i, new Random().nextInt(bound) - bound / 2);
        }
        return integerList;
    }

    public static List<Integer> reverseMaxAndMinValue(List<Integer> integerList) {
        int maxValue = integerList.get(0);
        int indexMax = 0;
        int minValue = integerList.get(0);
        int indexMin = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > maxValue) {
                maxValue = integerList.get(i);
                indexMax = i;
            }
            if (integerList.get(i) < minValue) {
                minValue = integerList.get(i);
                indexMin = i;
            }

        }
//        System.out.printf("Max value %d, and its index %d",maxValue,indexMax);
//        System.out.printf("Min value %d, and its index %d",minValue,indexMin);
        integerList.set(indexMax, minValue);
        integerList.set(indexMin, maxValue);

        return integerList;
    }

    public static List<Integer> setThreeDigitNumber(List<Integer> integerList) {
        int count = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 0 && count == 0) {
                integerList.add(i, new Random().nextInt(900) + 100);
                count++;
            }
        }
        return integerList;
    }

    public static List<Integer> setZeroBetweenWithDifferentSigns(List<Integer> integerList) {
        int size = integerList.size();
        for (int i = 0; i < size - 1; i++) {
            int firstValue = integerList.get(i);
            int secondValue = integerList.get(i + 1);
            if (firstValue * secondValue < 0) {
                integerList.add(i + 1, 0);
                size++;
                i++;
            }
        }
        return integerList;
    }

    public static List<Integer> createSecondList(List<Integer> integerList, int K) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            list.add(i, integerList.get(i));
        }
        for (int i = 0; i < (integerList.size() - K); i++) {
            list.add(i + K, integerList.get(integerList.size() - 1 - i));
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> deleteLastEvenElement(List<Integer> integerList) {
        int indexElement = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) {
                indexElement = i;
            }
        }
        if (indexElement == 0) {
            System.out.println("Not its element");
        } else {
            integerList.remove(indexElement);
        }
        return integerList;
    }

    public static List<Integer> deleteElementFollowingTheFirstMinimum(List<Integer> integerList) {
        int minimum = integerList.get(0);
        int minimumIndex = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < minimum) {
                minimum = integerList.get(i);
                minimumIndex = i;
            }
        }
        if (minimumIndex + 1 == integerList.size()) {
            return integerList;
        } else
            integerList.remove(minimumIndex + 1);
        return integerList;
    }

}
