package org.nstern.demos;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfListFlattenDemo {


    public static void main(String[] args) {

        MapOfListFlattenDemo demo = new MapOfListFlattenDemo();

        var myMap = Map.of(1, List.of(1,2,3,4,5));
        myMap.put(2, List.of(11,22,33));
        demo.doIt(myMap);


    }

    public void doIt(Map<Integer, List<Integer>> map) {
        var x = map.values().stream().collect(Collectors.toList());
        System.out.println(x);


    }

}
