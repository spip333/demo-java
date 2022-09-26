package org.nstern.demos.app;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.nstern.demos.dto.MyDto;

public class StreamFlatmapDemo {


    public static void main(String[] args) {

        List<MyDto> list1 = Arrays.asList(new MyDto(1, "name1"), new MyDto(2, "name2"));
        List<MyDto> list2 = Arrays.asList(new MyDto(3, "name3"), new MyDto(4, "name4"));
        List<List<MyDto>> list = List.of(list1, list2);

        list.forEach(System.out::println);

        List<MyDto> result = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

 }


