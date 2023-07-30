package practicals.p4.task3;

public enum Continent {
    ANTARCTICA("Antarctica"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    EUROPE("Europe"),
    AFRICA("Africa"),
    ASIA("Asia"),
    OCEANIA("Oceania");

    private final String name;

    Continent ( String name ) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return "Continent{" +
                "name='" + name + '\'' +
                '}';
    }
}
