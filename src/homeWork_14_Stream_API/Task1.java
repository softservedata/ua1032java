package homeWork_14_Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Product> listOfProduct = new ArrayList<>();
        listOfProduct.add(new Product(1000,"Tools", 2013));
        listOfProduct.add(new Product(3010,"Phone", 2022));
        listOfProduct.add(new Product(4000,"Tools", 2008));
        listOfProduct.add(new Product(7000,"Tools", 2008));
        listOfProduct.add(new Product(5000,"Phone", 2008));
        listOfProduct.add(new Product(8000,"Phone", 2023));
        listOfProduct.add(new Product(1000,"Tools", 2008));
        listOfProduct.add(new Product(20000,"Phone", 2021));
        listOfProduct.add(new Product(3000,"Tools", 2008));
        listOfProduct.add(new Product(1400,"Tools", 2008));
        listOfProduct.add(new Product(1300,"Tools", 2008));
        listOfProduct.add(new Product(1900,"Tools", 2008));
        listOfProduct.add(new Product(1400,"Tools", 2008));
        listOfProduct.add(new Product(15000,"Phone", 2022));
        listOfProduct.add(new Product(6000,"Tools", 2008));
        listOfProduct.add(new Product(9000,"Tools", 2008));
        listOfProduct.add(new Product(14000,"Tools", 2008));
        listOfProduct.add(new Product(1300,"Tools", 2022));
        listOfProduct.add(new Product(10000,"Tools", 2021));
        listOfProduct.add(new Product(10050,"Phone", 2022));
        List<Product> sortedListOfproduct = listOfProduct.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice()>3000)
                .filter(product -> product.getDateOfManufacture()<2023)
                .sorted((product1,product2) -> Integer.compare(product1.getPrice(),product2.getPrice()))
                .collect(Collectors.toList());

        for (Product p:
             sortedListOfproduct) {
            System.out.println(p);
        }
    }
}
