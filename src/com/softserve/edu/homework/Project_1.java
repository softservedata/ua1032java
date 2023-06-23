// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.softserve.edu.homework;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java. lang. Math;
public class Project_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader rad = new BufferedReader (new InputStreamReader (System.in));
        System.out.println(" Input the radius : ");
        double radius = Integer.parseInt(rad.readLine());
        double area = ( Math.PI*(Math.pow(radius,2)));
        System.out.println("Area = " + area);
        double perimeter = (Math.PI*radius*2);
        System.out.println("Perimeter = " + perimeter);
        System.out.print("---------------------------------------------\n");

        System.out.println(" What is your name ? ");
        String name = rad.readLine();
        System.out.println(" What is your address ? ");
        String address = rad.readLine();
        System.out.println(" ");
        System.out.println("Your name is " + name + " and you live at " + address );
        System.out.print("----------------------------------------------\n");

        System.out.println("Enter the price for one minute of conversation with a Canadian : ");
        double priceC = Double.parseDouble(rad.readLine());
        System.out.println("Enter the duration of the call from Canada (in minutes) : ");
        double timeC = Double.parseDouble(rad.readLine());
        double call_price_canada = Math.round((priceC * timeC) * 100.0)/100.0;
        System.out.println("Call price : " + call_price_canada + "UAH");

        System.out.println("Enter the price for one minute of conversation with a Frenchman : ");
        double priceF = Double.parseDouble(rad.readLine());
        System.out.println("Enter the duration of the call from France (in minutes) : ");
        double timeF = Double.parseDouble(rad.readLine());
        double call_price_france = Math.round((priceF * timeF) * 100.0)/100.0;
        System.out.println("Call price : " + call_price_france + "UAH");

        System.out.println("Enter the price for one minute of conversation with a Uruguayan : ");
        double priceU = Double.parseDouble(rad.readLine());
        System.out.println("Enter the duration of the call from Uruguay (in minutes) : ");
        double timeU = Double.parseDouble(rad.readLine());
        double call_price_uruguay = Math.round((priceU * timeU) * 100.0)/100.0;
        System.out.println("Call price : " + call_price_uruguay + "UAH" );
        System.out.println(" ");
        System.out.println("Total of all calls = " + (((call_price_canada+call_price_france+call_price_uruguay)*100)/100)+"UAH");
    }
}