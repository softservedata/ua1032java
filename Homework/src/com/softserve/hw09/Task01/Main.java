package com.softserve.hw09.Task01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            System.out.print("element " + i + " = ");
            myCollection.add(sc.nextInt());
        }
        System.out.println(myCollection);

        // Swap the maximum and minimum elements in the list
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxi = 0;
        int mini = 0;
        for (int i = 0; i < myCollection.size(); i++){
            if (max < myCollection.get(i)){
                max = myCollection.get(i);
                maxi = i;
            }
            if(min > myCollection.get(i)){
                min = myCollection.get(i);
                mini = i;
            }
        }
        myCollection.set(maxi, min);
        myCollection.set(mini, max);
        System.out.println(myCollection);

        // Insert a random three-digit number before the first negative element of the list
        max = 1000;
        min = 100;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int count = 0;
        for (int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) < 0){
                count = i;
                break;
            }
        }
        if(count - 1 >= 0){
            myCollection.set(count - 1, random_int);
        }
        System.out.println(myCollection);

        // Insert a zero between all neighboring elements collection myCollection with different signs
        for(int i = 0; i < myCollection.size() - 1; i++){
            if(myCollection.get(i) < 0 && myCollection.get(i + 1) > 0){
                myCollection.add(i + 1, 0);
            }
            if(myCollection.get(i) > 0 && myCollection.get(i + 1) < 0){
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println(myCollection);

        // Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
        System.out.println("Enter the value of k in the range from 1 to " + String.valueOf(myCollection.size()));
        int k = sc.nextInt();
        List<Integer> list1 = myCollection.subList(0,k);
        List<Integer> list2 = myCollection.subList(k, myCollection.size());
        Collections.reverse(list2);
        System.out.println(list1);
        System.out.println(list2);

        //In a list myCollection remove the last even element (if there are even elements in the list).
        // If there is no such element, display a message.
        int index = -1;
        for(int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) % 2 == 0){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("There is no such element");
        } else {
            myCollection.remove(index);
        }
        System.out.println(myCollection);

        // Remove from the list myCollection the element following the first minimum.
        // If the minimum element is the last one, nothing needs to be removed.

        min = Integer.MAX_VALUE;
        mini = 0;
        for (int i = 0; i < myCollection.size(); i++){
            if(min > myCollection.get(i)){
                min = myCollection.get(i);
                mini = i;
            }
        }
        if(mini >= myCollection.size() - 1){
            System.out.println("Can`t delete after minimum");
        } else {
            myCollection.remove(mini + 1);
        }
        System.out.println(myCollection);
    }
}
