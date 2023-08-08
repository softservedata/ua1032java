package homeworktasks;

import java.util.Scanner;

public class HomeTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        firstHomeworkTasks(scanner);
        secondHomeworkTasks(scanner);

    }


    public static void firstHomeworkTasks(Scanner scanner) {
        try {
            System.out.println("Enter first number");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed!");
            } else {
                double result = num1 / num2;
                System.out.println("Result of division: " + result);
            }

        } catch (NumberFormatException e) {
            System.err.println("Invalid input! Please enter valid double numbers.");
        } catch (Exception e) {
            System.err.println("Other exception: " + e.getMessage());
        }
    }


    public static void secondHomeworkTasks(Scanner scanner) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            try {
                numbers[i]=readNumber(start,end,scanner);
                start = numbers[i]+1;
            }catch (Exception e){
                System.err.println("Exception :"+e.getMessage());
                i--;
            }
        }
    }

    public static int readNumber(int start, int end, Scanner scanner) throws Exception {
        System.out.printf("Enter number in range between %d and %d\n", start, end);
        int number ;
        try {
             number = scanner.nextInt();
        }catch (NumberFormatException formatException){
            throw new Exception("Invalid input. Please try again");
        }catch (Exception e){
            throw new Exception("Exception:" +e.getMessage());
        }
        if (number < start || number > end) {
            throw new Exception("The number is out of range. Enter number in range between "+ start+  " and " +end);
        }
        return number;
    }


}
