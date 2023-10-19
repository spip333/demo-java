package org.nstern.demos;

import java.math.BigDecimal;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://www.baeldung.com/java-string-to-bigdecimal
 */
public class BigDecimalParseDemo {

    private static final Logger log = LoggerFactory.getLogger(BigDecimalParseDemo.class);

    public static void main(String[] args) {

        Map<String, BigDecimal> map = Map.of(
                "BigDecimal.valueOf(1234.56)", BigDecimal.valueOf(1234.56),
                "BigDecimal.valueOf(Double.valueOf(\"1234.56\"))",BigDecimal.valueOf(Double.valueOf("1234.56")),
                "new BigDecimal(\"1234.56\")", new BigDecimal("1234.56"),
                "BigDecimal.valueOf(1234)", BigDecimal.valueOf(1234),
                "BigDecimal.valueOf(Double.valueOf(\"1234\"))",BigDecimal.valueOf(Double.valueOf("1234")),
                "new BigDecimal(\"1234\")", new BigDecimal("1234")
        );

        map.forEach((x, y) -> log.info(x + " : " + y));
    }
}
