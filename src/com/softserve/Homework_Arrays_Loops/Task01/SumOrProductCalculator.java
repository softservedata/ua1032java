import java.util.Scanner;

public class SumOrProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result;
        if (areFirstFivePositive(numbers)) {
            result = calculateSumOfFirstFive(numbers);
        } else {
            result = calculateProductOfLastFive(numbers);
        }

        System.out.println("Result: " + result);
    }

    public static boolean areFirstFivePositive(int[] numbers) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateSumOfFirstFive(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int calculateProductOfLastFive(int[] numbers) {
        int product = 1;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }
}