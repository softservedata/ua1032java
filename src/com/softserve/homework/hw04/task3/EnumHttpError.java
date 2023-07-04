package com.softserve.homework.hw04.task3;
/*
Input a number representing an HTTP error (such as 400, 401, 402, etc.)
and output the name of the error using an enum called HTTPError.
 */

import java.util.Scanner;

public class EnumHttpError {
    public enum HTTPError {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required");

        private final String name;
        HTTPError ( String name ) {
            this.name = name;
        }
        public String getName () {
            return name;
        }
    }

    public static void main(String[] args) throws IllegalStateException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the HTTP error code: ");
        int errorCode = sc.nextInt();

        switch (errorCode) {
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 402:
                System.out.println("Payment Required");
                break;
            default:
                System.out.println("Unknown error");
        }
        sc.close();
    }
}