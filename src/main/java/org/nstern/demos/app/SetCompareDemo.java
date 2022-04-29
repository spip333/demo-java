package org.nstern.demos.app;

import java.util.Set;

public class SetCompareDemo {

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,2,1);

        System.out.println(set1.containsAll(set2));
        System.out.println(set2.containsAll(set1));

        Set<Integer> set3 = Set.of(1,2,3);
        Set<Integer> set4 = Set.of(2,1);

        System.out.println(set3.containsAll(set4));
        System.out.println(set4.containsAll(set3));
    }
}
