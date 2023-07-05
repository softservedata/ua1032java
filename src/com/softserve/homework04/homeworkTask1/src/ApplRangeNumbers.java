import java.util.Locale;
import java.util.Scanner;

public class ApplRangeNumbers {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        float thirdNumber;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Input first number: ");
        firstNumber = scanner.nextFloat();

        System.out.println("Input second number: ");
        secondNumber = scanner.nextFloat();

        System.out.println("Input third number: ");
        thirdNumber = scanner.nextFloat();

        boolean range;
        if(firstNumber <= 5f && firstNumber >= -5f &&
                secondNumber <= 5f && secondNumber >= -5f &&
                thirdNumber <= 5f && thirdNumber >= -5f) {
            System.out.println("They are all belong to the range [-5, 5].");
        } else {
            System.out.println("They are not all belong to the range [-5, 5].");
        }
    }
}
