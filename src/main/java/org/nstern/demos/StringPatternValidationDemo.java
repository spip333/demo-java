package org.nstern.demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternValidationDemo {

    public static boolean check(Pattern p, String s) {

        Matcher m = p.matcher(s);
        if (m.matches()) {
            return true;
        }
        return false;
    }


}
