import java.util.Scanner;

public class ApplContinents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String countryName  = scanner.nextLine();

        CountriesAndContinents.Continent findContinent = CountriesAndContinents.getContinent(countryName);
        if (findContinent != null) {
            System.out.println("Continent: " + findContinent);
        } else {
            System.out.println("Continent not found");
        }
    }
}