package com.softserve.homework.hw04.task3;

import java.util.Scanner;

public class AppHTTPError {
    public static void main(String[] args) {
        HTTPError httpError;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of error: " );
        int error = sc.nextInt();
        switch (error) {
            case 500 -> System.out.println(httpError = HTTPError.INTERNAL_SERVER_ERROR_500);
            case 403 -> System.out.println(httpError = HTTPError.FORBIDDEN_403);
            case 404 -> System.out.println(httpError = HTTPError.NOT_FOUND_404);
            case 400 -> System.out.println(httpError = HTTPError.BAD_REQUEST_400);
            case 401 -> System.out.println(httpError = HTTPError.UNAUTHORIZED_401);
            default -> System.out.println("No such error!");
        }
    }
}
