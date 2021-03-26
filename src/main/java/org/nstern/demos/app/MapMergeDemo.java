package org.nstern.demos.app;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.RowFilter;

import org.nstern.demos.dto.Book;
import org.nstern.demos.dto.BookType;
import org.nstern.demos.dto.Item;
import org.nstern.demos.dto.ItemType;

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
    }
}

        /*
        Map<BookType, Book> map1 = createMap1();
        Map<BookType, Book> map2 = createMap2();

        Map<BookType, Book> map3 = map2.merge(key, value, (v1, v2)-> new Book.BookBuilder().withTitle(v1.getTitle()).build());


        System.out.println(map3);
    }

    private static Map<BookType, Book> createMap1() {
        Map<BookType, Book> map = new HashMap<>();
        map.put(BookType.NOVEL, new Book.BookBuilder().withTitle("Catcher in the Rhye").build());
        map.put(BookType.NOVEL, new Book.BookBuilder().withTitle("To Kill a Mockinbird").build());
        return map;
    }

    private static Map<BookType, Book> createMap2() {
        Map<BookType, Book> map = new HashMap<>();
        map.put(BookType.SCIFI, new Book.BookBuilder().withTitle("A Space Odyssey").build());
        map.put(BookType.SCIFI, new Book.BookBuilder().withTitle("Fahrenheit 451  ").build());
        return map;
    }
}
*/