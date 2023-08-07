package homeworkTwo;


/* Create a method readNumber(int start, int end), that read from console integer number and return it,
   if it is in the range [start...end]. If an invalid number or non-number text is read,
   the method should throw an exception.
   Using this method write a method main(), that must enter 10 numbers:
   a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100. */

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[10];
        int start = 1;
        int end = 100;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            try {
                nums[i] = readNumber(start, end);
                start = nums[i] + 1;
            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
                i--;
            }
        }
        System.out.println("Entered numbers: " + Arrays.toString(nums));
    }
        public static int readNumber(int start, int end) throws Exception{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input an integer number [" + start + " - " + end + "]: ");
            int num;
            try {
                num = scanner.nextInt();
            } catch (NumberFormatException e) {
                throw new Exception("Input an integer number format please!!");
            } catch (Exception e) {
                throw new Exception("Exception regarding " + e.getMessage());
            } finally {
                scanner.nextLine();
            }
            if (num < start || num > end) {
                throw new Exception("Inputted number is out of range. You should enter a number between " + start + " and " + end + ".");
            }
            return num;
        }
    }