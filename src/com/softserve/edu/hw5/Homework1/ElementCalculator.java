package com.softserve.edu.hw5.Homework1;

import java.util.Scanner;

public class ElementCalculator {
    public int[] input(){
        Scanner sc = new Scanner(System.in);
        int elements[] = new int[10];
        for (int i = 0; i < elements.length; i++) {
            System.out.print("elements["+i+"]: ");
            elements[i] = sc.nextInt();
        }
        return elements;
    }
    public boolean checkIfPositive(int elements[], int num) {
        for (int i = 0; i < num; i++)
            if (elements[i] < 0) {
                System.out.println("one or some of 5 first elements are not positive");
                return false;
            }
        System.out.println("all of 5 first elements are positive");
        return true;
    }


    public int calcElements() {
        int[] elements = input();
        boolean bool = checkIfPositive(elements, 5);
        if(bool) {
            int sum = 0;
            for(int i = 0; i < 5; i++)
                sum += elements[i];
            return sum;
        }
        else{
            int mult = 1;
            for(int i = 5; i < elements.length; i++)
                mult *= elements[i];
            return mult;
        }
    }
}
