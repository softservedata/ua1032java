package com.softserve.homework.hw05.task1;

public class NumbersArray5 {

    public static int findPositionOfSecondPositive(int[] array){
        int position = 0;
        if(array.length > 0){
            int i = 0;
            int counter=0;
            for (int current : array) {
                if(current>0){
                    counter++;
                    if(counter==2) {
                        position = i;
                        break;
                    }
                }
                i++;
            }
        }
        return position;
    }

    public static int[] findPositionAndValueOfMin(int[] array){
        int position = 0;
        int min = 0;
        if(array.length > 0){
            int i = 0;
            min=array[i];
            for (int current : array) {
                if(min > current){
                   min = current;
                   position = i;
                }
                i++;
            }
        }
        return new int[]{min, position};
    }

    public static int calcProductOfEven(int[] array){
        int product = 0;
        if(array.length>0){
            for (int current : array) {
                if(current % 2 == 0 && current != 0){
                    product = 1;
                    break;
                }
            }
            
            for (int current : array) {
                if (current % 2 == 0 && current != 0){
                    product *= current;
                }
            }
        }
        return product;
    }
}
