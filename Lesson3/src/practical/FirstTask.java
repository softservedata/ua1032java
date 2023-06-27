package practical;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num1 = getNumber("Enter the first number: ", scanner);
        double num2 = getNumber("Enter the second number: ", scanner);

        double total = getTotal(num1, num2);
        double average = getAverage(num1, num2);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();
    }
    private static double getNumber(String s, Scanner scanner) {
        System.out.print(s);
        return scanner.nextDouble();
    }
    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

}
