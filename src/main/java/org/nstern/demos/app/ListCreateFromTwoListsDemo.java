package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

public class ListCreateFromTwoListsDemo {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("pierre", "jacques", "jean");
        List<String> list2 = Arrays.asList("pierre", "jacques");


        p("List 1: " + list1);
        p("List 2: " + list2);

    }
}
