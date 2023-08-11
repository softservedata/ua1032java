package homework.product;

import homework.product.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> productList = initProductList();
        System.out.println("\n\t Original list:");
        productList.forEach(System.out::println);


        LocalDate localDate = LocalDate.now().minusYears(1);
        List<Product> filteredProducts = productList.stream().filter(product -> product.getCategory().equals("Phone")).filter(product -> product.getPrice() > 3000).filter(product -> product.getDateOfManufacture().isBefore(localDate)).sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toList());

        System.out.println("\n\t Filtered products: ");
        filteredProducts.forEach(System.out::println);


        Stream<Product> productStream = productList.stream();

        Optional<String> mostPopularCategory = mostPopularCategory(productStream);

        mostPopularCategory.ifPresent(category -> System.out.println("\n \tMost popular category: " + category));


    }

    public static Optional<String> mostPopularCategory(Stream<Product> products) {
        Map<String, Long> categoryCountMap = products.collect(Collectors.groupingBy(Product::getCategory,
                Collectors.counting()));

        return categoryCountMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }


    public static List<Product> initProductList() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Phone", LocalDate.of(2022, 6, 15), 3500));
        productList.add(new Product("Laptop", LocalDate.of(2023, 1, 5), 3100));
        productList.add(new Product("Tablet", LocalDate.of(2020, 10, 25), 3600));
        productList.add(new Product("Camera", LocalDate.of(2021, 9, 30), 4400));
        productList.add(new Product("TV", LocalDate.of(2022, 12, 22), 2800));

        productList.add(new Product("Watch", LocalDate.of(2023, 4, 18), 3000));
        productList.add(new Product("Headphones", LocalDate.of(2020, 6, 12), 3800));
        productList.add(new Product("Phone", LocalDate.of(2021, 8, 27), 4000));
        productList.add(new Product("Laptop", LocalDate.of(2022, 11, 20), 3300));
        productList.add(new Product("Tablet", LocalDate.of(2023, 2, 15), 2900));

        productList.add(new Product("Camera", LocalDate.of(2020, 5, 5), 3900));
        productList.add(new Product("TV", LocalDate.of(2021, 4, 2), 4300));
        productList.add(new Product("Watch", LocalDate.of(2022, 8, 8), 3400));
        productList.add(new Product("Headphones", LocalDate.of(2023, 5, 25), 3100));
        productList.add(new Product("Phone", LocalDate.of(2020, 4, 10), 4200));

        productList.add(new Product("Laptop", LocalDate.of(2021, 3, 8), 3800));
        productList.add(new Product("Tablet", LocalDate.of(2022, 7, 17), 4100));
        productList.add(new Product("Camera", LocalDate.of(2023, 3, 10), 3200));
        productList.add(new Product("TV", LocalDate.of(2020, 11, 15), 3700));
        productList.add(new Product("Watch", LocalDate.of(2021, 10, 20), 4200));

        return productList;

    }

}