package com.softserve.lesson04.hw04.task03;

public enum HTTPError {
    BAD_REQUEST("Bad Request", 400), UNAUTHORIZED("Unauthorized", 401),
    PAYMENT_REQUIRED("Payment Required", 402), FORBIDDEN("Forbidden", 403),
    NOT_FOUND("Not Found", 404), METHOD_NOT_ALLOWED("Method Not Allowed", 405),
    NOT_ACCEPTABLE("Not Acceptable", 406);

    private final String name;
    private final int code;

    HTTPError (String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static String determineNameOfError(int error) {
        switch (error) {
            case 400 -> {
                return BAD_REQUEST.name;
            }
            case 401 -> {
                return UNAUTHORIZED.name;
            }
            case 402 -> {
                return PAYMENT_REQUIRED.name;
            }
            case 403 -> {
                return FORBIDDEN.name;
            }
            case 404 -> {
                return NOT_FOUND.name;
            }
            case 405 -> {
                return METHOD_NOT_ALLOWED.name;
            }
            case 406 -> {
                return NOT_ACCEPTABLE.name;
            }
            default -> {
                System.out.println("Your number of error is out of error list");
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "HTTPError {" +
                "name= '" + name + '\'' +
                ", code= " + code +
                '}';
    }
}
