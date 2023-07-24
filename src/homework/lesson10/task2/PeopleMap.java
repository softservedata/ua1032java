package homework.lesson10.task2;

import java.util.*;

public class PeopleMap {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Ivan");
        personMap.put("Petrov", "Petro");
        personMap.put("Tarasov", "Taras");
        personMap.put("Nazarov", "Nazar");
        personMap.put("Severyniv", "Severyn");
        personMap.put("Semenov", "Semen");
        personMap.put("Bogdanov", "Bogdan");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Franko", "Ivan");
        personMap.put("Orlyk", "Pylyp");

        System.out.println("List of People: ");
        for (String s : personMap.keySet()){
            System.out.println(s + " " + personMap.get(s));
        }
        System.out.println("-------\n");

        String [] names = personMap.values().toArray(new String[0]);
        for (int i = 0; i < names.length; i++){
            for (int j = i + 1; j < names.length; j++){
                if (names[i] == names [j]) {
                    System.out.println("There are at least two people with name : " + names[i]);
                    break;
                }
            }
        }
        System.out.println("-------\n");

        System.out.println("Removing people with name \'Petro\'");
        Set<String> lastNames = personMap.keySet();
        Iterator<String> it = lastNames.iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (personMap.get(key).equals("Petro")) {
                it.remove();
            }
        }

        System.out.println("List of People: ");
        for (String s : personMap.keySet()){
            System.out.println(s + " " + personMap.get(s));
        }
        System.out.println("-------\n");
    }
}
