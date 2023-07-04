package homework;


import java.util.Scanner;

//Write Java console application with method to find the smallest number among three integer numbers.
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number (int): ");
        int n1 = scanner.nextInt();
        System.out.println("Input the second number (int): ");
        int n2 = scanner.nextInt();
        System.out.println("Input the third number (int):  ");
        int n3 = scanner.nextInt();

        int smallest = findSmallest(n1, n2, n3);
        System.out.println("The smallest number is: " + smallest);
        scanner.close();

    }
    private static int findSmallest(int n1, int n2, int n3) {
        int smallest = n1;
        if (n2 < smallest) {
            smallest = n2;
        }
        if(n3 < smallest) {
            smallest = n3;
        }
        return smallest;
    }
}
