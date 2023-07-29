package com.softserve.practical;

import java.util.*;

public class testMain {
    public static int rentalCarCost(int d) {
        if (d >= 3 && d < 7) {
            return (d * 40) - 20;
        } else if (d < 3) {
            return d * 40;
        } else return (d * 40) - 40;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Value1", 1);
        map.put("Value2", 2);
        map.put("Value3", 3);
        map.put("Value4", 4);
        map.put("Value5", 5);
        removeValueFromMap1(map,1);
        System.out.println(map);
//        for(Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext(); ) {
//            String key = iterator.next();
//            if(key != 1) {
//                iterator.remove();
//            }
//        }
    }

    private static void removeValueFromMap1(Map<String, Integer> map, int soughtValue) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> value = iterator.next();
            if(value.getValue()==soughtValue){
                iterator.remove();
            }

        }
    }
}

