package homework.lesson12.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumberReading {

    public static int readNumber(int start, int end) {
        Scanner sc = new Scanner(System.in);
        int number;
        try {
            System.out.printf("Input number in range (%d , %d): ", start, end);
            number = sc.nextInt();
            if (number <= start || number >= end)
                throw new WrongInputException("\tError!\nThis number is not in the range!");
            else return number;
        } catch (InputMismatchException e) {
            System.out.println("\tError!\nWrong input! Please type only numbers.");
            return -9;
        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
            return -9;
        }

    }


    public static void main(String[] args) {
        System.out.println("Please input ten numbers in range (1, 100) (every number must be greater than previous one!)");

        List<Integer> numbers = new ArrayList<>(12);
        for (int i = 0; i < 12; i++) {  //creating empty list size 12
            numbers.add(null);
        }
        numbers.set(0, 1);
        numbers.set(11, 100);

        for (int i = 1; i < 11; i++) {
            numbers.set(i, readNumber(numbers.get(i - 1), 100));
            if (numbers.get(i) == -9) {     //catching return -9 and making a step back
                i--;
            }
        }

        System.out.println("The list of numbers: " + numbers);
        
    }
}
