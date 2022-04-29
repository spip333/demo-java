package org.nstern.demos.app;

import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemoJoining {

    public static void main(String[] args) {
        Set<Integer> mySet = Set.of(1000, 1001, 1002, 1003);

        String s1 = mySet.stream().map(String::valueOf).collect(Collectors.joining(","));

        // code above is equivalent to
        // mySet.stream().map(el -> String.valueOf(el)).collect(Collectors.joining(","));

        System.out.println(s1);
    }
}