package hm10;

import java.util.HashMap;
import java.util.Map;

public class task02 {
    public static class Main{
        public static void main (String[]args){

            Map<String,String> personMap = new HashMap<>();

            personMap.put("Sydorenko", "Oleg");
            personMap.put("Petrenko", "Iryna");
            personMap.put("Kovalenko", "Michael");
            personMap.put("Melnychuk", "Olena");
            personMap.put("Sydorenko", "Andrew");
            personMap.put("Shevchuk", "Julia");
            personMap.put("Ivanova", "Maria");
            personMap.put("Bondarenko", "Alexander");
            personMap.put("Kovalenko", "Alexey");
            personMap.put("Pavlenko", "Orest");

            for (Map.Entry<String,String> entry : personMap.entrySet()){
                System.out.println(entry.getKey()+":" + entry.getValue());
            }
            boolean hasDuplicateNames = checkDuplicateNames(personMap);
            System.out.println("\n are there two people with the same names:" +hasDuplicateNames);

            removePersonByName(personMap, "Orest");

            System.out.println("\n After deletion:");
            for (Map.Entry<String,String> entry : personMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
        private static boolean checkDuplicateNames(Map<String,String> personMap){
            Map<String,Integer> nameCountMap = new HashMap<>();
            for (String name : personMap.values()){
                nameCountMap.put(name, nameCountMap.getOrDefault(name,0)+1);
            }
            for (int count : nameCountMap.values()){
                if (count>1){
                    return true;
                }
            }
            return false;
        }
        private static void removePersonByName(Map<String, String> personMap, String nameToRemove){
            for (Map.Entry<String,String> entry: personMap.entrySet()){
                if (entry.getValue().equals(nameToRemove)){
                    personMap.remove(entry.getKey());
                    break;
                }
            }
        }
    }
}
