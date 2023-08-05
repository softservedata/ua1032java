package com.softserve.edu.homework.homework_12_Exceptions.task_1;

public class Division {
    public static double div(double a, double b){
        if (a==0 && b == 0)
            throw new ArithmeticException("Two numbers cannot be 0");
        else if(b == 0)
            throw new ArithmeticException("A number of type Double cannot be divided by 0.");

       return a/b;
    }
}
