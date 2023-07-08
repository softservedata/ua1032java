package practical;

import java.util.Arrays;
import java.util.Random;

/*  Create an array of ten random integers using a random number generator.
Output:
• the biggest number in the array;
• the sum of positive numbers;
• count the number of negative numbers.
• determine whether there are more negative or positive values in the array.
 If there are more negative values, output "There are more negative values in the array."
 Otherwise, output "There are more positive values in the array."
 If the counts are equal, output "There are an equal number of positive and negative values in the array. */

public class TaskThree {
    public static void main(String[] args) {
        Random rand = new Random();
        int lowerbound = -50;
        int upperbound = 51;
        int[] randArray = new int[10];

        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(upperbound - lowerbound) + lowerbound;
        }

        System.out.println("~The random array looks like: " + Arrays.toString(randArray));

        biggestNum(randArray);
        sumOfPosNum(randArray);
        numbOfNegative(randArray);
        posVsNeg(randArray);
    }

    private static void biggestNum(int[] randArray) {
        int biggest = randArray[0];
        for (int i = 1; i < randArray.length; i++) {
            if (randArray[i] > biggest) {
                biggest = randArray[i];
            }
        }
        System.out.println("~The biggest number in the array is: " + biggest);
    }

    private static void sumOfPosNum(int[] randArray) {
        int sum = 0;
        for (int k = 0; k < randArray.length; k++) {
            if (randArray[k] > 0) {
                sum += randArray[k];
            }
        }
        System.out.println("~The sum of positive numbers is " + sum);
    }

    private static void numbOfNegative(int[] randArray) {
        int neg = 0;
        for (int k = 0; k < randArray.length; k++) {
            if (randArray[k] < 0) {
                neg++;
            }
        }
        System.out.println("~The number of negative numbers is " + neg);
    }

    private static void posVsNeg(int[] randArray) {
        int neg = 0;
        int pos = 0;
        for (int k = 0; k < randArray.length; k++) {
            if (randArray[k] >= 0) {
                pos++;
            }
            if (randArray[k] <= 0) {
                neg++;
            }
        }
        if (pos > neg) {
            System.out.println("There are more positive numbers.");
        } else if (neg > pos) {
            System.out.println("There are more negative numbers.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}
