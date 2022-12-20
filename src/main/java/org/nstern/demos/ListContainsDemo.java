package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.List;

public class ListContainsDemo {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 5);
        if (integerList.contains(1)) {
            p("1 is in list : " + integerList);
        }

        if (integerList.contains(4)) {
            p("4 is in list : " + integerList);
        } else {
            p("4 is not in list : " + integerList);
        }

        List<String> stringList = List.of("info.super", "info.top", "info.genial");

        if (stringList.contains("info")) {
            p("info is in list : " + stringList);
        } else {
            p("info is not in list : " + stringList);
        }

        if (stringList.contains("info.super")) {
            p("info.super is in list : " + stringList);
        } else {
            p("info.super is not in list : " + stringList);
        }


    }
}

