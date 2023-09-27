package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

import org.nstern.demos.dto.Car;

public class StreamListFilterCountDemo {

    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(new Car.Builder().withMark("Ford").build(), new Car.Builder().withMark("Fiat").build(),
                new Car.Builder().withMark("Audi").build());

        p("=> " + carList.stream().filter(car -> car.getMark().equals("Fiat") || car.getMark().equals("Audi")).count());
        p("=> " + (carList.stream().filter(car -> car.getMark().equals("Fiat")).count() == 2));

    }

}
