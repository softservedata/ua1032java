package com.softserve.edu01.hw9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class MainList {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {

        //оголосив та заповнив myCollection

        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        System.out.println("myCollection: " + myCollection);

        //поміняв мінімальне та максимальне значення в списку

        int max = myCollection.get(0);
        int maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                maxIndex = i;
            }
        }

        int min = myCollection.get(0);
        int minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                minIndex = i;
            }
        }

        myCollection.set(maxIndex, min);
        myCollection.set(minIndex, max);

        System.out.println("myCollection after swap: " + myCollection);

        //вставлення випадкового трьохзначного числа перед першим від'ємним елементом

        int randomThreeDigitNumber = random.nextInt(900) + 100; // Випадкове трьохзначне число
        int firstNegativeIndex = -1;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex != -1) {
            myCollection.add(firstNegativeIndex, randomThreeDigitNumber);
        } else {
            myCollection.add(randomThreeDigitNumber);
        }

        System.out.println("myCollection after pasting: " + myCollection);

        //вставлення нуля між сусідніми елементами з різними знаками

        for (int i = 1; i < myCollection.size(); i++) {
            int prev = myCollection.get(i - 1);
            int current = myCollection.get(i);

            if ((prev >= 0 && current < 0) || (prev < 0 && current >= 0)) {
                myCollection.add(i, 0);
                i++;
            }
        }

        System.out.println("myCollection after pasting zero elements: " + myCollection);

        //Копіювання перших k елементів в list1 та інших в list2 в обернутому порядку

        int k = 5;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        //Видалення останнього парного елементу з myCollection, якщо такий є

        int lastEvenIndex = -1;

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }

        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
            System.out.println("myCollection after removing the last even element: " + myCollection);
        } else {
            System.out.println("In myCollection there are no paired items to delete.");
        }

    }
}
