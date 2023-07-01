import java.util.Scanner;

class ApplSmallest{
    public static void main(String[]args){

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Input first number: ");
        secondNumber = scanner.nextInt();

        System.out.print("Input first number: ");
        thirdNumber = scanner.nextInt();

        Numbers numbers1 = new Numbers(firstNumber, secondNumber,thirdNumber);
        System.out.println("The smallest number is: " + Numbers.findSmallestNumber(numbers1));
        }
    }