package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.nstern.demos.dto.Car;

public class ListImmutableDemo {
    private static final List<Car> carList1 = createCarList();
    private static final List<Car> carList2 = Collections.unmodifiableList(createCarList());
    private static final List<Car> carList3 = Collections.unmodifiableList(createCarList());

    public static void main(String[] args) {

        p("normal List");

        p("before - " + carList1);
        Car myCar1 = carList1.get(1);
        myCar1.setCode(99);
        p("after - " + carList1);

        List<Car> carList = new ArrayList<>();
        final Car myCar = new Car.Builder().withCode(6).withMark("Ford").withModel("GT").build();
        carList.add(myCar);

        p("before - " + carList);
        Car myOtherCar1 = carList.get(0);
        myCar.setCode(99);
        p("after - " + carList);

        p("Collections.unmodifiableList");
        p("before - " + carList2);
        Car myCar2 = carList2.get(1);
        myCar2.setCode(99);
        p("after - " + carList2);

        p("ListUtils.unmodifiableList");
        p("before - " + carList2);
        Car myCar3 = carList3.get(1);
        myCar3.setCode(99);
        p("after - " + carList3);

        if (carList3.contains(null)) {
            p("=>");
        }

    }

    public static List<Car> createCarList() {

        return Arrays.asList(
                new Car.Builder().withCode(1).withMark("Ferrari").withModel("GT8").build(),
                new Car.Builder().withCode(2).withMark("Chevrolet").withModel("Corvette").build(),
                new Car.Builder().withCode(3).withMark("Ford").withModel("GT").build(),
                new Car.Builder().withCode(4).withMark("Volkswagen").withModel("Golf").build(),
                new Car.Builder().withCode(5).withMark("Renault").withModel("Espace").build()
        );
    }
}




