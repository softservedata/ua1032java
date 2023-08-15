package com.softserve.edu01.hw14.task1;

import java.time.LocalDate;

public record Product(String category, int price, LocalDate dateOfManufacture) {

    public String toString() {
        return "Product: " +
                "category: " + category +
                ", price: " + price + "$" +
                ", dateOfManufacture: " + dateOfManufacture +
                "\n";
    }
}
