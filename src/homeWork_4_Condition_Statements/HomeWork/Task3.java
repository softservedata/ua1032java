package homeWork_4_Condition_Statements.HomeWork;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input HTTPError code :");
        int codeOfError = sc.nextInt();
        for(HTTPError httpError : HTTPError.values()){
            if (httpError.getTitle() == codeOfError){
            System.out.println(httpError);
            }

        }
        sc.close();





    }
}
