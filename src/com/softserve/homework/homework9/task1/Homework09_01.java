package com.softserve.homework.homework9.task1;

import java.util.*;

public class Homework09_01 {
    // TODO: Declare collection myCollection of 10 integers and fill it (from the console or random).
    //      - Swap the maximum and minimum elements in the list.
    //      - Insert a random three-digit number before the first negative element of the list
    //      - Insert a zero between all neighboring elements collection myCollection with different signs
    //      - Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
    //      - In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
    //      - Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean evenNumberExists = false;
        int k;
        int minValue = 0;
        int maxValue = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(20) - 10);
        }

        // Swap the maximum and minimum elements in the list.
        System.out.println("Original: " + myCollection);

        for(int i = 0; i < myCollection.size(); i++){
            if(minValue > myCollection.get(i)) {
                minValue = myCollection.get(i);
                minIndex = i;
            }
            if(maxValue < myCollection.get(i)) {
                maxValue = myCollection.get(i);
                maxIndex = i;
            }
        }

        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println("Index of maximum value is " + maxIndex + " and it's " + maxValue);
        System.out.println("Index of minimum value is " + minIndex + " and it's " + minValue);
        System.out.println("Swapped the maximum and minimum elements in the list: " + myCollection);

        // Insert a random three-digit number before the first negative element of the list
        System.out.println();
        for(int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) < 0){
                myCollection.add(i, random.nextInt(1998) - 999);
                break;
            }
        }
        System.out.println("Added a random three-digit number before first negative element in the list: " + myCollection);

        // Insert a zero between all neighboring elements collection myCollection with different signs
        System.out.println();
        System.out.println("Original: " + myCollection);
        for(int i = 0; i < myCollection.size() - 1; i++){
            if((myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) || (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0)){
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println("Inserted zero between all neighboring elements with different signs: " + myCollection);

        // Copy the first k elements of the myCollection
        System.out.println();
        System.out.print("myCollection size is " + myCollection.size() + ", enter k value to split myCollection: ");
        k = sc.nextInt();

        for(int i = 0; i < myCollection.size(); i++){
            if(i <= k) {
                list1.add(myCollection.get(i));
            } else {
                list2.add(myCollection.get(i));
                Collections.reverse(list2);
            }
        }
        System.out.println("List1: " + list1);
        System.out.println("List2 in reverse order: " + list2);

        // In a list myCollection remove the last even element
        System.out.println();
        for(int i = myCollection.size() - 1; i > 0; i--) {
            if(myCollection.get(i) % 2 == 0) {
                evenNumberExists = true;
                System.out.println("Original: " + myCollection);
                myCollection.remove(i);
                System.out.println("Last even element removed: " + myCollection);
                break;
            }
        }

        if(!evenNumberExists) System.out.println("There isn't any even number in myCollection");

        //  Remove from the list myCollection the element following the first minimum.
        System.out.println();
        minValue = 0;
        minIndex = 0;

        for(int i = 0; i < myCollection.size(); i++) {
            if(minValue > myCollection.get(i)) {
                minValue = myCollection.get(i);
                minIndex = i;
            }
        }
        if(minIndex != myCollection.size() - 1) {
            System.out.println("Original: " + myCollection);
            myCollection.remove(minIndex + 1);
            System.out.println("Removed the element following the first minimum: " + myCollection);
        } else {
            System.out.println("The minimum element is last in myCollection.");
        }
    }
}
