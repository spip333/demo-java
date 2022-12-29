package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListRemoveIfDemo {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("pierre");
        list1.add("jacques");
        list1.add("jean");

        p("List before : " + list1);

        list1.removeIf(e -> e.equals("jean"));

        p("List after 1st removal: " + list1);

        list1.removeIf(e -> e.equals("jean"));

        p("List after 2nd removal: " + list1);

    }
}
