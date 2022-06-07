package org.nstern.demos.app;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static org.nstern.demos.util.H.p;
import static org.nstern.demos.util.H.phead;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Car;

public class StreamMapDemo3 {


    public static void main(String[] args) {
        phead("Demo Stream map()");
        demo1();
        demo2();
        demo3();
        demo4();
        demo5();
        demo6();
    }

    private static void demo1() {
        phead("demo1");
        List<Car> list = createCarList();

        Map result = list
                .stream()
                .collect(groupingBy(car -> car.getMark(), toList()));
        p("" + result);
    }

    private static void demo2() {
        phead("demo2");
        List<Car> list = createCarList();

        List<String> result = list
                .stream()
                .map(Car::getMark)
                .collect(toList());
        p("" + result);
    }

    private static void demo3() {
        phead("demo3");
        List<Car> list = createCarList();

        AtomicInteger counter = new AtomicInteger();

        Map<Integer, String> result = list
                .stream()
                .collect(toMap(car -> counter.getAndIncrement(), Car::getMark));
        p("" + result);
    }

    private static void demo4() {
        phead("demo4");
        List<Car> list = createCarList();

        AtomicInteger counter = new AtomicInteger();

        Map<Integer, String> result = list
                .stream()
                .collect(toMap(car -> counter.getAndIncrement(), car -> car.getMark()));
        p("" + result);
    }

    private static void demo5() {
        phead("demo5");
        List<Car> list = createCarList();

        AtomicInteger counter = new AtomicInteger();

        Map<Integer, List<String>> result = list
                .stream()
                .collect(toMap(car -> counter.getAndIncrement(), car -> asList(car.getMark(), car.getModel())));
        p("" + result);
    }

    private static void demo6() {
        phead("demo6");
        List<Car> list = createCarList();

        List<Car> result = list
                .stream()
                .map(car -> car)
                .collect(Collectors.toList());
        p("" + result);
    }

    private static List<Car> createCarList() {
        return asList(new Car.Builder().withPrice(222222).withMark("Ferrari").withModel("California").build(),
                new Car.Builder().withPrice(30000).withMark("Ford").withModel("smax").build(),
                new Car.Builder().withPrice(25000).withMark("Ford").withModel("cmax").build(),
                new Car.Builder().withPrice(11000).withMark("Toyota").withModel("Aygo").build(),
                new Car.Builder().withPrice(32000).withMark("Toyota").withModel("Prius").build());
    }


}
