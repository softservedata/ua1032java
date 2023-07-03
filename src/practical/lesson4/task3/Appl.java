package practical.lesson4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What country's continent do You want to know: ");
        String inputCountry = br.readLine().toLowerCase();

        switch (inputCountry) {
            case "ukraine":
                System.out.println(Countries.ukraine.getContinent());
                break;
            case "germany":
                System.out.println(Countries.germany.getContinent());
                break;
            case "france":
                System.out.println(Countries.france.getContinent());
                break;
            case "italy":
                System.out.println(Countries.italy.getContinent());
                break;
            case "portugal":
                System.out.println(Countries.portugal.getContinent());
                break;
            case "poland":
                System.out.println(Countries.poland.getContinent());
                break;
            case "spain":
                System.out.println(Countries.spain.getContinent());
                break;
            case "china":
                System.out.println(Countries.china.getContinent());
                break;
            case "india":
                System.out.println(Countries.india.getContinent());
                break;
            case "vietnam":
                System.out.println(Countries.vietnam.getContinent());
                break;
            case "kazakstan":
                System.out.println(Countries.kazakstan.getContinent());
                break;
            case "japan":
                System.out.println(Countries.japan.getContinent());
                break;
            case "usa":
                System.out.println(Countries.usa.getContinent());
                break;
            case "canada":
                System.out.println(Countries.canada.getContinent());
                break;
            case "brazil":
                System.out.println(Countries.brazil.getContinent());
                break;
            case "equador":
                System.out.println(Countries.equador.getContinent());
                break;
            case "chilli":
                System.out.println(Countries.chilli.getContinent());
                break;
            case "madagaskar":
                System.out.println(Countries.madagaskar.getContinent());
                break;
            case "niger":
                System.out.println(Countries.niger.getContinent());
                break;
            case "zimbabwe":
                System.out.println(Countries.zimbabwe.getContinent());
                break;
            case "iraq":
                System.out.println(Countries.iraq.getContinent());
                break;
            case "iran":
                System.out.println(Countries.iran.getContinent());
                break;
            default:
                System.out.println("ERROR");
                break;
        }

    }
}
