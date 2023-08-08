package hm14;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static class Product {
        private String name;
        private String category;
        private LocalDate manufactureDate;
        private double price;

        public Product(String name, String category, LocalDate manufactureDate, double price) {
            this.name = name;
            this.category = category;
            this.manufactureDate = manufactureDate;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public LocalDate getManufactureDate() {
            return manufactureDate;
        }

        public double getPrice() {
            return price;
        }

        public boolean isPhone() {
            return category.equals("Phone");
        }

        public boolean isPriceOver3000() {
            return price > 3000;
        }

        public boolean isManufacturedOverYearAgo() {
            return manufactureDate.isBefore(LocalDate.now().minusYears(1));
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        List<Product> sortedProducts = products.stream()
                .filter(Product::isPhone)
                .filter(Product::isPriceOver3000)
                .filter(Product::isManufacturedOverYearAgo)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Sorted products by categories Phone with a price of more than 3000 and manufactured more than a year ago:");
        sortedProducts.forEach(product ->
                System.out.println(product.getName() + " - " + product.getPrice()));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return null;
    }

    public static class Employee {
    }
}
