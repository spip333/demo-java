package org.nstern.demos.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListAndLambdaDemo {


    public static void main(String[] args) {
        List<MyDto> list = initList();
        boolean result1 = list.stream().map(MyDto :: getId).collect(Collectors.toList()).contains(2);
        System.out.println(result1);
        boolean result2 = list.stream().map(MyDto :: getId).collect(Collectors.toList()).contains(22);
        System.out.println(result2);
    }

    private static List<MyDto> initList() {
        MyDto dto1 = new MyDto();
        dto1.setId(1);
        dto1.setName("name1");
        MyDto dto2 = new MyDto();
        dto2.setId(2);
        dto2.setName("name2");
        MyDto dto3 = new MyDto();
        dto3.setId(3);
        dto3.setName("name3");

        return Arrays.asList(dto1, dto2, dto3);
    }
}


class MyDto {
    int id;
    String name;
    String description;
    float value;
    List<MyDto> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setChildren(List<MyDto> children) {
        this.children = children;
    }

    public List<MyDto> getChildren() {
        return children;
    }
}

