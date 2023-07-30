package hm10;

import java.util.HashSet;
import java.util.Set;

public class task01{

    public static class SetOperations{
        public static <T> Set<T> union(Set<T> set1, Set<T> set2){
            Set<T> unionSet = new HashSet<>(set1);
            unionSet.addAll(set2);
            return unionSet;
        }
        public static <T> Set<T> intersect (Set<T> set1, Set<T> set2){
            Set<T> intersectSet = new HashSet<>(set1);
            intersectSet.removeAll(set2);
            return intersectSet;
        }
        public static void main (String[] args){

            Set<Integer> set1 = new HashSet<>();

            set1.add(1);
            set1.add(2);
            set1.add(3);

            Set<Integer> set2 = new HashSet<>();

            set2.add(4);
            set2.add(5);
            set2.add(6);

            System.out.println("set 1:" +set1);
            System.out.println("set 2:" +set2);

            Set<Integer> unionResult= union(set1,set2);
            System.out.println("union" +unionResult);

            Set<Integer> intersectResult = intersect(set1,set2);
            System.out.println("intersect:" + intersectResult);
        }
    }
}
