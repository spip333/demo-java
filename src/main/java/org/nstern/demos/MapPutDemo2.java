package org.nstern.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapPutDemo2 {

    public static void main(String[] args) {

        Map<Person, Feature> map = new HashMap<>();
        map.put(new Person("Andy"), new Feature("Andy", "test"));
        map.put(new Person("Bernie"), new Feature("Andy", "code"));
        map.put(new Person("Claus"), new Feature("Claus", "moderate"));
        map.put(new Person("Dieter"), new Feature("Clint", "test"));
        map.put(new Person("Ben"), new Feature("Ben", "code"));
        map.put(new Person("Clint"), new Feature("Clint", "moderate"));
        System.out.println(map);

        Map<String, String> newMap = map.values().stream() //
                .filter(v -> v.name.startsWith("B") || v.name.startsWith("C"))
                .collect(Collectors.toMap(Feature::getName, Feature::getDescription));
        System.out.println(newMap);


    }
}

class Person {
    String name;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    String lastName;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.lastName = lastName;
        this.name = name;
    }

}

class Feature {

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    String name;
    String description;

    public Feature() {
    }

    public Feature(String name) {
        this.name = name;
    }

    public Feature(String name, String description) {
        this.description = description;
        this.name = name;
    }

}
