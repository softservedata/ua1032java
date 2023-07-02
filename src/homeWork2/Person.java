package homeWork2;
import java.time.Year;


public class Person {
    private  String firstName;
    private  String lasttName;
    private   int birthYear;



    public Person() {
    }

    public Person(String firstName, String lasttName) {
        this.firstName = firstName;
        this.lasttName = lasttName;
    }

    public Person(String firstName, String lasttName, int birthYear) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }



    public String getLasttName() {
        return lasttName;
    }





    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge (){
        return Year.now().getValue() -  birthYear;
    }


    public void changeName ( String ln){
        this.lasttName = ln;
    }

    public void changeName (String fn, String ln){
        this.firstName = fn;
        this.lasttName = ln;
    }
    public void input (String fn, String ln, int year ){
        this.firstName = fn;
        this.lasttName = ln;
        this.birthYear = year;
    }
    public void output (){
        System.out.print(firstName);
        System.out.print("  " + lasttName);
        System.out.println("  "+birthYear);
    }

    @Override
    public String toString() {
        return "Person " +
                "firstName = '" + firstName + '\'' +
                ", lasttName = " + lasttName + '\'' +
                ", birthYear = " + birthYear +
                "}";
    }
}
