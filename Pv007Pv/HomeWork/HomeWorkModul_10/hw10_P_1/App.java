package hw10_P_1;

import java.util.HashSet;
import java.util.Set;

/**
 1. Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
 set2), realizing the operations of union and intersection of two sets. Test the operation
 of these techniques on two pre-filled sets.
 */

public class App {

    // Method for union of two sets
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    // Method for intersection of two sets
    public static <E> Set<E> intersect(Set<E> set1, Set<E> set2) {
        Set<E> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

        // Union of sets
        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Union of sets: " + unionResult);

        // Intersection of sets
        Set<Integer> intersectResult = intersect(set1, set2);
        System.out.println("Intersection of sets: " + intersectResult);
    }
}
