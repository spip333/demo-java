package org.nstern.demos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PadStringDemo {

    private static final Logger log = LoggerFactory.getLogger(PadStringDemo.class);

    public static void main(String[] args) {
        log.info(padStringCenter("This is the Title", 1));
        log.info(padStringCenter("This is the Title", 5));
        log.info(padStringCenter("This is the Title", 10));
        log.info(padStringCenter("This is the Title", 20));
    }

    private static String padStringCenter(String title, int len) {

        return  "==="
                + " ".repeat(Math.max(0, len))
                + title
                + " ".repeat(Math.max(0, len))
                + "===";
    }

}
