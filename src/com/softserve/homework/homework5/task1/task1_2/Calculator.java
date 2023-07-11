package com.softserve.homework.homework5.task1.task1_2;

public class Calculator {
    private int[] numbers;

    public Calculator() {
    }
    public Calculator(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public final boolean isSumPositive(){
        boolean isSumPositive = true;

        for(int i = 0; i < 5; i++){
            if(numbers[i] < 0){
                isSumPositive = false;
                break;
            }
        }

        return isSumPositive;
    }

    public final int getResult(){
        if(isSumPositive()){
            int sum = 0;

            for(int i = 0; i < 5; i++){
                sum += numbers[i];
            }

            return sum;
        } else {
            int product = 1;

            for(int i = 5; i < 10; i++){
                product *= numbers[i];
            }

            return product;
        }
    }
}
