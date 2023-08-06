package homeWork_10_Colections_Part2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Map<String,String> personMap = new HashMap<>();
        personMap.put("Petrenko","Petro");
        personMap.put("Dolyk","Roman");
        personMap.put("Ivanenko","Victoria");
        personMap.put("Vuzh","Ivan");
        personMap.put("Vus","Volodya");
        personMap.put("Vodoviz","Orest");
        personMap.put("Virniy","Ira");
        personMap.put("Docus","Ihor");
        personMap.put("Kos","Danylo");
        personMap.put("Hrab","Roman");

        System.out.println(personMap);

        List<String> valuesList = new ArrayList<>();
        valuesList.addAll(personMap.values());

        DoSomethinkWithMap doSomethinkWithMap = new DoSomethinkWithMap();

        if(doSomethinkWithMap.findDuplicates(valuesList).isEmpty()){
            System.out.println("No one person with sane name");
        }else{
            System.out.println("this names are repeated:");
            System.out.println(doSomethinkWithMap.findDuplicates(valuesList));
        }

        System.out.println("Input name whitch one will be deleted:");
        String name = sc.nextLine();

        doSomethinkWithMap.removePersonFromMap(personMap,name);

        System.out.println(personMap);
        sc.close();




    }
}
