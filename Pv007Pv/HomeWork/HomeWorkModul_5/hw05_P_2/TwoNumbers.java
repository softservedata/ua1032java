package hw05_P_2;

import java.util.Scanner;

/**2. Create a do-while loop that prompts the user to enter two numbers and calculates their
        sum. After displaying the result, the program should ask the user if they want to perform
        the operation again. If the user inputs a positive response, the loop should repeat;
        otherwise, it should terminate.
 Створіть цикл do-while, який запропонує користувачеві ввести два числа та обчислить їх
 сума Після відображення результату програма повинна запитати користувача, чи хоче він виконати
 операція знову. Якщо користувач вводить позитивну відповідь, цикл має повторюватися;
 в іншому випадку він повинен завершитися.
 */
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        // Variable to store the user's answer
        String answer;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the first number:");
            int number1 = scanner.nextInt(); // Read the first number from the user
            System.out.println("Enter the second number:");
            // Read the second number from the user
            int number2 = scanner.nextInt();
            // Calculate and print the sum of the two numbers
            System.out.println("Sum = " + (number1 + number2));
            System.out.println("Do you want to add again? Yes/No");
            // Read the user's answer and convert it to lowercase
            answer = scanner.next().toLowerCase();
        } while (answer.equals("yes")); // Repeat the loop if the user's answer is "yes"
        System.out.println("The program has finished its work");
    }
}

