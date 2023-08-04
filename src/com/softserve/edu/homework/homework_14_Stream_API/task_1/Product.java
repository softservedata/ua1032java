package com.softserve.edu.homework.homework_14_Stream_API.task_1;

import java.time.LocalDate;

public class Product {
    private String category;
    private String date;
    private double price;

    public Product(String category, String date, double price) {
        this.category = category;
        this.date = date.replace(".", "-");
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[ Category : " + category + "; Date : " + date + "; Price : " + price + "$ ]";
    }

    public boolean phones_were_made_a_year_ago() {
        LocalDate dateNow = LocalDate.now();
        LocalDate datePhone = LocalDate.parse(getDate());
        return datePhone.isBefore(dateNow);
    }
}


