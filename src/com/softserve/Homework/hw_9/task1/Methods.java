package com.softserve.Homework.hw_9.task1;
import java.util.*;

public class Methods {
    public static void fillList(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
    }
    public static void swapMaxMin(List<Integer> list) {
        int maxIndex = list.indexOf(Collections.max(list));
        int minIndex = list.indexOf(Collections.min(list));
        Collections.swap(list, maxIndex, minIndex);
    }
    public static void insertRandomBeforeFirstNegative(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, rand.nextInt(900) + 100);
                break;
            }
        }
    }
    public static void insertZeroBetweenDifferentSigns(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i - 1) > 0 && list.get(i) < 0) || (list.get(i - 1) < 0 && list.get(i) > 0)) {
                list.add(i, 0);
                i++;
            }
        }
    }
    public static void splitList(List<Integer> list, int k, List<Integer> list1, List<Integer> list2) {
        list1.addAll(list.subList(0, k));
        list2.addAll(list.subList(k, list.size()));
        Collections.reverse(list2);
    }
    public static void removeLastEven(List<Integer> list) {
        int lastEvenIndex = -1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        if (lastEvenIndex != -1) {
            list.remove(lastEvenIndex);
        } else {
            System.out.println("No even element found in the list");
        }
    }
    public static void removeElementAfterFirstMin(List<Integer> list) {
        int minIndex = list.indexOf(Collections.min(list));
        if (minIndex != list.size() - 1) {
            list.remove(minIndex + 1);
        }
    }


}

