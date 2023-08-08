package hm14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(manufactureCategory, product.manufactureCategory) &&
                Objects.equals(dateOfManufacture, product.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, dateOfManufacture, price);
    }

    @Override
    public String toString() {
        return "Product: " +
                "manufactureCategory= " + manufactureCategory +
                ", dateOfManufacture= " + dateOfManufacture +
                ", price= " + price + "\n";
    }

    public static List<Product> seekProductByPriceAndYears(List<Product> products) {
        return products.stream()
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getManufactureCategory().equalsIgnoreCase("Smartphone"))
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Product> createList() {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(new Product("Laptop",
                    LocalDate.now().minusYears(new Random().nextInt(5)),
                    new Random().nextDouble(2500.0, 4000.0)));
            result.add(new Product("Smartphone",
                    LocalDate.now().minusYears(new Random().nextInt(5)),
                    new Random().nextDouble(2500.0, 4000.0)));
        }
        return result;
    }
}

