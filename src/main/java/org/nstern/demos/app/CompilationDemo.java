package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

/* WON'T COMPILE
public class TestIfICompile{
    public static void main(String[] args) {
        p("running");
    }
}
*/

/**
 * This file will compile even though it has a different name than the class. Wouldn't compile if it were public.
 */
class TestIfICompile {
    //
    public static void main(String[] args) {
        p("running");
    }
}
