package com.softserve.lesson05.pt05.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumApp {
    static boolean isPrime(int n)
    {
        if (n > 0) {
            if (n <= 1)
                return false;

            for (int i = 2; i * i <= n; i++)
                if (n % i == 0)
                    return false;

            return true;
        }
        else {
            System.out.println("You have entered negative integer, try again");
            return false;
        }
    }

    static void outputMessage(boolean answer) {
        if (answer) {
            System.out.println("Is a prime number");
        }
        else {
            System.out.println("Is not prime number");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a positive integer: ");
        int number = Integer.parseInt(bufferedReader.readLine());
        outputMessage(isPrime(number));
    }
}
