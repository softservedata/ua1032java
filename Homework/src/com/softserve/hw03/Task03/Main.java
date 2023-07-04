package com.softserve.hw03.Task03;

import java.util.Scanner;

enum HTTPEror{
    BADREQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOTFOUND(404),
    UNTERNALSERVERERROR(500);

    private int numberOFError;

    private HTTPEror(int numberOFError) {
        this.numberOFError = numberOFError;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HTTPEror httperror = null;
        System.out.print("Enter the number of Error: ");
        int number = sc.nextInt();
        switch (number){
            case 400:
                httperror = HTTPEror.BADREQUEST;
                break;
            case 401:
                httperror = HTTPEror.UNAUTHORIZED;
                break;
            case 403:
                httperror = HTTPEror.FORBIDDEN;
                break;
            case 404:
                httperror = HTTPEror.NOTFOUND;
                break;
            case 500:
                httperror = HTTPEror.UNTERNALSERVERERROR;
                break;
            default:
                System.out.println("Number not found\n");
                throw new IllegalArgumentException("Error: Invalid Argument");
        }
        System.out.println("Error = " + httperror);
    }
}
