package org.nstern.demos;

import java.util.HashSet;
import java.util.Set;

public class SetAddDemo {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        set1.add(3);
        System.out.println(set1);
        set1.add(1);
        System.out.println(set1);
    }
}
