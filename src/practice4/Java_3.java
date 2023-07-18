package practice4;


import java.util.Scanner;

public class Java_3 {

    enum Continents {
        Asia , North_America, South_America, Europe
    }

    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Write name of the country : ");
        String country = scan.next();

        Continents contin = Continents.Asia;

        switch (country) {
            case "Ukraine": contin = Continents.Europe;
                break;
            case "Poland": contin = Continents.Europe;
                break;
            case "Germany": contin = Continents.Europe;
                break;
            case "France": contin = Continents.Europe;
                break;
            case "China": contin = Continents.Asia;
                break;
            case "Thailand": contin = Continents.Asia;
                break;
            case "Argentina": contin = Continents.South_America;
                break;
            case "Brasil": contin = Continents.South_America;
                break;
            case "USA": contin = Continents.North_America;
                break;
            case "Canada": contin = Continents.North_America;
                break;
            default: System.out.println("Incorrect input");
        }

        System.out.println("Continent of this country is : " + contin);

    }
}
