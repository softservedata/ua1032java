package homework;

import java.util.Scanner;

//Task 1. Input three float numbers and check: are they all belong to the range [-5, 5].

public class HWTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~Input the first float number: ");
        float n1 = scanner.nextFloat();
        System.out.println("~Input the second float number: ");
        float n2 = scanner.nextFloat();
        System.out.println("~Input the third float number: ");
        float n3 = scanner.nextFloat();
        scanner.close();
        checkRange(n1, n2, n3);
    }

    private static void checkRange(float n1, float n2, float n3) {
        if (n1 >= -5 && n1 <= 5 && n2 >= -5 && n2 <= 5 && n3 >= -5 && n3 <= 5) {
            System.out.println("All numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }
}
