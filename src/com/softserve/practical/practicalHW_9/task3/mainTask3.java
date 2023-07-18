package com.softserve.practical.practicalHW_9.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainTask3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        System.out.println("Find and save in list newCollection all positions of element more than 5 in the collection." +
                " Output newCollection to the console;");
        List<Integer> newList = new ArrayList<>();
        for (Integer inter : list) {
            if (inter > 5) {
                newList.add(inter);
            }
        }
        System.out.println(newList);

        System.out.println(" Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format:" +
                " “position – xxx, value of element – xxx”");
        list.add(2, 1);
        list.add(8, -3);
        list.add(5, -4);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("position %d, value of element – %d\n", i, list.get(i));
        }

        System.out.println("Sort and print collection.");
        Collections.sort(list);
        System.out.println(list);
    }
}
