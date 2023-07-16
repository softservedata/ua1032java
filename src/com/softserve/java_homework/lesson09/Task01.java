package com.softserve.java_homework.lesson09;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(i, random.nextInt(20) - 10);
        }
    }
}