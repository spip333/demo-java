package org.nstern.demos;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Car;

public class StreamCollectToMapDemo2 {

    public static void main(String[] args) {

        List<Car> carList = List.of(
                new Car.Builder().withCode(1).withMark("Ferrari").withModel("GT8").isFun(true).build(),
                new Car.Builder().withCode(2).withMark("Chevrolet").withModel("Corvette").isFun(true).build(),
                new Car.Builder().withCode(3).withMark("Ford").withModel("cmax").isFun(false).build());

        Map<String, Car> cars = carList.stream().collect(Collectors.toMap(car -> car.getMark(), Function.identity()));

        cars.forEach((i, j) -> System.out.println(i + " : " + j));
    }
}




