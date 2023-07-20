package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.math.BigDecimal;
import java.util.Map;

/**
 * https://www.baeldung.com/java-string-to-bigdecimal
 */
public class BigDecimalParseDemo {

    public static void main(String[] args) {

        Map<String, BigDecimal> map = Map.of(
                "BigDecimal.valueOf(1234.56)", BigDecimal.valueOf(1234.56),
                "BigDecimal.valueOf(Double.valueOf(\"1234.56\"))",BigDecimal.valueOf(Double.valueOf("1234.56")),
                "new BigDecimal(\"1234.56\")", new BigDecimal("1234.56"),
                "BigDecimal.valueOf(1234)", BigDecimal.valueOf(1234),
                "BigDecimal.valueOf(Double.valueOf(\"1234\"))",BigDecimal.valueOf(Double.valueOf("1234")),
                "new BigDecimal(\"1234\")", new BigDecimal("1234")
        );

        map.forEach((x, y) -> System.out.println(x + " : " + y));
    }
}
