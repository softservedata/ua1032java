package com.softserve.Practical.P9.task1;

import java.util.ArrayList;
import java.util.List;

public class P9_task1 {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(20, "vase"));
        list.add(new HeavyBox(10, "phone"));
        list.add(new HeavyBox(5, "laptop"));
        list.add(new HeavyBox(11, "t-shirt"));
        print(list);

        list.get(0).setWeight(1);
        list.remove(list.size() - 1);
        print(list);

        list.clear();
        print(list);
    }

    public static List<HeavyBox> print(List<HeavyBox> list) {
        System.out.println("=========================================");
        for (HeavyBox element : list) {
            System.out.println(element);
        }
        if (list.size() == 0) {
            System.out.println("The list is empty");
        }
        return list;
    }
}
