import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String birthYear;

    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }



    public int getAge(int yearOfBirth) {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;
        return age;

    }
    public void input(){
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        setFirstName(firstName);

        String lastName = scanner.nextLine();
        setLastName(lastName);

        String birthYear = scanner.nextLine();
        setBirthYear(birthYear);
scanner.close();
    }
}

