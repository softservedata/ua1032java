package hw05_P_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Create a program (in different java documents) that prompts the user to enter:
 • 10 integers numbers and calculates the sum of the first five elements if they are
 positive, or the product of the last five elements if they are not and output the result.
 • 5 integer numbers and find:
 o position of second positive number;
 o minimum value and its position in the array.
 o calculate the product of all entered even numbers (exclude 0 from even if entered by
 user).
 */

public class FiveIinteger {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10]; // Масив для зберігання 10 цілих чисел

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine()); // Зчитування чисел з консолі і зберігання їх у масиві
        }
        int k = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) { k = k +1;}
            if (k == 2) { System.out.println("The second positive number has an index: " + i);
            break; }
        }

        int min = numbers [0];
        int p = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < min) { min = numbers[i]; p = i ;}
            if (i == 4) { System.out.println("Minimum value: " + min + " has an index " + p );}
        }

        int product = 1;
        for (int i = 0; i < 5; i++) {
            if ((numbers[i] != 0 ) && (numbers[i] % 2 == 0 )) { product *= numbers[i]; }
            if ((i == 4) && (product != 1)) { System.out.println("The product of all even numbers = " + product );}
        }
        if (product == 1) { System.out.println("There are no even numbers."); }
    }
}
