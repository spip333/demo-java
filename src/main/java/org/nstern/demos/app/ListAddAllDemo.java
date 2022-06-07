package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAddAllDemo {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("pierre", "jacques", "jean");
        List<String> list2 = Arrays.asList("jean", "joseph", "andré");

        p(""+list1);
        p(""+list2);
        List<String> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);

        p(""+list);

    }
}
