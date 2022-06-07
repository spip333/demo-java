package org.nstern.demos.app;

import java.util.Set;

public class SetContainsDemo {

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3);

        System.out.println(set1.contains(1));
        System.out.println(set1.contains(999));
    }
}
