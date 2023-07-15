package com.softserve.Practical_tasks_Collections_part01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Practical_task03 {
    public static void main(String[] args) {
        // Declare and fill the collection
        List<Integer> myCollection = new ArrayList<>();
        fillCollection(myCollection);

        // Find positions of elements > 5 and save them in newCollection
        List<Integer> newCollection = findPositionsGreaterThanFive(myCollection);
        System.out.println("Positions of elements > 5: " + newCollection);

        // Remove elements > 20 from myCollection
        removeElementsGreaterThanTwenty(myCollection);
        System.out.println("After removing elements > 20: " + myCollection);

        // Insert elements at specified positions
        insertElementsAtPositions(myCollection, 2, 8, 5, 1, -3, -4);
        System.out.println("After inserting elements: " + myCollection);

        // Sort and print the collection
        sortAndPrintCollection(myCollection);
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

    private static List<Integer> findPositionsGreaterThanFive(List<Integer> collection) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            int num = collection.get(i);
            if (num > 5) {
                positions.add(i);
            }
        }
        return positions;
    }

    private static void removeElementsGreaterThanTwenty(List<Integer> collection) {
        collection.removeIf(num -> num > 20);
    }

    private static void insertElementsAtPositions(List<Integer> collection, int position1, int position2, int position3,
                                                  int element1, int element2, int element3) {
        collection.add(position1, element1);
        collection.add(position2, element2);
        collection.add(position3, element3);
    }

    private static void sortAndPrintCollection(List<Integer> collection) {
        collection.sort(null);
        System.out.println("Sorted collection: " + collection);
    }
}