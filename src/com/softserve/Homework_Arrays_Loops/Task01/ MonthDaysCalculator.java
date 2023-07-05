import java.util.Scanner;

class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int month = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month >= 1 && month <= 12) {
            int days = daysInMonth[month - 1];
            System.out.println("Number of days in month " + month + ": " + days);
        } else {
            System.out.println("Invalid month number.");
        }
    }
}