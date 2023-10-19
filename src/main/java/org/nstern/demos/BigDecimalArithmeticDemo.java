package org.nstern.demos;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigDecimalArithmeticDemo {

    private static final Logger log = LoggerFactory.getLogger(BigDecimalArithmeticDemo.class);

    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(1);
        BigDecimal bd2 = BigDecimal.valueOf(2);

        BigDecimal sum = bd1.add(bd2);

        sum = sum.add(BigDecimal.TEN);
        if (log.isInfoEnabled()) {
            log.info(sum.toString());
        }

        BigDecimal bd = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {

            if (log.isInfoEnabled()) {
                log.info(bd.add(BigDecimal.valueOf(i)).toString());
            }
        }

    }
}
