package homeWork_11_String_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sentences of five or more worlds:");
        String str = sc.nextLine();
        List<String> listOfStr = new ArrayList<>(List.of(str.split(" ")));
        System.out.println(listOfStr);
        int max = listOfStr.get(0).length();
        for (String st:
             listOfStr) {
            if(st.length()>max){
                max=st.length();
            }
        }
        for (String st:
                listOfStr) {
            if(st.length() == max){
                System.out.println("longest word is:");
                System.out.println(st);
                System.out.println("it has "+st.length()+" letters");
            }
        }
       StringBuilder sb = new StringBuilder(listOfStr.get(1));
        System.out.println(sb.reverse().toString());
       sc.close();



    }
}
