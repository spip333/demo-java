package org.nstern.demos.app;

import java.math.BigDecimal;

public class BigDecimalArithmeticDemo {

    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(1);
        BigDecimal bd2 = BigDecimal.valueOf(2);

        BigDecimal sum = bd1.add(bd2);

        sum = sum.add(BigDecimal.TEN);
        System.out.println(sum);

        BigDecimal bd = BigDecimal.ZERO;

        for (int i = 0; i< 10; i++){
            System.out.println(bd.add(BigDecimal.valueOf(i)));

        }

    }
}
