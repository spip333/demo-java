package org.nstern.demos.app;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class StreamMapComputIfAbsentTest {

    @Test
    void testComputeIfAbsent(){
        Map<String, Integer> namesAge = new HashMap<>();
        namesAge.put("Pierre", 11);
        namesAge.put("Jacques", 22);
        namesAge.put("Jean", 3);

        namesAge.computeIfAbsent("jean", s -> 99);

        System.out.println(namesAge);

    }

}
