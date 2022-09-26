package org.nstern.demos;

import java.util.ArrayList;
import java.util.List;

public class RecursionDemo {
    public static void main(String[] args) {

        Baustein baustein = initBaustein();
        List<String> messages = check(baustein);

        messages.forEach(m -> System.out.println(m));

    }

    static List<String> check(Baustein b) {

        List<String> messages = new ArrayList<>();
        messages.add(b.name);
        if (!(b.children.isEmpty())) {

            for (Baustein x : b.children) {
                messages.addAll(check(x));
            }
        }
        return messages;
    }


    static Baustein initBaustein() {

        Baustein root = new Baustein("root");
        Baustein child1 = new Baustein("child1");
        Baustein child2 = new Baustein("child2");
        Baustein child3 = new Baustein("child3");

        child2.children = List.of(child3);
        child1.children = List.of(child2);
        root.children = List.of(child1);
        return root;
    }

}


class Baustein {
    String name;
    List<Baustein> children = new ArrayList<>();

    public Baustein() {
    }

    public Baustein(String name) {
        this.name = name;
    }
}

