package com.softserve.Practical.P9.task3;

import com.softserve.HomeWork.HW9.task1.HW9_task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class P9_task3 {
    public static  List<Integer> getNewList(List<Integer> list, Function<Integer, Boolean> op){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (op.apply(list.get(i))){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    public static void print(List<Integer> list){
        for (int i = 0; i< list.size(); i++){
            System.out.println("position – "+i +", value of element – "+ list.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> myCollection = HW9_task1.generateRandomNumber(10,-40,40);
        System.out.println(myCollection);


        Function<Integer, Boolean> parametersNewList = x -> x > 5;
        List<Integer> newCollection = getNewList(myCollection, parametersNewList);
        System.out.println(newCollection);


        Function<Integer, Boolean> removeElement = x -> x < 20;
        List<Integer> removeElements = getNewList(myCollection, removeElement);
        System.out.println(removeElements);

        myCollection.set(2,1);
        myCollection.set(8,-3);
        myCollection.set(5,-4);

        Collections.sort(myCollection);
        print(myCollection);

    }
}

