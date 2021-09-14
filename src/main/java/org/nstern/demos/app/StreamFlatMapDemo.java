package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;
import static org.nstern.demos.util.H.phead;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Car;

public class StreamFlatMapDemo {


    public static void main(String[] args) {
        phead("Demo Stream map()");

        demo1();
    }

    private static void demo1() {
        phead("demo1");
        List<Car> list = createCarList();
        List<String> result = list
                .stream()
                .map(Car::getMark)
                .collect(Collectors.toList());
        p("" + result);
    }

    private static List<Car> createCarList() {
        return Arrays.asList(new Car.Builder().withPrice(222222).withMark("Ferrari").build(),
                new Car.Builder().withPrice(33333).withMark("Ford").build(),
                new Car.Builder().withPrice(23232).withMark("Toyota").build());
    }



}
