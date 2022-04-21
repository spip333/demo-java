package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;
import static org.nstern.demos.util.H.phead;

import java.util.ArrayList;
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
        Car car = new Car();
        car.setModel("gt");
        car.setPrice(222);
        list.add(car);
        List<String> result = list
                .stream()
                .map(Car::getMark)
                .collect(Collectors.toList());
        p("" + result);
    }

    private static List<Car> createCarList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car.Builder().withPrice(1111).withMark("Toyota").build());
        list.add(new Car.Builder().withPrice(22222).withMark("Ford").build());
        list.add(new Car.Builder().withPrice(333333).withMark("Ferrari").build());
        return list;
    }



}
