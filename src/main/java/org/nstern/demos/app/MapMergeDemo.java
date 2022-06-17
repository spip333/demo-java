package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.util.HashMap;
import java.util.Map;

import org.nstern.demos.dto.Book;
import org.nstern.demos.dto.BookType;
import org.nstern.demos.dto.Car;
import org.nstern.demos.util.H;

public class MapMergeDemo {

    public static void main(String[] args) {

        // create an HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        int returnedValue = prices.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Price of Shirt: " + returnedValue);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);

        //-------------------------

        Map<Integer, Book> map1 = new HashMap<>();
        map1.put(1, new Book.BookBuilder().withTitle("Catcher in the rhye.").build());
        map1.put(2, new Book.BookBuilder().withTitle("To kill a Mockingbird.").build());

        Map<Integer, Book> map2 = new HashMap<>();
        map2.put(3, new Book.BookBuilder().withTitle("Fahrenheit 451.").build());
        map2.put(4, new Book.BookBuilder().withTitle("Sapiens").build());

        System.out.println("map 1 (before): ");
        map1.forEach((key, value) -> System.out.print(key + ":" + value.getTitle()));
        System.out.println();
        System.out.println("map 2 (before): ");
        map2.forEach((key, value) -> System.out.print(key + ":" + value.getTitle()));

        System.out.println();

        map2.forEach(
                (key, value) -> map1.merge(key, value, (v1, v2) -> new Book.BookBuilder().withTitle(v2.getTitle()).build())
        );

        System.out.println("map 1 (after): ");
        map1.forEach((key, value) -> System.out.print(key + ":" + value.getTitle()));
        System.out.println();
        System.out.println("map 2 (after): ");
        map2.forEach((key, value) -> System.out.print(key + ":" + value.getTitle()));
        System.out.println();

        //-------------------------

        Map<String, Car> carMap = new HashMap<>();
        carMap.put("chevrolet", new Car.Builder().withMark("Chevrolet").withModel("Camaro").withPrice(33333).build());
        carMap.put("ford", new Car.Builder().withMark("Ford").withModel("Mustang").withPrice(33444).build());

        p("" + carMap);

        carMap.merge("chevrolet", new Car.Builder().withMark("Chevrolet").withModel("Z28").withPrice(67888).build(),
                (c1, c2) -> c1.getPrice() > c2.getPrice() ? c1 : c2);
        p("" + carMap);


    }

}
