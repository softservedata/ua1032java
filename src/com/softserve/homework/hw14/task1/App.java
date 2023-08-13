package com.softserve.homework.hw14.task1;
/*
Create class Product with fields  manufacture category, date of manufacture and price.
Add all needed methods
Create list Product with 20 objects
Obtain a sorted by the price list of products belong to category Phone with price > 3000, and the date of manufacture was more then 1 year ago.
Realize method
	static Optional<String> mostPopularName(Stream< Employee> employees) {
         		return null;  }

Створіть клас Товар із полями категорія виробництва, дата виробництва та ціна.
Додайте всі необхідні методи
Створити список Продукт із 20 об’єктів
Отримайте відсортовані за прейскурантом товари, що належать до категорії Телефони з ціною > 3000, і датою виробництва більше 1 року тому.

 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main ( String[] args ) {
        ArrayList<Product> list = Product.base ( );
        System.out.println ( "\nBefore\n" + list );

        List<Product> res = list.stream ( )
                .sorted ( new Product.ByPrice ( ) )
                .filter ( el -> el.getPrice ( ) > 3000 )
                .filter ( el -> {
                    return LocalDate.now ( ).minusYears ( 1 ).compareTo ( el.getDateOfManufacture ( ) ) > 0;
                } )
                .filter ( el -> el.getManufactureCategory ( ).equals ( Product.PHONE_CATEGORY ) )
                .toList ( );

        System.out.println ( "\nAfter\n" + res );
    }
}

