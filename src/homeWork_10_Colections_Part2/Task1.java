package homeWork_10_Colections_Part2;

import homeWork_9_Colections_Part1.task1.DoSomethinkWithList;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Apple");
        set1.add("Orange");
        set1.add("Banana");
        set1.add("Pineapple");

        set2.add("Mango");
        set2.add("Apple");
        set2.add("Grape");
        set2.add("Pineapple");
        set2.add("Plum");

        DoSomethinkWithSet doSomethinkWithSet = new DoSomethinkWithSet();
        System.out.println(doSomethinkWithSet.union(set1,set2));
        System.out.println(doSomethinkWithSet.intersect(set1, set2));


    }
}
