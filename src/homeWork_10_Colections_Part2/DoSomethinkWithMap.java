package homeWork_10_Colections_Part2;

import java.util.*;

public class DoSomethinkWithMap {
    public Set<String> findDuplicates(List<String> listContainingDuplicates) {
         Set<String> setToReturn = new HashSet<>();
         Set<String> set1 = new HashSet<>();

        for (String s : listContainingDuplicates) {
            if (!set1.add(s)) {
                setToReturn.add(s);
            }
        }
        return setToReturn;
    }

   public void removePersonFromMap(Map<String, String> map, String name) {
        int coutnt=0;
        List<String> listOfKeys = new ArrayList<>();
        for(Map.Entry<String,String> entry : map.entrySet()){
            if(entry.getValue().equals(name)){
            coutnt=+1;
            listOfKeys.add(entry.getKey());
            }
        }

       for (String s:
            listOfKeys) {
           map.remove(s);
       }

        if(coutnt==0){
            System.out.println("no one person with name = "+name);
        }

    }
}
