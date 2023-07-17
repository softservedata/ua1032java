package com.softserve.edu11set;

import java.util.*;

public class ProgLinkedHashSet {
        public static void main(String[] args) {
                //Set<String> set = new LinkedHashSet<>();
                //Set<String> set = new HashSet<>();
                //Set<String> set = new TreeSet<>();
                Set<String> set = new TreeSet<>(new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                                return -o1.compareTo(o2);
                        }
                });
                set.add("Mike");
                set.add("Nike");
                set.add("Alex");
                set.add("Sara");
                //
//                for (String object : set) {
//                      System.out.println(object);
//                }
                //
                Iterator<String> iterator = set.iterator();
                while (iterator.hasNext()) {
                        String element = iterator.next();
                        System.out.println(element + " ");
                        //iterator.remove();
                }

        }
}