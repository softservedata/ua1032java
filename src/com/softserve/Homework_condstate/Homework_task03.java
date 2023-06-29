package com.softserve.Homework_condstate;
import java.util.Scanner;
public class Homework_task03 {
    enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented"),
        SERVICE_UNAVAILABLE(503, "Service Unavailable");

        private final int errorCode;
        private final String errorName;

        HTTPError(int errorCode, String errorName) {
            this.errorCode = errorCode;
            this.errorName = errorName;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public String getErrorName() {
            return errorName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the HTTP error code from the user
        System.out.print("Enter HTTP error code: ");
        int errorCode = scanner.nextInt();

        // Find the corresponding error name using the HTTPError enum
        String errorName = findErrorName(errorCode);

        // Output the error name
        if (errorName != null) {
            System.out.println("Error Name: " + errorName);
        } else {
            System.out.println("Invalid HTTP error code.");
        }

        scanner.close();
    }

    private static String findErrorName(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getErrorCode() == errorCode) {
                return error.getErrorName();
            }
        }
        return null;
    }
}
