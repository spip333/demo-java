package org.nstern.demos.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListEqualsTest {

    @Test
    void should_be_equals() {
        // given
        List<String> list1 = Arrays.asList("Bern", "Basel");
        List<String> list2 = Arrays.asList("Bern", "Basel");

        // then
        assertEquals(list1, list2);

    }

    @Test
    void should_not_be_equal_1() {
        // given
        List<String> list1 = Arrays.asList("Bern", "Basel");
        List<String> list2 = Arrays.asList("Bern", "Fribourg");

        // then
        assertNotEquals(list1, list2);

    }

    @Test
    void should_not_be_equal_2() {
        // given
        List<String> list1 = Arrays.asList("Bern", "Basel");
        List<String> list2 = Arrays.asList("Basel", "Bern");

        // then
        assertNotEquals(list1, list2);

    }
}
