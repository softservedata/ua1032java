package Homework;

import java.util.Scanner;

public class HomeworkTasks {
    public static void main(String[] args) {
        flowerBed();
        yourData();
        phoneCalls();
    }

    /* Flower bed is shaped like a circle. Calculate its perimeter and area.
    Input the radius from the console, and output obtained results.*/
    private static void flowerBed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The perimeter of flower bed is %.2f\n", perimeter);
        System.out.printf("The area of flower bed is %.2f\n", area);
    }

    /* Define two String variables name and address. Output question "What is your name? to the console.
    Read the value of name and output next question: “Where do you live, (name)?“ to the console.
    Read the value of address from the console and output the complete information.*/
    private static void yourData() {
        String name, address;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();
        System.out.println("My name is " + name + " and I live in " + address + ".");
    }

    /* Three phone calls were made from different countries, each with a different cost per minute (c1, c2, and c3)
     and duration (t1, t2, and t3). Input all the source data from the console,
     calculate the cost of each call and the total cost, and output the results to the console. */
    private static void phoneCalls() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first country: ");
        String country1 = scanner.nextLine();
        System.out.println("Input the cost per minute: ");
        double cost1 = scanner.nextDouble();
        System.out.println("Input the duration of the call: ");
        double dur1 = scanner.nextDouble();
        scanner.nextLine();
        double callCost1 = cost1 * dur1;
        System.out.println("The call cost is " + callCost1);

        System.out.println("Input the second country: ");
        String country2 = scanner.nextLine();
        System.out.println("Input the cost per minute: ");
        double cost2 = scanner.nextDouble();
        System.out.println("Input the duration of the call: ");
        double dur2 = scanner.nextDouble();
        scanner.nextLine();
        double callCost2 = cost2 * dur2;
        System.out.println("The call cost is " + callCost2);

        System.out.println("Input the third country: ");
        String country3 = scanner.nextLine();
        System.out.println("Input the cost per minute: ");
        double cost3 = scanner.nextDouble();
        System.out.println("Input the duration of the call: ");
        double dur3 = scanner.nextDouble();
        double callCost3 = cost3 * dur3;
        System.out.println("The call cost is " + callCost3);

        double totalCost = callCost1 + callCost2 + callCost3;
        System.out.println("The total cost is " + totalCost);

        scanner.close();
    }
}
