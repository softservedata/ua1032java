import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class practical {
    public static void main(String[] args) {
        LocalDate localDateTime = LocalDate.now();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("Today is " + dayOfWeek.toString().toLowerCase());

        Month month = localDateTime.getMonth();
        System.out.println("Month is " + month.toString().toLowerCase());


        List<String> sortedList = new ArrayList<>();
        sortedList.add("banana");
        sortedList.add("apple");
        sortedList.add("grape");
        sortedList.add("orange");

        sortedList.sort(Comparator.naturalOrder());
        for (var srt : sortedList) {
            System.out.println(srt);
        }

    }
}
