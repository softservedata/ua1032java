package com.softserve.Homework.hw_4.Task3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_ALLOWED(405, "Method Not Allowed");

        private final int code;
        private final String description;

        HTTPError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public static String getErrorDescription(int code) {
            for (HTTPError error : values()) {
                if (error.code == code) {
                    return error.description;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an HTTP error code: ");
        int errorCode = Integer.parseInt(reader.readLine());

        String errorDescription = HTTPError.getErrorDescription(errorCode);
        if (errorDescription != null) {
            System.out.println(errorDescription);
        } else {
            System.out.println("Unknown error code");
        }
    }
}
