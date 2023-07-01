package com.softserve.homework.hw04.task2;

public class MaxMin {
       public static int getMax(int n1, int n2, int n3){
        int max = Math.max(n1, Math.max(n2, n3));
        return max;
    }

    public static int getMin(int n1, int n2, int n3){
        int min = Math.min(n1, Math.min(n2, n3));
        return min;
    }
    public static Values FindMax(int n1, int n2, int n3) {
        int max = getMax(n1,n2,n3);
        if (max == n1) {
            return Values.MAX;
        } else if (max == n2) {
            return Values.MAX;
        } else
            return Values.MAX;
    }

    public static Values FindMin(int n1, int n2, int n3){
        int min=getMin(n2,n2,n3);
        if(min == n1){
            return Values.MIN;
        }else if(min == n2 ){
            return Values.MIN;
        }else
            return Values.MIN;
    }
}

