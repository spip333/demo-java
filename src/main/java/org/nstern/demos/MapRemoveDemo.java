package org.nstern.demos;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Andy", "hello");
        map.put("Bernie", "hi");


        System.out.println(map);

        map.remove("Andy");

        System.out.println(map);

        map.remove("xx");

        System.out.println(map);

    }
}
