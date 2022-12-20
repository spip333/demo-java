package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListRemoveDemo {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("pierre", "jacques", "jean");
        List<String> list2 = Arrays.asList("pierre", "jacques");
        p("List 1: " + list1);
        p("List 2: " + list2);

        List<String> result = list1.stream().filter(x -> !(list2.contains(x))).collect (Collectors.toList());

        list2.containsAll(list1);

        p("List 1: " + list1);
        p("List 2: " + list2);
        p("result: " + result);



    }
}
