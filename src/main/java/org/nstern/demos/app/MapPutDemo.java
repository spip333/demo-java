package org.nstern.demos.app;

import java.util.HashMap;
import java.util.Map;

public class MapPutDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Andy", "hello");
        map.put("Bernie", "hi");
        System.out.println(map);
        map.put("Andy", "world");
        System.out.println(map);
    }
}
