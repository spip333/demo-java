package org.nstern.demos.app;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.nstern.demos.dto.MyDto;

public class StreamListOfSetsToListOfStringDemo {


    public static void main(String[] args) {
        Set<MyDto> set1 = initSet1();
        Set<MyDto> set2 = initSet2();
        set1.forEach(System.out::println);
        set2.forEach(System.out::println);

        List<Set<MyDto>> list = List.of(set1, set2);
        list.forEach(System.out::println);


        List<MyDto> result = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    private static Set<MyDto> initSet1() {
        MyDto dto1 = new MyDto();
        dto1.setId(1);
        dto1.setName("name1");
        MyDto dto2 = new MyDto();
        dto2.setId(2);
        dto2.setName("name2");
        MyDto dto3 = new MyDto();
        dto3.setId(3);
        dto3.setName("name3");

        return Set.of(dto1, dto2, dto3);
    }

    private static Set<MyDto> initSet2() {
        MyDto dto4 = new MyDto();
        dto4.setId(4);
        dto4.setName("name4");
        MyDto dto5 = new MyDto();
        dto5.setId(5);
        dto5.setName("name5");

        return Set.of(dto4, dto5);
    }
}


