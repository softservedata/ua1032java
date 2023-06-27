import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task ");
            System.out.println("\t2 - Check second practical task");
            System.out.println("\t3 - Check third practical task");
            System.out.println("\t4 - Check fourth practical task");
            System.out.println("\t5 - Check  first home task");
            System.out.println("\t6 - Check  second home task");
            System.out.println("\t7 - Check  third home task");

            System.out.println("\t8 - End work ");
            int choice = sc.nextInt();

            switch (choice) {
                case 8 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                case 1 -> firstPracticalTask(scanner);
                case 2 -> secondPracticalTask(scanner);
                case 3 -> thirdPracticalTask(scanner);
                case 4 -> fourthPracticalTask(scanner);
                case 5 -> firstHomeTask(scanner);
                case 6 -> secondHomeTask(scanner);
                case 7 -> thirdHomeTask(scanner);
                default -> System.out.println("Necessary to enter option 1-8\n");
            }

        }

    }



    private static void firstPracticalTask(Scanner scanner) {
        String word1, word2, word3;
        System.out.println("enter text");
        word1 = scanner.nextLine();
        word2 = scanner.nextLine();
        word3 = scanner.nextLine();
        System.out.println("output text");
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
    }

    private static void secondPracticalTask(Scanner scanner) {
        double[] number = new double[3];
        double average;
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println("enter number");
            number[i] = scanner.nextDouble();
            sum += number[i];
        }
        System.out.println("sum is " + sum);
        average = sum / number.length;
        System.out.println("average is " + average);
    }

    private static void thirdPracticalTask(Scanner scanner) {
        double[] number = new double[2];
        double sum = 0;
        double difference = 0;
        double multiplication = 1;
        double division = 1;
        for (int i = 0; i < number.length; i++) {
            System.out.println("enter number");
            number[i] = scanner.nextDouble();
            sum += number[i];
            difference -= number[i];
            multiplication *= number[i];
            division /= number[i];
        }
        System.out.println("Sum" + sum);
        System.out.println("Difference=" + difference);
        System.out.println("Multiplication=" + multiplication);
        System.out.println("division=" + division);
    }

    private static void fourthPracticalTask(Scanner scanner) {
        String answer;
        System.out.println("How are you");
        answer = scanner.nextLine();
        System.out.print("You are " + answer);
    }

    private static void firstHomeTask(Scanner scanner) {
        double radius;
        System.out.println("enter radius");
        radius = scanner.nextDouble();
        double perimeter = Math.PI * Math.pow(radius, 2);
        double area = 2 * Math.PI * radius;
        System.out.println("perimeter is " + perimeter + "\n area is " + area);
    }

    private static void secondHomeTask(Scanner scanner) {
        String name;
        String address;
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Where do you live " + name);
        address = scanner.nextLine();
        System.out.println("Your name is " + name + "\nYour address is " + address);
    }

    private static void thirdHomeTask(Scanner scanner) {
        System.out.println("Enter cost and time first call");
        System.out.print("Enter cost per/min ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter time ");
        double t1 = scanner.nextDouble();
        System.out.println("Enter cost second call");
        System.out.print("Enter cost per/min ");
        double c2 = scanner.nextDouble();
        System.out.print("Enter time ");
        double t2 = scanner.nextDouble();
        System.out.println("Enter cost third call");
        System.out.print("Enter cost per/min ");
        double c3 = scanner.nextDouble();
        System.out.print("Enter time ");
        double t3 = scanner.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("Cost of Call 1: " + cost1);
        System.out.println("Cost of Call 2: " + cost2);
        System.out.println("Cost of Call 3: " + cost3);
        System.out.println("Total Cost: " + totalCost);


    }


}