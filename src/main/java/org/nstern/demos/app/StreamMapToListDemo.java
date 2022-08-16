package org.nstern.demos.app;

import static java.util.Arrays.asList;
import static org.nstern.demos.util.H.p;
import static org.nstern.demos.util.H.phead;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Car;

public class StreamMapToListDemo {

    public static void main(String[] args) {
        phead("Demo Stream map()");

        demo1();
        demo2();
        demo3();
    }

    private static void demo3() {
        phead("demo3");
        List<Car> list = createCarList();
        List<String> result = list.stream().map(Car::getMark).collect(Collectors.toList());
        p("" + result);
    }

    private static void demo2() {
        phead("demo2");
        List<String> list = createList();
        List<String> result = list.stream().map(m -> "-->" + m).collect(Collectors.toList());
        p("" + result);
    }

    private static void demo1() {
        phead("demo1");
        Map<String, List<Integer>> carMap = createMap();
        List<Integer> result = carMap.get("Ferrari").stream().map(n -> 2 * n).collect(Collectors.toList());
        p("" + result);
    }

    private static List<String> createList() {
        return asList("pierre", "jacques", "jean");
    }

    private static Map<String, List<Integer>> createMap() {
        return Map.of("Ferrari", asList(250, 280, 320), "Ford", asList(190, 215, 230), "Tesla", asList(220, 225));
    }


    private static List<Car> createCarList() {
        return Arrays.asList(new Car.Builder().withPrice(222222).withMark("Ferrari").build(),
                new Car.Builder().withPrice(33333).withMark("Ford").build(),
                new Car.Builder().withPrice(23232).withMark("Toyota").build());
    }

}




