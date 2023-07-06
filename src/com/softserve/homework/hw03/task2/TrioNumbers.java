package com.softserve.homework.hw03.task2;

public class TrioNumbers {

    private int firstNumber;

    private int secondNumber;

    private int thirdNumber;

    public TrioNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }
// було б правильно передбачити випадок, коли всі числа однакові
    public static int findSmallestNumber(TrioNumbers trioNumbers){
        int smallest = trioNumbers.getFirstNumber();
        if(trioNumbers.getSecondNumber() < trioNumbers.getFirstNumber()){
             smallest = trioNumbers.getSecondNumber();
        }
        else if( trioNumbers.getThirdNumber() < smallest){
            smallest = trioNumbers.getThirdNumber();
        }

        return smallest;
    }

    @Override
    public String toString() {
        return "TrioNumbers: " +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", thirdNumber=" + thirdNumber +"\n";
    }
}
