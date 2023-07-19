package com.softserve.edu.hw5.Homework1;

import java.util.Scanner;

public class ArrayOperations {
    private int[] elements;
    public void input(){
        Scanner sc = new Scanner(System.in);
        int elements[] = new int[5];
        for (int i = 0; i < elements.length; i++) {
            System.out.print("elements["+i+"]: ");
            elements[i] = sc.nextInt();
        }
        this.elements = elements;
    }

    public int findPositiveNum(){
        int i = 0;
        int k = 0;
        while (i < elements.length){
            if (elements[i] > 0){
                k += 1;
                if (k == 2){
                    System.out.println("Second positive number was found on " + i + " position");
                    return elements[i];
                }
            }
            i += 1;
        }
        System.out.println("Positive number was not found");
        return 1000;
    }
    public int findMinNum(){
        int min = elements[0];
        int i = 0;
        while(i < elements.length){
            if(min > elements[i]){
                min = elements[i];
            }
            i++;
        }
        System.out.println("found on position "+ i);
        return min;
    }

    public int calculateEvenNum(){
        int i = 0, num = 0;
        while (i < elements.length){
            if((elements[i] % 2 == 0) && elements[i] != 0){
                num += 1;
            }
            i++;
        }
        return num;
    }


}
