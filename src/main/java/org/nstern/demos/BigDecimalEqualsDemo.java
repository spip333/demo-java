package org.nstern.demos;

import java.math.BigDecimal;
import java.util.Map;

/**
 * https://www.baeldung.com/java-string-to-bigdecimal
 */
public class BigDecimalEqualsDemo {

    public static void main(String[] args) {

        Map<String, Boolean> map = Map.of(
                "BigDecimal.valueOf(1234.56)", BigDecimal.valueOf(1234.56).equals(BigDecimal.valueOf(1234.56))
/*
                "BigDecimal.valueOf(Double.valueOf(\"1234.56\"))",BigDecimal.valueOf(Double.valueOf("1234.56")),
                "new BigDecimal(\"1234.56\")", new BigDecimal("1234.56"),
                "BigDecimal.valueOf(1234)", BigDecimal.valueOf(1234),
                "BigDecimal.valueOf(Double.valueOf(\"1234\"))",BigDecimal.valueOf(Double.valueOf("1234")),
                "new BigDecimal(\"1234\")", new BigDecimal("1234")
*/
        );

        map.forEach((x, y) -> System.out.println(x + " : " + y));
    }
}
