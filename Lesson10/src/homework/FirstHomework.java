package homework;

import java.util.HashSet;
import java.util.Set;

public class FirstHomework {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(5);
        set2.add(6);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

        var unionSet = union(set1,set2);
        System.out.println("UnionSet :" +unionSet);

        var intersectSet= intersect(set1,set2);
        System.out.println("Intersect :" +intersectSet);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}
