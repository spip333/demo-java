package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

public class ListContainsDemo {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 5);
        if (integerList.contains(1)) {
            p("1 is in list : " + integerList);
        }

        if (integerList.contains(4)) {
            p("4 is in list : " + integerList);
        } else {
            p("4 is not in list : " + integerList);
        }


    }
}




