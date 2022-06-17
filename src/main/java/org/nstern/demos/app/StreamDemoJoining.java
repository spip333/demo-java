package org.nstern.demos.app;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemoJoining {

    public static void main(String[] args) {
        Set<Integer> mySet = Set.of(1000, 1001, 1002, 1003);
        // code is equivalent to :
        // mySet.stream().map(el -> String.valueOf(el)).collect(Collectors.joining(","));
        String s1 = mySet.stream().map(String::valueOf).collect(Collectors.joining(", "));
       System.out.println(s1);

        List<String> stringList = List.of("Pierre", "Jacques", "Jean");
        // code is equivalent to :
        // String.join(", ", stringList)
        String s2 = stringList.stream().collect(Collectors.joining(", "));
        System.out.println(s2);
        String s3 = String.join(", ", stringList);
        System.out.println(s3);
    }
}
