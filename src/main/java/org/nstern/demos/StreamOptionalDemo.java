package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.nstern.demos.dto.Car;

public class StreamOptionalDemo {

    public static void main(String[] args) {

        List<Car> carListWithOneElement = Collections.singletonList(
                new Car.Builder().withCode(1).withMark("Ferrari").withModel("GT8").build()
        );
        List<Car> carListWithTwoElements = List.of(
                new Car.Builder().withCode(1).withMark("Ferrari").withModel("GT8").build(),
                new Car.Builder().withCode(2).withMark("Ford").withModel("GT40").build()
        );

        List<Car> carListWithNoElement = Collections.emptyList();
        List<Car> carListNull = null;


        p("evaluating list with one element: ");
        Optional<Car> carOpt1 = carListWithOneElement.stream().findAny();
        if (carOpt1.isPresent()) {
            p("found one car : " + carOpt1.get() + " in list carListWithOnelement.");
        }

        p("evaluating list with two elements: ");
        carListWithTwoElements.stream().filter(x -> x.getMark().equals("Ford")).findAny()
                .ifPresent(y -> y.getMark().equals("Ford"));

        p("evaluating list with no element: ");
        Optional<Car> carOpt2 = carListWithNoElement.stream().findAny();
        if (carOpt2.isPresent()) {
            p("found one car : " + carOpt2.get());
        } else {
            p("found no car in carListWithNoElement");
        }

        p("evaluating carListNull: ");
        Optional<Car> carOpt3 = carListNull.stream().findAny();
        if (carOpt3.isPresent()) {
            p("found one car : " + carOpt3.get());
        } else {
            p("found no car in carListNull");
        }
    }

}
