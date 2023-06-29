package com.softserve.homework.hw03.task4;
/*
Календарні пори року
У більшості країн Північної півкулі прийнято такі дати початку і кінця календарних пір року:
Весна — від 1 березня до 31 травня
Літо — від 1 червня до 31 серпня
Осінь — від 1 вересня до 30 листопада
Зима — від 1 грудня до 28 лютого (у високосні роки — до 29 лютого)
 */

public enum Season {
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn"),
    WINTER("Winter");

    private final String name;

    Season ( String name ) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return "Season{" +
                "name= '" + name + '\'' +
                '}';
    }
}



