package org.nstern.demos;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.nstern.demos.dto.MyDto;

public class StreamListOfSetsToListOfStringDemo {

    public static void main(String[] args) {
        Set<MyDto> set1 = Set.of(new MyDto(1, "name1"), new MyDto(2, "name2"));
        Set<MyDto> set2 = Set.of(new MyDto(3, "name3"), new MyDto(4, "name4"));
        set1.forEach(System.out::println);
        set2.forEach(System.out::println);

        List<Set<MyDto>> list = List.of(set1, set2);
        list.forEach(System.out::println);

        List<MyDto> result = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

}


