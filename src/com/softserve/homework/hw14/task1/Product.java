package com.softserve.homework.hw14.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Product {
    public static final String PHONE_CATEGORY = "Phone";
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product () {
        manufactureCategory = "";
        dateOfManufacture = LocalDate.of ( 1, 1, 1 );
        price = 0.0;
    }

    public Product ( String manufactureCategory, LocalDate dateOfManufacture, double price ) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory () {
        return manufactureCategory;
    }

    public void setManufactureCategory ( String manufactureCategory ) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture () {
        return dateOfManufacture;
    }

    public void setDateOfManufacture ( LocalDate dateOfManufacture ) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Product product = (Product) o;
        return Double.compare ( product.price, price ) == 0 &&
                manufactureCategory.equals ( product.manufactureCategory ) &&
                dateOfManufacture.equals ( product.dateOfManufacture );
    }

    @Override
    public int hashCode () {
        return Objects.hash ( manufactureCategory, dateOfManufacture, price );
    }

    static class ByPrice implements Comparator<Product> {
        @Override
        public int compare ( Product o1, Product o2 ) {
            return (int) (o1.getPrice ( ) - o2.getPrice ( ));
        }
    }

    @Override
    public String toString () {
        return "\nProduct{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public static ArrayList<Product> base () {


        ArrayList<Product> list = new ArrayList<> ( );

        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2023, 1, 5 ), 1000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2020, 2, 5 ), 2000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2021, 3, 15 ), 3000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2015, 4, 13 ), 4000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2020, 5, 25 ), 5000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2020, 6, 5 ), 6000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2020, 7, 15 ), 7000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2020, 8, 5 ), 8000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2019, 9, 7 ), 9000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2009, 10, 25 ), 10000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2022, 11, 5 ), 11000.0 ) );
        list.add ( new Product ( Product.PHONE_CATEGORY, LocalDate.of ( 2022, 12, 15 ), 12000.0 ) );

        list.add ( new Product ( "PC", LocalDate.of ( 2020, 1, 5 ), 7000.0 ) );
        list.add ( new Product ( "PC", LocalDate.of ( 2021, 3, 15 ), 6000.0 ) );
        list.add ( new Product ( "PC", LocalDate.of ( 2022, 6, 25 ), 5000.0 ) );
        list.add ( new Product ( "PC", LocalDate.of ( 2023, 9, 30 ), 4000.0 ) );

        list.add ( new Product ( "LapTop", LocalDate.of ( 2020, 1, 4 ), 13000.0 ) );
        list.add ( new Product ( "LapTop", LocalDate.of ( 2021, 4, 8 ), 12000.0 ) );
        list.add ( new Product ( "LapTop", LocalDate.of ( 2022, 7, 16 ), 11000.0 ) );
        list.add ( new Product ( "LapTop", LocalDate.of ( 2023, 11, 24 ), 10000.0 ) );


        return list;
    }
}
