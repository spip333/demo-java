package org.nstern.demos;

import org.apache.commons.lang3.tuple.Pair;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapOfGenericsDemo {

    public static void main(String[] args) {

        Map<String, Number> map = new HashMap<>();

        map.put("BigDecimal", BigDecimal.valueOf(111));

        Pair<Number, Number> map = new HashMap<>();

        map.put("BigDecimal", BigDecimal.valueOf(111));
    }
}
