package com.softserve.hw.lesson4.task3;

public enum Error {
    ERROR_400, ERROR_401, ERROR_402;

    public String HTTPError() {
        if (this == Error.ERROR_400) return "Bad Request";
        if (this == Error.ERROR_401) return "Unauthorized";
        if (this == Error.ERROR_402) return "Payment Required";
        return null;
    }
}