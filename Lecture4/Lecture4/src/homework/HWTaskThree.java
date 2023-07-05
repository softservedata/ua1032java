package homework;


import java.util.Scanner;

/* Input a number representing an HTTP error (such as 400, 401, 402, etc.) and
   output the name of the error using an enum called HTTPError. */
import java.util.Scanner;

public class HWTaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Input a number representing an HTTP error (300, 400, or 500)");
            int error = scanner.nextInt();

            HTTPError httpError = findErrorName(error);
            if (httpError != null) {
                System.out.println("HTTP Error: " + httpError);
            } else {
                System.out.println("Invalid input. Please enter 300, 400, or 500.");
            }

            System.out.println("Do you want to enter another HTTP error? (Y/N)");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Y")) {
                continueLoop = false;
            }
        }

        scanner.close();
    }

    enum HTTPError {
        MULTIPLE_CHOICES_300, BAD_REQUEST_400, INTERNAL_SERVER_ERROR_500
    }

    private static HTTPError findErrorName(int error) {
        switch (error) {
            case 300:
                return HTTPError.MULTIPLE_CHOICES_300;
            case 400:
                return HTTPError.BAD_REQUEST_400;
            case 500:
                return HTTPError.INTERNAL_SERVER_ERROR_500;
            default:
                System.out.println("Input 300, 400 or 500 for HTTP Error.");
                return null;
        }
    }
}