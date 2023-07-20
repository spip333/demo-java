package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamForEachFilterDemo {

    public static void main(String[] args) {

        Map<List<Number>, String> map = Map.of(List.of(1, 11), "a", List.of(2, 22), "b", List.of(3, 33), "c");

        map.forEach((key, val) -> System.out.println("key : " + key + " - val : " + val));

        LinkedHashMap<List<Number>, String> map1 = new LinkedHashMap<>();
        map1.put(List.of(1, 11), "a");
        map1.put(List.of(2, 22), "b");
        map1.put(List.of(3, 33), "c");
        map1.forEach((key, val) -> System.out.println("key : " + key + " - val : " + val));




    }

}
