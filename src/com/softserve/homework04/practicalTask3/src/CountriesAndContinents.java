public class CountriesAndContinents {
    enum Continent {
        AFRICA,
        ASIA,
        EUROPE,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AUSTRALIA
    }
    public static Continent getContinent(String countryName){
        switch (countryName.toLowerCase()){
            case "nigeria":
            case "south africa":
                return Continent.AFRICA;
            case "japan":
            case "china":
                return Continent.ASIA;
            case "ukraine":
            case "france":
                return Continent.EUROPE;
            case "usa":
            case "canada":
                return Continent.NORTH_AMERICA;
            case "argentina":
            case "brazil":
                return Continent.SOUTH_AMERICA;
            case "australia":
                return Continent.AUSTRALIA;
            default:
                return null;

        }
    }
}