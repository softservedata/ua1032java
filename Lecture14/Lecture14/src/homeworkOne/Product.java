package homeworkOne;

/* Create class Product with fields manufacture category, date of manufacture and price.
   Add all needed methods
 • Create list Product with 20 objects
 • Obtain a sorted by the price list of products belong to category Phone with
   price > 3000, and the date of manufacture was more than 1 year ago.
 • Realize method:
   static Optional<String> mostPopularName(Stream< Employee> employees) { return null; }
   For given a stream with objects of Employee class, return the optional, containing the most popular name.
   If this stream is empty, Optional.empty should be returned. */

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    private String category;
    private LocalDate date;
    private double price;

    public Product(String category, LocalDate date, double price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public static List<Product> productList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Phone", LocalDate.now().minusYears(1), 5000.0));
        productList.add(new Product("Headphones", LocalDate.now().minusYears(1), 120.0));
        productList.add(new Product("Keyboard", LocalDate.now(), 70.0));
        productList.add(new Product("Phone", LocalDate.now(), 750.0));
        productList.add(new Product("Headphones", LocalDate.now().minusMonths(6), 90.0));
        productList.add(new Product("Phone", LocalDate.now().minusMonths(14), 8000.0));
        productList.add(new Product("Keyboard", LocalDate.now().minusMonths(3), 60.0));
        productList.add(new Product("Phone", LocalDate.now().minusMonths(3), 6000.0));
        productList.add(new Product("Headphones", LocalDate.now().minusMonths(9), 100.0));
        productList.add(new Product("Keyboard", LocalDate.now().minusMonths(9), 50.0));
        productList.add(new Product("Phone", LocalDate.now().minusMonths(9), 7000.0));
        productList.add(new Product("Headphones", LocalDate.now().minusMonths(12), 110.0));
        productList.add(new Product("Keyboard", LocalDate.now().minusMonths(12), 55.0));
        productList.add(new Product("Phone", LocalDate.now().minusMonths(13), 6500.0));
        productList.add(new Product("Headphones", LocalDate.now().minusMonths(15), 105.0));
        productList.add(new Product("Keyboard", LocalDate.now().minusMonths(15), 53.0));
        productList.add(new Product("Phone", LocalDate.now().minusMonths(15), 7200.0));
        productList.add(new Product("Headphones", LocalDate.now().minusMonths(18), 9500.0));
        productList.add(new Product("Keyboard", LocalDate.now().minusMonths(18), 48.0));
        productList.add(new Product("Phone", LocalDate.now().minusMonths(18), 680.0));
        return productList;
    }

    public static List<Product> sortedPhones(List<Product> products) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        return products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDate().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .flatMap(employee -> employee.getNames().stream())
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostPopularEntry = nameCounts.entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue));

        return mostPopularEntry.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Product> productList = Product.productList();
        List<Product> sortedPhones = sortedPhones(productList);

        System.out.println("The sorted phones (price > 3000, and the date of manufacture was more than 1 year ago): ");
        sortedPhones.forEach(product -> System.out.println(product.getCategory() +
                " price: " + product.getPrice() +
                " date: " + product.getDate()));

        List<Employee> employees = new ArrayList<>();
        //employees.add(new Employee(Arrays.asList("Iryna")));
        //employees.add(new Employee(Arrays.asList("Roman")));
        //employees.add(new Employee(Arrays.asList("Roman")));

        Stream<Employee> employeeStream = employees.stream();
        Optional<String> mostPopularName = mostPopularName(employeeStream);

        if (mostPopularName.isPresent()) {
            System.out.println("The most popular name is: " + mostPopularName.get());
        } else {
            System.out.println("There are no employees.");
        }
    }
}
