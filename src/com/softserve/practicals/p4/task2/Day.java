package com.softserve.practicals.p4.task2;

public enum Day {
    MONDAY("Monday", "��������"),
    TUESDAY("Tuesday", "³������"),
    WEDNESDAY("Wednesday", "������"),
    THURSDAY("Thursday", "������"),
    FRIDAY("Friday", "�'������"),
    SATURDAY("Saturday", "������"),
    SUNDAY("Sunday", "�����");

    private String englishName;
    private String ukrainianName;

    Day(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getUkrainianName() {
        return ukrainianName;
    }

    public void setEnglishName ( String englishName ) {
        this.englishName = englishName;
    }

    public void setUkrainianName ( String ukrainianName ) {
        this.ukrainianName = ukrainianName;
    }

    @Override
    public String toString () {
        return "Day{" +
                "englishName='" + englishName + '\'' +
                ", ukrainianName='" + ukrainianName + '\'' +
                '}';
    }
}
