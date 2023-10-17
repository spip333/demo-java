package org.nstern.demos;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;
import static org.nstern.demos.util.H.p;
import static org.nstern.demos.util.H.phead;

import java.util.List;

import org.nstern.demos.dto.Car;

public class StreamFindDemo {


    public static void main(String[] args) {
        demo1();
    }
    private static void demo1() {
        phead("demo1");
        List<Car> carList = createCarList();
        var result = carList.stream().filter(car -> car.getModel().equals("cmax")).findFirst().get();

        p(""+result);
    }

    private static List<Car> createCarList() {
        return asList(new Car.Builder().withPrice(222222).withMark("Ferrari").withModel("California").build(),
                new Car.Builder().withPrice(30000).withMark("Ford").withModel("smax").build(),
                new Car.Builder().withPrice(25000).withMark("Ford").withModel("cmax").build(),
                new Car.Builder().withPrice(11000).withMark("Toyota").withModel("Aygo").build(),
                new Car.Builder().withPrice(32000).withMark("Toyota").withModel("Prius").build());
    }
}
