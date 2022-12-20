package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

import org.nstern.demos.dto.Car;

public class ListOfDtoContainsDemo {

    public static void main(String[] args) {

        List<Car> carList1 = createCarList();
        Car myCar = new Car.Builder().withMark("Ford").withModel("GT").build();

        if (carList1.contains(myCar)) {
            p(myCar.toString() + " is in list. See : " + carList1);
        }

        List<Car> carList2 = Arrays.asList(  new Car.Builder().withMark("Ferrari").withModel("GT8").build());

        if (!(carList2.contains(myCar))) {
            p(myCar.toString() + " is not in list. See: " + carList2);
        }


    }


    public static List<Car> createCarList(){
        List<Car> carList = Arrays.asList(new Car.Builder().withMark("Ford").withModel("GT").build());
        return carList;
    }
}




