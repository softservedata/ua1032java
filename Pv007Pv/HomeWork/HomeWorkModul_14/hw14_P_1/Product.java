package HomeWorkModul_14.hw14_P_1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 1. Create class Product with fields manufacture category, date of manufacture and price. Add all
 needed methods
 • Create list Product with 20 objects
 • Obtain a sorted by the price list of products belong to category Phone with
 price > 3000, and the date of manufacture was more then 1 year ago.
 • Realize method
 static Optional<String> mostPopularName(Stream< Employee> employees) {
 return null; }
 */


public class Product {
    private String manufacturer; // Manufacturer
    private String category; // Category
    private LocalDate manufactureDate; // Manufacturing Date
    private double price; // Price

    // Product class constructor
    public Product(String manufacturer, String category, int day, int month, int year, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.manufactureDate = LocalDate.of(year, month, day);
        this.price = price;
    }

    // Getters and setters for Product class fields
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overridden toString() method for displaying information about the Product object
    @Override
    public String toString() {
        return "Product{" +
                "manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }

    // Method for finding the most popular manufacturer among filtered products
    static Optional<String> mostPopularName(Stream<Product> products) {
        // Group products by manufacturer and count the number of products for each manufacturer
        Map<String, Long> manufacturerCountMap = products
                .collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));

        // Find the maximum count of products
        OptionalLong maxCount = manufacturerCountMap.values().stream().mapToLong(Long::longValue).max();

        // Find the manufacturer(s) with the maximum count of products
        Set<String> mostPopularManufacturers = manufacturerCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount.orElse(0L))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        // If there is at least one most popular manufacturer, return its name
        return mostPopularManufacturers.stream().findFirst();
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Add product objects to the list
        products.add(new Product("Samsung", "TVs", 2, 6, 2023, 2999.99));
        products.add(new Product("LG", "TVs", 15, 5, 2023, 3199.99));
        products.add(new Product("Bosch", "Refrigerators", 20, 4, 2021, 2899.99));
        products.add(new Product("Whirlpool", "Refrigerators", 10, 8, 2023, 3099.99));
        products.add(new Product("Sony", "Audio Equipment", 5, 7, 2022, 2799.99));
        products.add(new Product("JBL", "Audio Equipment", 12, 9, 2021, 2999.99));
        products.add(new Product("Dyson", "Vacuum Cleaners", 25, 11, 2022, 3199.99));
        products.add(new Product("Miele", "Vacuum Cleaners", 19, 10, 2023, 2999.99));
        products.add(new Product("Apple", "Laptops", 8, 3, 2022, 3299.99));
        products.add(new Product("Lenovo", "Laptops", 6, 2, 2023, 2999.99));
        products.add(new Product("Panasonic", "Microwaves", 1, 12, 2021, 2799.99));
        products.add(new Product("LG", "Microwaves", 17, 1, 2023, 3099.99));
        products.add(new Product("Philips", "Coffee Makers", 14, 7, 2022, 3199.99));
        products.add(new Product("Braun", "Coffee Makers", 11, 5, 2021, 2999.99));
        products.add(new Product("Xiaomi", "Smartphones", 28, 3, 2022, 5899.99));
        products.add(new Product("Samsung", "Smartphones", 22, 6, 2023, 3199.99));
        products.add(new Product("Samsung", "Stoves", 9, 8, 2021, 3299.99));
        products.add(new Product("Siemens", "Stoves", 7, 10, 2023, 2999.99));
        products.add(new Product("Dell", "Monitors", 4, 12, 2022, 2799.99));
        products.add(new Product("Acer", "Monitors", 3, 9, 2021, 3099.99));

        // Filter the list of products based on specified conditions (category "Smartphones", price greater than 3000, and manufacturing date more than 1 year ago)
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getCategory().equals("Smartphones"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed()) // Sort by price in descending order
                .collect(Collectors.toList());

        // Display the filtered and sorted list on the screen
        for (Product product : filteredProducts) {
            System.out.println(product);
        }

        // Find the most popular manufacturer among all objects
        Optional<String> mostPopularManufacturer = mostPopularName(products.stream());
        if (mostPopularManufacturer.isPresent()) {
            System.out.println("Most popular manufacturer: " + mostPopularManufacturer.get());
        } else {
            System.out.println("No most popular manufacturer.");
        }
    }
}