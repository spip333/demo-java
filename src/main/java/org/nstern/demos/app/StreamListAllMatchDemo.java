package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

public class StreamListAllMatchDemo {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("pierre", "jacques", "jean");
        List<String> list2 = Arrays.asList("pierre", "jean");

        p(""+list2.stream().allMatch(x -> list1.contains(x)));
    }

}
