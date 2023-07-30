package practicals.p11.task1;
/*
Input two String variables. Verify if the first variable is a substring of the second variable. For
instance, if you entered "SoftServe" and "SoftServe Academy", the expected result should be
true.

Введіть дві рядкові змінні. Перевірте, чи перша змінна є підрядком другої змінної.
Для наприклад, якщо ви ввели «SoftServe» і «SoftServe Academy», очікуваний результат має бути
правда.
 */

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class App {

    public static void main ( String[] args ) {
        String firstVariable = "SoftServe";
        String secondVariable = new String( "SoftServe Academy");

        System.out.println(secondVariable.contains( firstVariable ));

//        System.out.println(firstVariable.length());
//        System.out.println(firstVariable.substring( 4 ));
//        System.out.println(firstVariable.substring( 0, 5 ));
//        System.out.println(secondVariable.equals( firstVariable ));
//        System.out.println(firstVariable.getBytes( StandardCharsets.UTF_8 ));
//        System.out.println(firstVariable.getBytes(  ));
//        System.out.println(firstVariable.toLowerCase(  ));
//        System.out.println(firstVariable.toUpperCase());
//        System.out.println(firstVariable.hashCode());
//        System.out.println(firstVariable.concat( secondVariable ));

    }



}
