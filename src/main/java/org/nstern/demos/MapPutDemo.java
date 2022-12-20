package org.nstern.demos;

import static java.util.stream.Collectors.toMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapPutDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Andy", "hello");
        map.put("Bernie", "hi");
        map.put("Claus", "how");
        map.put("Dieter", "are");
        map.put("Ben", "you");
        map.put("Clint", "doing?");

        System.out.println(map);
        map.put("Andy", "world");
        System.out.println(map);
        map.put("Andy", null);


    }
}
