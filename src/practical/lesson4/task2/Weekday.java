package practical.lesson4.task2;

public enum Weekday {
    monday("Понеділок"),
    tuesday("Вівторок"),
    wednesday("Середа"),
    thursday("Четвер"),
    friday("Пʼятниця"),
    saturday("Субота"),
    sunday("Неділя");
    private String toUkranian;

    Weekday(String toUkranian) {
        this.toUkranian = toUkranian;
    }

    public String getToUkranian() {
        return toUkranian;
    }
}
