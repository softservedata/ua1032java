import java.util.Scanner;

public class ApplErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input error code: ");
        int errorCode = scanner.nextInt();

        Errors.HTTPError httpError = getErrorType(errorCode);
        if(httpError != null) {
            System.out.println("Error: " + httpError);
        } else {
            System.out.println("Error not found");
        }
    }
    public static Errors.HTTPError getErrorType(int errorCode){
        switch (errorCode){
            case 400:
                return Errors.HTTPError.BAD_REQUEST;
            case 403:
                return Errors.HTTPError.FORBIDDEN;
            case 404:
                return Errors.HTTPError.NOT_FOUND;
            default:
                return null;
        }
    }
}