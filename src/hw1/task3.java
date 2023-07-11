package hw1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cost per minute for 1st call : ");
        double c1 = scan.nextDouble();
        System.out.println("Duration in minutes 1st call : ");
        double t1 = scan.nextDouble();
        System.out.println("Cost per minute for 2nd call : ");
        double c2 = scan.nextDouble();
        System.out.println("Duration in minutes 2nd call : ");
        double t2 = scan.nextDouble();
        System.out.println("Cost per minute for 3rd call : ");
        double c3 = scan.nextDouble();
        System.out.println("Duration in minutes 3rd call : ");
        double t3 = scan.nextDouble();
        double cost1 = t1*c1;
        double cost2 = t2*c2;
        double cost3 = t3*c3;
        System.out.println("First call cost : " + cost1);
        System.out.println("First call cost : " + cost2);
        System.out.println("First call cost : " + cost3);
        System.out.println("Total cost of all calls : " + (cost1 + cost2 + cost3));
    }

}
