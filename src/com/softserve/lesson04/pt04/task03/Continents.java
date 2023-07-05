package com.softserve.lesson04.pt04.task03;

public enum Continents {
    NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, AFRICA, EURASIA, AUSTRALIA;

    public static Continents determineYourContinent(String country) {
        switch (country.toLowerCase()) {
            case "united states", "canada", "mexico" -> {
                return NORTH_AMERICA;
            }
            case "brazil", "argentina", "columbia" -> {
                return SOUTH_AMERICA;
            }
            case "egypt", "morocco", "ethiopia" -> {
                return AFRICA;
            }
            case "ukraine", "england", "poland" -> {
                return EURASIA;
            }
            case "australia", "papua new guinea" -> {
                return AUSTRALIA;
            }
            default -> {
                System.out.println("Your country is out of list/out of any continent");
                return null;
            }
        }
    }
}
