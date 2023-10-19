package org.nstern.demos.util;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

public class H {

    public static void p(String s) {
        System.out.println("" + s);
    }

    public static void p(Temporal t) {
        System.out.println(t);
    }

    public static void p(TemporalAccessor t) {
        System.out.println(t);
    }
}
