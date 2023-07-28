package com.softserve.HomeWork.HW9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW9_task1 {
    public static List<Integer> generateRandomNumber(int size, int a, int b) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(Math.min(a,b), Math.max(a,b)+1)); //[a;b];
        }
        return list;
    }

    public static int minIndex(List<Integer> list) {
        int index = 0;
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                index = i;
            }
        }
        return index;
    }

    public static int maxIndex(List<Integer> list) {
        int index = 0;
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }

    public static List<Integer> setNumber(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                Random random = new Random();
                list.add(i, random.nextInt(100, 1000));
                break;
            }
        }
        return list;
    }

    public static List<Integer> swapMinMax(List<Integer> list) {
        int minIndex = minIndex(list);
        int maxIndex = maxIndex(list);

        int minElement = list.get(minIndex);
        int maxElement = list.get(maxIndex);

        list.set(minIndex, maxElement);
        list.set(maxIndex, minElement);

        return list;
    }

    public static void setZero(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i) > 0 && list.get(i - 1) < 0) || (list.get(i) < 0 && list.get(i - 1) > 0) && list.get(i) != 0 && list.get(i - 1) != 0) {
                list.add(i, 0);
            }
        }
//        return list;
    }

    public static List<Integer> getFirstElement(List<Integer> list, int k) {
        List<Integer> firstElement = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            firstElement.add(list.get(i));
        }
        return firstElement;
    }

    public static List<Integer> getLastElement(List<Integer> list, int k) {
        List<Integer> lastElement = new ArrayList<>();
        for (int i = list.size() - 1; i > k - 1; i--) {
            lastElement.add(list.get(i));
        }
        return lastElement;
    }

    public static List<Integer> removeLastEvenElement(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                break;
            }
        }
        return list;
    }

    public static List<Integer> removeNextNegativeElement(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < 0) {
                list.remove(i + 1);
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = generateRandomNumber(10, -10,10);
        System.out.println("Generated list: " + list);

        swapMinMax(list);
        System.out.println("List with swapped minimum and maximum element: " + list);

        setNumber(list);
        System.out.println("Generated three significant number: " + list);

        setZero(list);
        System.out.println("Inserted zeros" + list);

        int k = 3;
        List<Integer> list1 = getFirstElement(list, k);
        System.out.println("The first " + k + ": " + list1);
        List<Integer> list2 = getLastElement(list, k);
        System.out.println("The last " + (list.size() - k) + ": " + list2);

        removeLastEvenElement(list);
        System.out.println("Remove last even element: " + list);

        removeNextNegativeElement(list);
        System.out.println("Remove the next element after the negative element: " + list);
    }
}
