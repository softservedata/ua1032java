import java.util.Scanner;

public class ApplMaxMinNumbers {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        number1 = scanner.nextInt();

        System.out.print("Input second number: ");
        number2 = scanner.nextInt();

        System.out.print("Input third number: ");
        number3 = scanner.nextInt();

        Numbers result = getMaxMinNumber(number1, number2,number3);
        System.out.println("Max number: " + result.getMax());
        System.out.println("Min number: " + result.getMin());

    }
    public static Numbers getMaxMinNumber(int num1, int num2, int num3){
      int max = Math.max(Math.max(num1, num2), num3);
      int min = Math.min(Math.min(num1, num2), num3);
      return new Numbers(max, min);
    }
}