package com.softserve.practical.practical9.task1;

import java.util.ArrayList;
import java.util.List;

public class Practical09_01 {
    // TODO: Create a dynamic array containing objects of the HeavyBox class which includes int weight and String contents fields. Output its contents using for-each loop.
    //      - Change the weight of the first box by 1.
    //      - Remove the last box.
    //      - Output result to the console. Remove all boxes and output result to the console.

    public static void main(String[] args) {
        List<HeavyBox> arrList = new ArrayList<>();
        arrList.add(new HeavyBox(3, List.of("bottles")));
        arrList.add(new HeavyBox(1, List.of("t-shirt", "socks")));
        arrList.add(new HeavyBox(7, List.of("shoes", "jacket")));
        arrList.add(new HeavyBox(8, List.of("microwave")));

        System.out.println("Original:");
        arrList.forEach(System.out::println);

        System.out.println();
        System.out.println("The weight of first element was increased by 1:");
        arrList.get(0).setWeight(arrList.get(0).getWeight() + 1);
        arrList.forEach(System.out::println);

        System.out.println();
        System.out.println("The last element of arrList was removed:");
        arrList.remove(arrList.size() - 1);
        arrList.forEach(System.out::println);

        System.out.println();
        arrList.clear();
        System.out.println("All elements were removed:");
        arrList.forEach(System.out::println);
    }
}
