package com.softserve.edu.ArrayAndLoops.Homework12;

import java.util.Scanner;

public class ElementCalculator {
    private int[] elements;

    public void input() {
        Scanner sc = new Scanner(System.in);
        int elements[] = new int[10];
        for (int i = 0; i < elements.length; i++) {
            System.out.print("elements["+i+"]: ");
            elements[i] = sc.nextInt();
        }
        sc.close();
        this.elements = elements;
    }
    public void setElements(int[] elements) {
        this.elements = elements;
    }


    public boolean checkIfPositive() {
        for (int i = 0; i < 5; i++)
            if (elements[i] < 0) {
                System.out.println("one or some of 5 first elements are not positive");
                return false;
            }
        System.out.println("all of 5 first elements are positive");
        return true;
    }


    public int calcElements() {
        boolean bool = checkIfPositive();
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
