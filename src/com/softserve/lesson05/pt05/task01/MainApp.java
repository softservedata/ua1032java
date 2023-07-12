package com.softserve.lesson05.pt05.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

public class MainApp {

    private static double getAvgValue (double[] elements) {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 0; i<elements.length; i++) {
            sum+=elements[i];
        }
        avg = sum / elements.length;
        return avg;
    }

    private static boolean checkTheValue (double value, double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    private static void outputTheMessage (boolean answer) {
        if (answer) {
            System.out.println("The third array contains your value");
        }
        else {
            System.out.println("The third array does not contain your value");
        }
    }


    public static void main(String[] args) throws IOException {
        String[] str = {"zero", "one", "two", "three", "four"};
        Arrays.sort(str);
        System.out.println("First sorted array str = " + Arrays.toString(str));

        double[] numbers = {3.1, 5.4, 7.3, 11.7, 4.5};
        DecimalFormat dF = new DecimalFormat( "#.###" );
        System.out.println("Average value of second array = " + dF.format(getAvgValue(numbers)));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your value to be checked: ");
        double value = Double.parseDouble(bufferedReader.readLine());
        outputTheMessage(checkTheValue(value, numbers));

        bufferedReader.close();
    }
}
