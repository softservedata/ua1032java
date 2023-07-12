package homework;

/* Create a do-while loop that prompts the user to enter two numbers and calculates their sum.
   After displaying the result, the program should ask the user if they want to perform the operation again.
   If the user inputs a positive response, the loop should repeat; otherwise, it should terminate.*/

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            System.out.println("~Input the first integer number: ");
            int n1 = scanner.nextInt();
            System.out.println("~Input the second integer number: ");
            int n2 = scanner.nextInt();
            scanner.nextLine();
            int sum = n1 + n2;
            System.out.println("The sum of your numbers is: " + sum);

            System.out.println("Do you want to enter another value? (Y/N) ");
            String choice = scanner.nextLine();
            if(!choice.equalsIgnoreCase("Y")) {
                continueLoop = false;
            }
        } while(continueLoop);
        scanner.close();
    }
}
