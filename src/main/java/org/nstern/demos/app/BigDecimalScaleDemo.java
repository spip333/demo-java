package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.math.BigDecimal;

public class BigDecimalScaleDemo {

    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(1234.57);
        for (int i = 10; i >= 0; i--) {
            if (i != 0){
                p(""+bd1.setScale(i));
            } else {
                p(""+bd1.setScale(i, BigDecimal.ROUND_CEILING));
            }
        }
    }
}
