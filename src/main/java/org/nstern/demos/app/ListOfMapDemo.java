package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.nstern.demos.dto.Car;

public class ListOfMapDemo {

    public static void main(String[] args) {

        Map<String, Car> map1 = Map.of(
                "Pierre", new Car.Builder().withMark("Tesla").build(),
                "Jaques", new Car.Builder().withMark("Ford").build()
        );

        Map<String, Car> map2 = Map.of(
                "Jean", new Car.Builder().withMark("Fiat").build(),
                "Lucien", new Car.Builder().withMark("Audi").build()
        );

        List<Map<String, Car>> list = List.of(map1, map2);

        p(""+list);
    }
}
