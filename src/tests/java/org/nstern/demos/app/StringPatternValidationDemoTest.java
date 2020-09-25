package org.nstern.demos.app;

import static java.util.regex.Pattern.compile;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class StringPatternValidationDemoTest {

    @Test
    void testPatternMatches() {
        Pattern p1 = compile("\\d\\d\\d");
        String s1 = "111";
        String s2 = "aaa";

        assertTrue(StringPatternValidationDemo.check(p1, s1));
        assertFalse(StringPatternValidationDemo.check(p1, s2));

        Pattern p2 = compile("\\d+");

        assertTrue(StringPatternValidationDemo.check(p2, s1));
        assertFalse(StringPatternValidationDemo.check(p2, s2));

        Pattern p3 = compile("\\d+");

        assertTrue(StringPatternValidationDemo.check(p2, s1));
        assertFalse(StringPatternValidationDemo.check(p2, s2));
    }

}