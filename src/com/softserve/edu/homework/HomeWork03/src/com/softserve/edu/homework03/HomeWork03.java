package com.softserve.edu.homework.HomeWork03.src.com.softserve.edu.homework03;
import java.util.Scanner;
public class HomeWork03 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Input cost first phone call: ");
        double cFirstCall = sc.nextDouble();
        System.out.println("Input duration first phone call: ");
        double tFirstCall = sc.nextDouble();
        double firstCall = cFirstCall * tFirstCall;

        System.out.println("\nInput cost second phone call: ");
        double cSecondCall = sc.nextDouble();
        System.out.println("Input duration second phone call: ");
        double tSecondCall = sc.nextDouble();
        double secondCall = cSecondCall * tSecondCall;

        System.out.println("\nInput cost third phone call: ");
        double cThirdCall = sc.nextDouble();
        System.out.println("Input duration third phone call: ");
        double tThirdCall = sc.nextDouble();
        double thirdCall = cThirdCall * tThirdCall;

        System.out.printf("\nCost first call %.2f", firstCall);
        System.out.printf("\nCost second call %.2f", secondCall);
        System.out.printf("\nCost third call %.2f", thirdCall);
        double totalPrice = firstCall + secondCall + thirdCall;
        System.out.printf("\nTotal price all phone calls %.2f", totalPrice);

        sc.close();



    }
}
