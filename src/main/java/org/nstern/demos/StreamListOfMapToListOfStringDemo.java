package org.nstern.demos;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.nstern.demos.dto.MyDto;

public class StreamListOfMapToListOfStringDemo {

    public static void main(String[] args) {
        Map<String, MyDto> map1 = Map.of("dto1", new MyDto(1, "name1"), "dto2", new MyDto(2, "name2"));
        Map<String, MyDto> map2 = Map.of("dto3", new MyDto(3, "name3"), "dto4", new MyDto(4, "name4"));

        List<Map<String, MyDto>> list = List.of(map1, map2);


        Map<String, MyDto> result = list.stream()
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

}


