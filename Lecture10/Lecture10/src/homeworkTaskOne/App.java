package homeworkTaskOne;

/* Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
 realizing the operations of union and intersection of two sets.
 Test the operation of these techniques on two pre-filled sets. */

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("I");
        set1.add("love");
        set1.add("you");
        System.out.println("The first set is: " + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("I");
        set2.add("love");
        set2.add("you");
        set2.add("more");
        System.out.println("The second set is: " + set2);

        Set<String> union = union(set1, set2);
        System.out.println("\n~Union: " + union);
        Set<String> intersection = intersect(set1, set2);
        System.out.println("~Intersection: " + intersection);
    }

    public static <T> Set union(Set<T> set1, Set<T> set2) {
        Set union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
//better
//public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
//    Set<T> union = new HashSet<>(set1);
    public static <T> Set intersect(Set<T> set1, Set<T> set2) {
        Set intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }
}
