package com.softserve.practical.practicalHW_9.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberUser {
    public static List<Integer> inputNumber() {
        String number = new Scanner(System.in).nextLine();
        List<Integer> numbers = new ArrayList<>();
        String[] split = number.replaceAll("\\s", "").split(",");
        for (int i = 0; i < split.length; i++) {
            numbers.add(i, Integer.valueOf(split[i].strip()));
        }
        return numbers;
    }

    public static List<Integer> removeDuplicateElement(List<Integer> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                if (list.get(i) == list.get(i + 1)) {
                    list.remove(i);
                }
            }
        }
        return list;
    }
}
