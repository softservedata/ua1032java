package com.softserve.homework.homework5.task1.task1_3;

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

    public int getPosOfSecondPositiveNum() {
        int posOfSecondPositiveNum = -1;

        for(int i = 0; i < 5; i++){
            if(numbers[i] >= 0 && i != 4){
                if(numbers[i + 1] >= 0){
                    posOfSecondPositiveNum = i + 1;
                    break;
                }
            }
        }

        return posOfSecondPositiveNum;
    }

    public int getMinimumValue() {
        int minimumValue = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(minimumValue > numbers[i]){
                int temp = minimumValue;
                minimumValue = numbers[i];
                numbers[i] = temp;
            }
        }

        return minimumValue;
    }

    public int getMinimumValueI() {
        int iminimum = 0;
        int minimumValue = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (minimumValue > numbers[i]) {
                int temp = minimumValue;
                minimumValue = numbers[i];
                numbers[i] = temp;
                iminimum = i;
            }
        }

        return iminimum;
    }

    public int getProductOfEvenNumbers(){
        int product = 1;

        for(int number: this.numbers){
            if(number != 0 && number % 2 == 0){
                product *= number;
            }
        }

        return product;
    }
}
