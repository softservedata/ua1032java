package hm05;

import java.util.Scanner;

public class Task02 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         do{
             System.out.print("enter first number:");
             double num1 = scanner.nextDouble();
             System.out.print("enter second number:");
             double num2 = scanner.nextDouble();

             double sumResult = num1+num2;
             System.out.print("result:" +sumResult);

             System.out.print("do you want try again? (yes/no):");
             String repeat = scanner.next();
             if (!repeat.equalsIgnoreCase("yes")) {
                 break;
             }
             }while (true);
                 scanner.close();
         }

     }

