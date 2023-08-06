package homeWork_11_String_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String pattern = "[$]\\d{1,}\\.\\d{2}\\b";
        String text = "sdsad  $1223.23$123123.1233213   $123123.12 $1212.333   $0.32";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        m.reset();
        while(m.find()){
            System.out.println(text.substring(m.start(),m.end()));
        }
    }
}
