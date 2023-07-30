package homeWork_10_Colections_Part2;

import java.util.HashSet;
import java.util.Set;

public class DoSomethinkWithSet {

    public Set<String> union(Set<String> set1, Set<String> set2){
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        return unionSet;
    }
    public Set<String> intersect(Set<String> set1, Set<String> set2){
        Set<String> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        return intersectSet;
    }
}
