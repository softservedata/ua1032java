import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int secondPositivePosition = findSecondPositivePosition(numbers);
        int minimumValue = findMinimumValue(numbers);
        int minimumValuePosition = findMinimumValuePosition(numbers);
        int productOfEvenNumbers = calculateProductOfEvenNumbers(numbers);

        System.out.println("Position of second positive number: " + secondPositivePosition);
        System.out.println("Minimum value: " + minimumValue + ", Position: " + minimumValuePosition);
        System.out.println("Product of even numbers: " + productOfEvenNumbers);
    }

    public static int findSecondPositivePosition(int[] numbers) {
        int positiveCount = 0;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    position = i + 1;
                    break;
                }
            }
        }

        return position;
    }

    public static int findMinimumValue(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public static int findMinimumValuePosition(int[] numbers) {
        int minimum = numbers[0];
        int position = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
                position = i;
            }
        }

        return position + 1;
    }

    public static int calculateProductOfEvenNumbers(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            if (number != 0 && number % 2 == 0) {
                product *= number;
            }
        }
        return product;
    }
}