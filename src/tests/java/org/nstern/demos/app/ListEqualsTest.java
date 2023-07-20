package org.nstern.demos.app;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListEqualsTest {

    @Test
    void should_be_equals() {
        // given
        List<String> list1 = Arrays.asList("Bern", "Basel");
        List<String> list2 = Arrays.asList("Bern", "Basel");

        // then
        Assertions.assertEquals(list1, list2);
    }

    @Test
    void should_not_be_equal_1() {
        // given
        List<String> list1 = Arrays.asList("Bern", "Basel");
        List<String> list2 = Arrays.asList("Bern", "Fribourg");

        // then
        Assertions.assertNotEquals(list1, list2);

    }

    @Test
    void should_not_be_equal_2() {
        // given
        List<String> list1 = Arrays.asList("Bern", "Basel");
        List<String> list2 = Arrays.asList("Basel", "Bern");

        // then
        Assertions.assertNotEquals(list1, list2);

    }
}
