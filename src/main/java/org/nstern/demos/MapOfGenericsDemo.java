package org.nstern.demos;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapOfGenericsDemo {

    public static void main(String[] args) {

        Map<String, Number> mapStrNum = new HashMap<>();

        mapStrNum.put("BigDecimal", BigDecimal.valueOf(111));

    }
}
