package org.nstern.demos.app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Car;

public class StreamCollectToMapDemo1 {

    public static void main(String[] args) {

        List<Car> carList = List.of(
                new Car.Builder().withCode(1).withMark("Ferrari").withModel("GT8").isFun(true).build(),
                new Car.Builder().withCode(2).withMark("Chevrolet").withModel("Corvette").isFun(true).build(),
                new Car.Builder().withCode(3).withMark("Ford").withModel("cmax").isFun(false).build());

        Map<String, Boolean> cars = carList.stream()
                .collect(Collectors.toMap(Car::getMark, Car::isFun, (car1, car2) -> {return car1;}));

        System.out.println(cars);

        Map<String, Boolean> funCars = cars.entrySet()
                .stream()
                .filter(v -> v.getValue().equals(true))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(funCars);


    }
}




