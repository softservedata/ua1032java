package homework.lesson10.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionApp {

    public static Set<Integer> union (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> united = new HashSet<>();
        united.addAll(set1);
        united.addAll(set2);
        return united;
    }
    public static Set<Integer> intersection (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersected = new HashSet<>();

        Iterator<Integer> it = set1.iterator();
        while(it.hasNext()){
            int element = it.next();
            if(set2.contains(element)){
                intersected.add(element);
            }
        }

        return intersected;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < 6; i++){
            set1.add(i);
        }
        for (int i = 3; i < 9; i++){
            set2.add(i);
        }
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Using union method: " + union(set1, set2));
        System.out.println("Using intersection method: " + intersection(set1, set2));
    }
}
