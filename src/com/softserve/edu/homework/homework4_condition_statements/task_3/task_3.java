package com.softserve.edu.homework.homework4_condition_statements.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_3 {
    public enum HTTPError {
        ERROR_400(400, "Bad Request"),
        ERROR_401(401, "Unauthorized"),
        ERROR_402(402, "Payment Required"),
        ERROR_403(403,"Forbidden"),
        ERROR_404(404,"Not Found"),
        ERROR_505(505, "Version not supported"),
        ERROR_507(507,"Insufficient Storage");

        private final int errorCode;
        private final String errorName;

        HTTPError(int errorCode , String errorName){
            this.errorCode = errorCode;
            this.errorName = errorName;
        }

        public static String getErrorName(int errorCode){
        for (HTTPError error : HTTPError.values()){
            if (error.errorCode == errorCode){
                return error.errorName;
            }
        }
        return "Unknown Error";
        }
    }
    public static void main (String[]args)throws IOException {
        BufferedReader error = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the error number : ");
        int errorCode = Integer.parseInt(error.readLine());

        String errorName = HTTPError.getErrorName(errorCode);
        if (errorName != null){
            System.out.println(errorName);
        }
        else {System.out.println("Unknown Error");}
    }
    }