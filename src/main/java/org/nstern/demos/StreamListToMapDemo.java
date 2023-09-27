package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Car;

public class StreamListToMapDemo {

    public static void main(String[] args) {


        List<String> list = List.of("Tesla", "Ford", "Toyota");
        Map<String, Car> result1 = new HashMap<>();
        list.forEach(mark -> result1.put(mark, new Car.Builder().withMark(mark).build()));
        p(String.valueOf(result1));

        Map<String, Car> result2 = list.stream().collect(Collectors.toMap(mark -> mark, mark -> new Car.Builder().withMark(mark).build()));

        p(String.valueOf(result2));

    }

}
