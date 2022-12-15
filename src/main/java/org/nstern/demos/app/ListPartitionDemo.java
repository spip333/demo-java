package org.nstern.demos.app;

import java.util.List;

import com.google.common.collect.*;

public class ListPartitionDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var x = Lists.partition(list, 3);
        System.out.println(x);
    }

}
