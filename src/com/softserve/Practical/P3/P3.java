package com.softserve.Practical.P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class P3 {
    public static int getTotal(int... number){
        int sum = 0;
        for (int temp: number){
            sum += temp;
        }
        return sum;
    }
    public static double getAverage(int... number){
        double sum = getTotal(number);
        return sum/number.length;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        System.out.print("First number: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("First number: ");
        b = Integer.parseInt(br.readLine());

        System.out.println("The sum of " + a+" and " +b +" is " +getTotal(a,b));
        System.out.println("The average of " + a+" and " +b +" is " +getAverage(a,b));

    }
}
