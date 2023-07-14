package com.softserve.Practical.P5.task1;

import com.softserve.HomeWork.HW5.task3.Car;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P5_task1 {

    public static int averageValue(final String[] array){
        int average = 0;
        for (int i = 0; i < array.length; i++ ){
            average += array[i].length();
        }
        return average;
    }
    public static Map<String, Integer> sameElement(final String[] array){
        Map<String, Integer>  m = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            int temp = 1;
            if (!m.containsKey(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        temp++;
                        m.put(array[i], temp);
                    }
                }
            }

        }
        return m;
    }


    public static void main(String[] args) {
        String[] array = {"Звук", "мрія","мрія", "квітка", "радість", "сонце", "сміх", "думка", "кохання", "серце", "чарівність", "зірка", "спогад", "почуття", "мить", "музика", "світло", "спокій", "диво", "час", "колір", "радість", "звук", "сміх", "серце", "кохання", "думка", "мрія", "сонце", "чарівність", "спогад", "почуття", "зірка", "мрія", "мить", "світло", "музика", "спокій", "диво", "час", "колір"};
        Arrays.sort(array);

        int averege = averageValue(array);
        System.out.println("Averege: " + averege);

        Map<String,Integer> m = sameElement(array);
        System.out.println("Map: " + m);
    }
}
