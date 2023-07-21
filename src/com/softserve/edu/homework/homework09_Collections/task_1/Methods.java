package com.softserve.edu.homework.homework09_Collections.task_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
public class Methods {
    public static List<Integer> swapMinMax(List<Integer> myCollection) {
        System.out.println("↓  Swap the maximum and minimum elements in the list  ↓");
        System.out.println("Base : " + myCollection);
        List<Integer> copyList = new ArrayList<>(myCollection);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < copyList.size(); i++) {
            int value = copyList.get(i);
            if (value < min) {
                min = value;
                minIndex = i;
            }
            if (value > max) {
                max = value;
                maxIndex = i;
            }
        }
        if (minIndex != 0 && maxIndex != 0) {
            copyList.set(minIndex, max);
            copyList.set(maxIndex, min);
        }
        System.out.println("Max : "+ max + ";  Min : " + min);
        return copyList;
    }
    public static LinkedList<Integer> random_three_digit_number(LinkedList<Integer> myCollection) {
        System.out.println("-----------------\n" + "↓  Insert a random three-digit number before the first negative element of the list  ↓");
        Random random = new Random();
        LinkedList<Integer> copyList2 = new LinkedList<>(myCollection);
        int randomNumber = random.nextInt(900)+100;
        if (random.nextBoolean()) {
            randomNumber *= -1;
        }
        System.out.println("Base : " + myCollection);
        System.out.print("Random number : " + randomNumber);
        for(int i = 0; i < copyList2.size();i++){
            if (copyList2.get(i) < 0){
                System.out.println(";  First negative : "+copyList2.get(i));
                copyList2.add(i, randomNumber);
                break;
            }
        }
       return copyList2;
    }
    public static LinkedList<Integer>  zero_between_all_neighboring_elements(LinkedList<Integer> myCollection){
        System.out.println("-----------------\n" + "↓   Insert a zero between all neighboring elements collection myCollection with different signs  ↓");
        System.out.println("Base : " + myCollection);
        LinkedList<Integer> copyList3 = new LinkedList<>(myCollection);
        for(int i = 0; i < copyList3.size() - 1 ; i++){
            int value1 = copyList3.get(i);
            int value2 = copyList3.get(i + 1);
            if((value1 >= 0 && value2 < 0) || (value1 < 0 && value2 >= 0)){
                copyList3.add(i+1, 0);
                i++;
            }
        }
        return copyList3;
    }
    public static LinkedList<Integer> copy_elements_first_five(LinkedList<Integer> myCollection){
        System.out.println("-----------------\n" + "↓   Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order  ↓");
        System.out.println("Base : " + myCollection);
        LinkedList<Integer> copyList_first_five = new LinkedList<>(myCollection.subList(0, Math.min(5, myCollection.size())));
        System.out.println("First five value : " + copyList_first_five);
        return copyList_first_five;
    }
    public static LinkedList<Integer> copy_elements_last_five(LinkedList<Integer> myCollection){
        LinkedList<Integer> copyList_last_five = new LinkedList<>(myCollection.subList(5, Math.min(10, myCollection.size())));
        Collections.reverse(copyList_last_five);
        System.out.println("The following 5 values are reversed: : " + copyList_last_five);
        return copyList_last_five;
    }
    public static LinkedList<Integer> last_even_number(LinkedList<Integer> myCollection){
        System.out.println("-----------------\n" + "↓   In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message  ↓");
        System.out.println("Base : " + myCollection);
        LinkedList<Integer> copyList4 = new LinkedList<>(myCollection);
        int remove_number = -1;
        int i = copyList4.size() - 1 ;
        while (i >= 0) {
            if ((copyList4.get(i)%2) == 0) {
                remove_number = copyList4.remove(i);
                break;
            }
            i--;
        }
        if (remove_number != -1){
                System.out.println("Last even number : " + remove_number);
                myCollection.removeLastOccurrence(remove_number);
        }
        else {
            System.out.println("There is no even element in the list!");
        }
        return copyList4;
    }
    public static LinkedList<Integer> min_value(LinkedList<Integer> myCollection){
        System.out.println("-----------------\n" + "↓   In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message  ↓");
        System.out.println("Base : " + myCollection);
        LinkedList<Integer> copyList5 = new LinkedList<>(myCollection);
        int minElement = Collections.min(copyList5);
        System.out.println("Minimal value : " + minElement);
        int i = copyList5.indexOf(minElement);
        if (i == copyList5.size()-1){
            System.out.println("This is the last value!!!");
        }
        else {copyList5.remove(i + 1);}
        return copyList5;
    }
}
