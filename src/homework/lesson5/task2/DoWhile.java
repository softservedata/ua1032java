package homework.lesson5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean end = false;
        int sum = 0;
        do {
            System.out.print("Input first number: ");
            int first = Integer.parseInt(br.readLine());
            System.out.print("Input second number: ");
            int second = Integer.parseInt(br.readLine());
            sum += (first+second);
            System.out.println("Sum: " + sum);
            System.out.print("Do You want to end the program? (Yes/No): ");
            String answer = br.readLine().toLowerCase();
            switch (answer){
                case "yes":
                    System.out.println("Goodbye!");
                    end=true;
                    break;
                case "no":
                    System.out.println("Repeating...");
                    end = false;
                    break;
                default:
                    System.out.println("Error reading the answer, Repeating...");
                    break;
            }
        }while(end!=true);
    }
}
