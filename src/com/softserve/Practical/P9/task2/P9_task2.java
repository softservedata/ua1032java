package com.softserve.Practical.P9.task2;

import java.util.*;

public class P9_task2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String msg = scanner.nextLine();
        String[] stringArray = msg.split("\\D+");
        Set<Integer> list = stringArrayToSet(stringArray);
        System.out.println(list);
    }

    public static Set<Integer> stringArrayToSet(String[] stringArray) {
        Set<Integer> set = new HashSet<>();
        for (String element : stringArray) {
            set.add(Integer.parseInt(element));
        }
        return set;
    }
}
