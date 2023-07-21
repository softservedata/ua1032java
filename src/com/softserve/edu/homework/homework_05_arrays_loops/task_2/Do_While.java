package com.softserve.edu.homework.homework_05_arrays_loops.task_2;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Do_While {
   public static double Input() throws IOException {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first number : ");
      double x = Double.parseDouble(input.nextLine());
      System.out.print("Enter second number : ");
      double y = Double.parseDouble(input.nextLine());
      System.out.print("Sum : ");
      return x + y;
   }
   public static double Add(double x,double y){
     return (x + y) ;
   }
   public static boolean Agree_to_continue() {
      Scanner input = new Scanner(System.in);
      boolean flag;
      System.out.println("Do you want to perform the operation again ? (Yes/No)  ");
      String answer = input.nextLine();
      if(Objects.equals(answer, "Yes")){
          System.out.println("Ok, let's go !");
          flag =  true;
      }
      else if (Objects.equals(answer, "No")){
          System.out.println("Goodbye :(");
          flag =  false;
      }
      else {
          System.out.println("Can you repeat, please ?");
          flag = true;
      }
      return flag;
   }
}