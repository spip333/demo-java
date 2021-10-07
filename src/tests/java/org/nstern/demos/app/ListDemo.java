package org.nstern.demos.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list1 = Collections.singletonList("aaa");
        List<String> list2 = Arrays.asList("aaa");
        List<String> list3 = List.of("aaa");

        String[] arr = {"aaa"};
        List<String> list4 = new ArrayList(Arrays.asList(arr));

        // won't run
//        list1.add("bbb");

        // won't run
//        list2.add("bbb");

        // won't run
//        list3.add("bbb");


        list4.add("bbb");



        System.out.println();
    }
}
