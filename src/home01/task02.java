package home01;

import java.util.Scanner;

public class task02 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("what is your name:");
         String name = scanner.nextLine();

         System.out.println("where do you live:"+ name);
         String address = scanner.nextLine();

         System.out.println("Name:" + name);
         System.out.println("Address:"+ address);
     }
}
