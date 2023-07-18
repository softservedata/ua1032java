package com.softserve.hw05.Task01_2;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {13, 15, 16, 12, 15, 13, 17, 19, 17, 15};
        int sum = 0;
        for(int i = 0; i < numbers.length / 2; i++){
            if(numbers[i] < 0){
                sum = 1;
                for(i = 5; i < numbers.length; i++){
                    sum *= numbers[i];
                }
            } else {
                sum += numbers[i];
            }
        }
        System.out.println("The sum = " + sum);
    }
}
