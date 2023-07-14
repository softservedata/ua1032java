package com.softserve.Practical.P5.task2;

public class P5_tak2 {
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2147483647;
        if (isPrime(n)){
            System.out.println("Is a prime number");
        }else{
            System.out.println("Is not prime number");
        }
    }
}
