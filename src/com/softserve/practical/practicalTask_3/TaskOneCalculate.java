package com.softserve.practical.practicalTask_3;

public class TaskOneCalculate {
    double numberOne;
    double numberTwo;

    public TaskOneCalculate(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double getTotal() {
        return numberOne + numberTwo;
    }

    public double getAverage() {
        return getTotal() / 2;
    }
     public static double getNumber(String prompt){
        return Double.parseDouble(prompt);
     }
}
