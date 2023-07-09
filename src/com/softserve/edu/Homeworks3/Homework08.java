package com.softserve.edu.Homeworks3;

import java.util.Scanner;
class Num{
    private int[] numbers;
    private int min_numb;
    private int max_numb;

    public void setNumbers(int[] number) {
        this.numbers = number;
    }

    public int getMin_numb() {
        FindMinNum(numbers);
        return min_numb;
    }

    public int getMax_numb() {
        FindMaxNum(numbers);
        return max_numb;
    }

    private void FindMinNum(int[] number){
        if(number[0] < number [1] && number[0] < number[2]){
            min_numb = number[0];
        }else if(number[1] < number [0] && number[1] < number[2]){
            min_numb = number[1];
        } else if (number[2] < number [0] && number[2] < number[1]) {
            min_numb = number[2];
        }
    }
    private void FindMaxNum(int[] number){
        if(number[0] > number [1] && number[0] > number[2]){
            max_numb = number[0];
        }else if(number[1] > number [0] && number[1] > number[2]){
            max_numb = number[1];
        } else if (number[2] > number [0] && number[2] > number[1]) {
            max_numb = number[2];
        }
    }
}
public class Homework08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Num num = new Num();
        int [] numbers = new int[3];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        num.setNumbers(numbers);


        System.out.println("Max number: " + num.getMax_numb());
        System.out.println("Min number: " + num.getMin_numb());




    }
}
