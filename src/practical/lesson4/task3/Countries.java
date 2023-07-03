package practical.lesson4.task3;

public enum Countries {
    ukraine("Europe"),
    germany("Europe"),
    france("Europe"),
    italy("Europe"),
    portugal("Europe"),
    poland("Europe"),
    spain("Europe"),
    china("Asia"),
    india("Asia"),
    vietnam("Asia"),
    kazakstan("Asia"),
    japan("Asia"),
    usa("North America"),
    canada("North America"),
    brazil("South America"),
    equador("South America"),
    chilli("South America"),
    madagaskar("Africa"),
    niger("Africa"),
    zimbabwe("Africa"),
    iraq("Africa"),
    iran("Africa");

    private String continent;
    Countries(String continent) {
        this.continent = continent;
    }
    public String getContinent() {
        return continent;
    }
}
