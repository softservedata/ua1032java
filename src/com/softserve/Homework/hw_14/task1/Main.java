package com.softserve.Homework.hw_14.task1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", LocalDate.of(2020, 1, 1), 900.5));
        products.add(new Product("TV", LocalDate.of(2019, 2, 2), 1500));
        products.add(new Product("TV", LocalDate.of(2018, 3, 3), 1000));
        products.add(new Product("Phone", LocalDate.of(2017, 4, 4), 250));
        products.add(new Product("Laptop", LocalDate.of(2016, 5, 5), 300));
        products.add(new Product("Phone", LocalDate.of(2015, 6, 6), 350));
        products.add(new Product("Phone", LocalDate.of(2014, 7, 7), 450));
        products.add(new Product("Headphones", LocalDate.of(2013, 8, 8), 550));
        products.add(new Product("Phone", LocalDate.of(2012, 9, 9), 650));
        products.add(new Product("Fridge", LocalDate.of(2011, 10, 10), 750));
        products.add(new Product("Phone", LocalDate.of(2010, 11, 11), 850));
        products.add(new Product("Camera", LocalDate.of(2009, 12, 12), 950));
        products.add(new Product("Iron", LocalDate.of(2008, 1, 13), 1050));
        products.add(new Product("Drone", LocalDate.of(2007, 2, 14), 1150));
        products.add(new Product("Guitar", LocalDate.of(2006, 3, 15), 1250));
        products.add(new Product("Webcam", LocalDate.of(2005, 4, 16), 1350));
        products.add(new Product("Ceiling Fan", LocalDate.of(2004, 5, 17), 1450));
        products.add(new Product("Mouse", LocalDate.of(2003, 6, 18), 1550));
        products.add(new Product("Speakers", LocalDate.of(2002, 7, 19), 1650));
        products.add(new Product("Phone", LocalDate.of(2001, 8, 20), 1750));
        products.add(new Product("Smartwatch", LocalDate.of(2000, 9, 21), 1850));
        List<Product> sortedProducts = products.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());
    }
}