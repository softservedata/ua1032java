package com.softserve.Homework_Collections_part01;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Homework_task01 {
    public static void main(String[] args) {
        // Declare and fill the collection
        List<Integer> myCollection = new ArrayList<>();
        fillCollection(myCollection);

        // Swap maximum and minimum elements
        swapMaxAndMinElements(myCollection);
        System.out.println("After swapping max and min elements: " + myCollection);

        // Insert a random three-digit number before the first negative element
        insertRandomThreeDigitNumberBeforeNegative(myCollection);
        System.out.println("After inserting random three-digit number: " + myCollection);

        // Insert zero between neighboring elements with different signs
        insertZeroBetweenDifferentSigns(myCollection);
        System.out.println("After inserting zero between different signs: " + myCollection);

        // Copy first k elements to list1 and the rest to list2 in reverse order
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        copyElementsToTwoLists(myCollection, list1, list2, 5);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        // Remove last even element from myCollection
        removeLastEvenElement(myCollection);
        System.out.println("After removing last even element: " + myCollection);

        // Remove element following the first minimum
        removeElementFollowingFirstMinimum(myCollection);
        System.out.println("After removing element following first minimum: " + myCollection);
    }

    private static void fillCollection(List<Integer> collection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            collection.add(num);
        }
        scanner.close();
    }

    private static void swapMaxAndMinElements(List<Integer> collection) {
        if (collection.isEmpty()) {
            return;
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < collection.size(); i++) {
            if (collection.get(i) < collection.get(minIndex)) {
                minIndex = i;
            }

            if (collection.get(i) > collection.get(maxIndex)) {
                maxIndex = i;
            }
        }

        int temp = collection.get(minIndex);
        collection.set(minIndex, collection.get(maxIndex));
        collection.set(maxIndex, temp);
    }

    private static void insertRandomThreeDigitNumberBeforeNegative(List<Integer> collection) {
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;

        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                collection.add(i, randomNumber);
                break;
            }
        }
    }

    private static void insertZeroBetweenDifferentSigns(List<Integer> collection) {
        List<Integer> indicesToInsertZero = new ArrayList<>();

        for (int i = 0; i < collection.size() - 1; i++) {
            int num1 = collection.get(i);
            int num2 = collection.get(i + 1);

            if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
                indicesToInsertZero.add(i + 1);
            }
        }

        for (int i = indicesToInsertZero.size() - 1; i >= 0; i--) {
            collection.add(indicesToInsertZero.get(i), 0);
        }
    }

    private static void copyElementsToTwoLists(List<Integer> source, List<Integer> list1, List<Integer> list2, int k) {
        for (int i = 0; i < k; i++) {
            if (i < source.size()) {
                list1.add(source.get(i));
            } else {
                break;
            }
        }

        for (int i = source.size() - 1; i >= k; i--) {
            list2.add(source.get(i));
        }
    }

    private static void removeLastEvenElement(List<Integer> collection) {
        if (collection.isEmpty()) {
            return;
        }

        for (int i = collection.size() - 1; i >= 0; i--) {
            if (collection.get(i) % 2 == 0) {
                collection.remove(i);
                return;
            }
        }

        System.out.println("No even elements to remove.");
    }

    private static void removeElementFollowingFirstMinimum(List<Integer> collection) {
        if (collection.isEmpty()) {
            return;
        }

        int minIndex = 0;

        for (int i = 1; i < collection.size(); i++) {
            if (collection.get(i) < collection.get(minIndex)) {
                minIndex = i;
            }
        }

        if (minIndex < collection.size() - 1) {
            collection.remove(minIndex + 1);
        }
    }
}