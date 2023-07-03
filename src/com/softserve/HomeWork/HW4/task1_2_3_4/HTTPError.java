package com.softserve.HomeWork.HW4.task1_2_3_4;

public enum HTTPError {
    ERROR_400(400, "400"),
    ERROR_401(401, "401"),
    ERROR_402(402, "402");
    private int code;
    private String nameError;

    HTTPError(int code, String nameError){
        this.code = code;
        this.nameError = nameError;
    }

    public int getCode() {
        return code;
    }

    public String getNameError() {
        return nameError;
    }

    @Override
    public String toString() {
        return "HTTPError{" +
                "code=" + code +
                ", nameError='" + nameError + '\'' +
                '}';
    }

    public static HTTPError getErrorByCode(int code) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getCode() == code) {
                return error;
            }
        }
        return null;
    }
}
