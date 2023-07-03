package practical.lesson4.task2;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
public class Appl{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What weekday do you want to translate : ");
        String inputWeekday = br.readLine().toLowerCase();
        switch (inputWeekday){
            case "monday":
                System.out.println(Weekday.monday.getToUkranian());
                break;
            case "tuesday":
                System.out.println(Weekday.tuesday.getToUkranian());
                break;
            case "wednesday":
                System.out.println(Weekday.wednesday.getToUkranian());
                break;
            case "thursday":
                System.out.println(Weekday.thursday.getToUkranian());
                break;
            case "friday":
                System.out.println(Weekday.friday.getToUkranian());
                break;
            case "saturday":
                System.out.println(Weekday.saturday.getToUkranian());
                break;
            case "sunday":
                System.out.println(Weekday.sunday.getToUkranian());
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
