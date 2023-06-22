package HomeWork.HomeWork01Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    public static void main ( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the cost per minute for call 1: ");
        double c1 = Double.parseDouble(br.readLine());
        System.out.print("Enter the duration of call 1 in minutes: ");
        double t1 = Double.parseDouble(br.readLine());

        System.out.print("Enter the cost per minute for call 2: ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.print("Enter the duration of call 2 in minutes: ");
        double t2 = Double.parseDouble(br.readLine());

        System.out.print("Enter the cost per minute for call 3: ");
        double c3 = Double.parseDouble(br.readLine());
        System.out.print("Enter the duration of call 3 in minutes: ");
        double t3 = Double.parseDouble(br.readLine());

        double cost1 = c1 * t1;
        String formattedCost1 = String.format("%.2f", cost1);
        double cost2 = c2 * t2;
        String formattedCost2 = String.format("%.2f", cost2);
        double cost3 = c3 * t3;
        String formattedCost3 = String.format("%.2f", cost3);

        double totalCost = cost1 + cost2 + cost3;
        String formattedTotalCost = String.format("%.2f", totalCost);

        System.out.println("Cost of call 1: " + formattedCost1);
        System.out.println("Cost of call 2: " + formattedCost2);
        System.out.println("Cost of call 3: " + formattedCost3);
        System.out.println("Total cost of all calls: " + formattedTotalCost);

        BufferedReader close;

    }
}