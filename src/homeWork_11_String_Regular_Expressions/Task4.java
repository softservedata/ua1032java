package homeWork_11_String_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Input your first name and last name: ");
        String str = sc.nextLine();
        String pattern = "[a-zA-Z-]+[ ][a-zA-Z-]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        boolean result = m.matches();
        m.reset();
        int i = 100;
        while(!result && i>0){
            System.out.println("Wrong input! Try one more time:");
            str= sc.nextLine();
            result= p.matcher(str).matches();
            i--;
        }
        List<String> array = new ArrayList<>();
        array.add("Hello , "+str+"!");
        array.add("How are you , " + str+"?");
        array.add("Hi , "+ str+"!");
        array.add("Good day , "+str+"!");
        Random r = new Random();
        int k = r.nextInt(0,4);
        System.out.println(array.get(k));


    }
}
