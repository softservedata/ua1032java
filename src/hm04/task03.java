package hm04;

import java.util.Scanner;

public class task03 {

    public enum HTTPError {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required"),
        ERROR_403("Forbidden"),
        ERROR_404("Not Found");

        private final String name;

        HTTPError(String name){
            this.name=name;
        }

    public String getName() {
            return name;
    }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the HTTP error code:");
        int errorCode= scanner.nextInt();

        HTTPError error= findError(errorCode);
        if (error !=null) {
            System.out.println("Error name:" + error.getName());
        }else{
            System.out.println("Unknow error");
        }
    }
    private static HTTPError findError(int errorCode){
        for (HTTPError error : HTTPError.values()){
            if (error.name().equalsIgnoreCase("ERROR_" + errorCode)){
                return error;
            }
        }
        return null;
    }
}
