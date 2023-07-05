import java.util.Scanner;

public class ApplRangeNumbers {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        float thirdNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        firstNumber = scanner.nextFloat();

        System.out.println("Input second number: ");
        secondNumber = scanner.nextFloat();

        System.out.println("Input third number: ");
        thirdNumber = scanner.nextFloat();

        boolean range;
        if (firstNumber <= 5f && firstNumber >= -5f) {
            System.out.println("The number belongs to the range");
        } else if (secondNumber <= 5f && secondNumber >= -5f) {
            System.out.println("The number belongs to the range");
        } else if (thirdNumber <= 5f && thirdNumber >= -5f) {
            System.out.println("The number belongs to the range");
        } else {
            System.out.println("No number belongs to the range");

        }
    }
}
