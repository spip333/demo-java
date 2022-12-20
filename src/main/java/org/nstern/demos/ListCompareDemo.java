package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

public class ListCompareDemo {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("pierre", "jacques", "jean");
        List<String> list2 = Arrays.asList("pierre", "jacques");
        p("List 1: " + list1);
        p("List 2: " + list2);
        p("Does list 1 contains all elements in list 2 ? " + list1.containsAll(list2));
        p("Does list 2 contains all elements in list 1 ? " + list2.containsAll(list1));

    }
}
