package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Collections;
import java.util.List;

import org.nstern.demos.dto.Car;


public class StreamOrElseThrowDemo {

    public static void main(String[] args) {
        StreamOrElseThrowDemo main = new StreamOrElseThrowDemo();

        List<Car> carListEmpty = Collections.emptyList();
        List<Car> carListNotEmpty = List.of(
                new Car.Builder().withMark("ford").withModel("mustang").build(),
                new Car.Builder().withMark("ford").withModel("cmax").build());

        p("list not empty ...");

        try {
            p(main.doIt(carListNotEmpty));
        } catch (Exception e) {
            p("" + e.getMessage());
        }

        p("list empty ...");

        try {
            p(main.doIt(carListEmpty));
        } catch (Exception e) {
            p("" + e);
        }

    }

    public String doIt(List<Car> carList) {
        carList.stream().findFirst().orElseThrow(RuntimeException::new);
        return "no exception found for " + carList;
    }

}
