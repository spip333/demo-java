package org.nstern.demos.util;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.nstern.demos.dto.Book;
import org.nstern.demos.dto.BookType;
import org.nstern.demos.dto.Car;

public class DataUtil {

    private DataUtil() {
    }

    public static List<Book> createSampleBookList() {

        return List.of(new Book.BookBuilder().withType(BookType.NOVEL).withTitle("Le joueur d'échec").build(),
                new Book.BookBuilder().withType(BookType.NOVEL).withTitle("Madame Bovary").build(),
                new Book.BookBuilder().withType(BookType.NOVEL).withTitle("Le rouge et le noir").build(),
                new Book.BookBuilder().withType(BookType.THRILLER).withTitle("Shining").build(),
                new Book.BookBuilder().withType(BookType.SCIFI).withTitle("2001, A Space Odyssey").build(),
                new Book.BookBuilder().withType(BookType.SCIFI).withTitle("L'homme invisible").build());

    }

    public static List<Car> createSampleCarList() {
        return Arrays.asList(new Car.Builder().withPrice(250000).withMark("Ferrari").withModel("gto").build(),
                new Car.Builder().withPrice(30000).withMark("Ford").withModel("cmax").build(),
                new Car.Builder().withPrice(40000).withMark("Ford").withModel("smax").build(),
                new Car.Builder().withPrice(30000).withMark("Toyota").withModel("prius").build());
    }

    public static List<String> createListOfNames() {
        return asList("pierre", "jacques", "jean");
    }


}

