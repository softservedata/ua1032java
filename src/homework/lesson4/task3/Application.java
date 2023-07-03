package homework.lesson4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Application {
    public static void main(String[] args) throws IOException{
        int error;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input error code (400-410): ");
        error = Integer.parseInt(br.readLine());
        System.out.println("## ERROR_" + error + " : " +  HTTPError.getErrorName(error) + " ##");
    }
}
