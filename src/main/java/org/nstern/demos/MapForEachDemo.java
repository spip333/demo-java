package org.nstern.demos;

import java.util.HashMap;
import java.util.Map;

import org.nstern.demos.dto.Book;
import org.nstern.demos.dto.BookType;
import org.nstern.demos.dto.Item;
import org.nstern.demos.dto.ItemType;

public class MapForEachDemo {

    public static void main(String[] args) {

        iterateMapUsingLambda();
        System.out.println("--------");
        iterateMapUsingStream();
        System.out.println("--------");
        justIterate();
    }

    private static void iterateMapUsingLambda() {
        Map<BookType, Book> map = createMap();

        Map<BookType, String> newMap = new HashMap<>();

        map.forEach((type, book) -> {
            newMap.put(type, book.getTitle());
        });

        System.out.println(newMap);
    }

    private static void iterateMapUsingStream() {
        Map<BookType, Book> map = createMap();

        Map<BookType, String> newMap = new HashMap<>();

        map.entrySet().stream().forEach(entry -> newMap.put(entry.getKey(), entry.getValue().getTitle()));

        System.out.println(newMap);
    }

    private static void justIterate() {
        Map<BookType, Book> map = createMap();

        Map<BookType, Item> newMap = new HashMap<>();

        map.entrySet().stream().forEach(entry -> {
            Item item = new Item.ItemBuilder().withType(ItemType.BOOK).withName(entry.getValue().getAuthor()).build();
            newMap.put(entry.getKey(), item);
        });

        System.out.println(newMap);
    }

    private static Map<BookType, Book> createMap() {
        Map<BookType, Book> map = new HashMap<>();
        map.put(BookType.NOVEL, new Book.BookBuilder().withTitle("Titanic").build());
        map.put(BookType.THRILLER, new Book.BookBuilder().withTitle("The exorcist").build());
        map.put(BookType.ROMANCE, new Book.BookBuilder().withTitle("The Doctor's wife").build());
        map.put(BookType.SCIFI, new Book.BookBuilder().withTitle("A Space Odyssey").build());

        System.out.println(map);
        return map;
    }
}
