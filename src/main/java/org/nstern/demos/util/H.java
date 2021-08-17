package org.nstern.demos.util;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

public class H {
    private static final String LINE = "---------------------------";

    public static void p(String s) {
        System.out.println("" + s);
    }

    public static void phead(String title) {

        int len = ((LINE.length() - title.length()) / 2) - 1;
        String titleMod = padStringCenter(title, len);

        pline();
        System.out.println(titleMod);
        pline();
    }

    private static String padStringCenter(String title, int len) {
        StringBuilder sb = new StringBuilder();
        sb.append('-');

        sb.append(" ".repeat(Math.max(0, len)));
        sb.append(title);
        sb.append(" ".repeat(Math.max(0, len)));
        sb.append('-');
        return sb.toString();
    }

    public static void pline() {
        System.out.println(LINE);
    }

    public static void p(Temporal t) {
        System.out.println(t);
    }

    public static void p(TemporalAccessor t) {
        System.out.println(t);
    }
}
